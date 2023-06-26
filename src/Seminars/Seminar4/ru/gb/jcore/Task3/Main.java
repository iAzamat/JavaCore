package Seminars.Seminar4.ru.gb.jcore.Task3;


public class Main {
    static Customer[] customers = null;
    static Product[] products = null;


    public static void main(String[] args) {
        customers = new Customer[]{
                new Customer("Ivan", "Semenov", 25, "+79604563333"),
                new Customer("Petr", "Kozlov", 32, "+79604563312"),
                new Customer("Ivan", "Ivanov", 23, "+79604563311")};

        products = new Product[]{
                new Product("Milk", 100.5f),
                new Product("Bread", 70.8f),
                new Product("Meat", 1000),
                new Product("Chocolate", 225.6f),
                new Product("Tea", 300)};

        Order[] orders = new Order[5];
        String[] phones = {"+79604563333", "+79604563312", "+79604563311", "+79604564232", "+79604564444"};
        String[] productTitles = {"Milk", "Water", "Meat", "Tea", "Chocolate"};
        int[] amounts = {4, 5, 101, 0, -1};

        int count = 0;
        for (int i = 0; i < orders.length; i++) {
            try {
                orders[i] = makePurchase(phones[i], productTitles[i], amounts[i]);
                System.out.printf("Заказ № %d. Покупатель: %s, продукт: %s, количество: %d, успешно исполнен\n", i + 1, phones[i], productTitles[i], amounts[i]);
                count++;
            } catch (ProductException e) {
                System.out.printf("Заказ № %d. Покупатель: %s, продукт: %s, количество: %d, не был исполнен. Товар не найден\n", i + 1, phones[i], productTitles[i], amounts[i]);
                System.out.println(i + " " + e.getMessage());
            } catch (AmountException e) {
                orders[i] = makePurchase(phones[i], productTitles[i], 1);
                System.out.printf("Заказ № %d. Покупатель: %s, продукт: %s, количество: %d, был исправлен и успешно выполнен\n", i + 1, phones[i], productTitles[i], amounts[i]);
                count++;
            } catch (CustomerException e) {
                System.out.printf("Заказ № %d. Покупатель: %s, продукт: %s, количество: %d, не был исполнен. Неверный номер телефона\n", i + 1, phones[i], productTitles[i], amounts[i]);
                System.out.println(i + " " + e.getMessage());
            }
        }

        System.out.println("Количество совершенных покупок: " + count);

    }

    public static Order makePurchase(String phone, String title, int amount) throws CustomerException, ProductException, AmountException {
        Customer customer = null;
        Product product = null;
        for (Customer cust : customers) {
            if (cust.getPhone().equals(phone)) {
                customer = cust;
            }
        }

        for (Product p : products) {
            if (p.getTitle().equals(title)) {
                product = p;
            }
        }

        if (customer == null) {
            throw new CustomerException("Customer not found");
        }

        if (product == null) {
            throw new ProductException("Product not found");
        }

        if (amount > 100 || amount < 1) {
            throw new AmountException("Amount is not correct");
        }

        return new Order(customer, product, amount);
    }
}
