package Homeworks.HW4;

public class Order {
    private Customer customer;
    private Product product;
    private int amount;

    private double totalPrice;

    public Order(Customer customer, Product product, int amount) {
        this.customer = customer;
        this.product = product;
        this.amount = amount;
        calculateTotalPrice();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("Покупатель не может быть null");
        } else {
            this.customer = customer;
        }
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Продукт не может быть null");
        } else {
            this.product = product;
        }
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount <= 0 || amount > 100) {
            throw new IllegalArgumentException("Количество не может быть отрицательным или больше 100");
        } else {
            this.amount = amount;
            calculateTotalPrice();
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    private void calculateTotalPrice() {
        double discountedPrice = product.getPrice() * (1 - product.getDiscountSize().getDiscountValue());
        totalPrice = this.amount * discountedPrice;
    }

    @Override
    public String toString() {
        return
                ""+customer + '\n' +
                "   Продукт: " + product + '\n' +
                "   Количество: " + amount + '\n' +
                "   Цена итого: " + totalPrice + '\n';
    }
}
