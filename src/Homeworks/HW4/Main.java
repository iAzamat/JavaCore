package Homeworks.HW4;


import Homeworks.HW4.Exceptions.AmountException;
import Homeworks.HW4.Exceptions.CustomerException;
import Homeworks.HW4.Exceptions.ProductException;
import Homeworks.HW4.Exceptions.TooMuchSaleException;

import java.util.ArrayList;
import java.util.List;

import static Homeworks.HW4.RandomPurchase.getProductRandomDiscount;
import static Homeworks.HW4.RandomPurchase.makeRandomPurchase;

public class Main {


    public static void main(String[] args) {
        List<Customer> customers = createCustomers();
        List<Product> products = createProducts();
        List<Order> orders = new ArrayList<>();

        int maxCountOrders = 5;
        int countFailPurchase = 0;

        for (int i = 0; i < maxCountOrders; i++) {
            try {
                Order order = makeRandomPurchase(customers, products);
                addOrder(orders, order);
            } catch (CustomerException | ProductException | AmountException e) {
                System.out.println(e.getMessage());
                countFailPurchase++;
            }
        }
        System.out.println("Количество совершенных покупок: " + orders.size());
        System.out.println("Количество отклоненных покупок: " + countFailPurchase);
    }


    public static List<Customer> createCustomers() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Иван", "Петров", 25, "+79604563333", Gender.MALE));
        customers.add(new Customer("Мария", "Сидорова", 30, "+79604563312", Gender.FEMALE));
        return customers;
    }

    public static List<Product> createProducts() {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Молоко", 100.5, Category.NORMAL));
        products.add(getProductRandomDiscount(new Product("Хлеб", 205.0, Category.NORMAL)));
        products.add(getProductRandomDiscount(new Product("Шоколад", 250.0, Category.NORMAL)));
        products.add(getProductRandomDiscount(new Product("Чай", 400.0, Category.PREMIUM)));
        products.add(getProductRandomDiscount(new Product("Мясо", 500.0, Category.PREMIUM)));

        return products;
    }

    public static void addOrder(List<Order> orders, Order order) {
        orders.add(order);
        System.out.printf("Добавлен заказ № %d:\n%s\n", orders.size(), order);
    }

    public static Order makePurchase(Customer customer, Product product, int quantity)
            throws CustomerException, ProductException, AmountException {
        Validator.validateCustomer(customer);
        Validator.validateProduct(product);
        Validator.validateQuantity(quantity);

        return new Order(customer, product, quantity);
    }
}
