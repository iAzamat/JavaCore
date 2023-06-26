package Homeworks.HW4;

import Homeworks.HW4.Exceptions.AmountException;
import Homeworks.HW4.Exceptions.CustomerException;
import Homeworks.HW4.Exceptions.ProductException;

import java.util.List;
import java.util.Random;

import static Homeworks.HW4.Main.makePurchase;

public class RandomPurchase {
    private static final int RANDOM_QUANTITY_BOUND = 5;

    private static <T> T getRandomElement(List<T> list) {
        Random random = new Random();
        int randomIndex = random.nextInt(list.size());
        return list.get(randomIndex);
    }

    private static int getRandomQuantity() {
        Random random = new Random();
        return random.nextInt(RANDOM_QUANTITY_BOUND) - 1;
    }

    public static Order makeRandomPurchase(List<Customer> customers, List<Product> products)
            throws CustomerException, ProductException, AmountException {
        Customer randomCustomer = getRandomElement(customers);
        Product randomProduct = getRandomElement(products);
        int randomQuantity = getRandomQuantity();

        return makePurchase(randomCustomer, randomProduct, randomQuantity);
    }

    public static Product getProductRandomDiscount(Product product) {
        try {
            Validator.validateProduct(product);
        } catch (ProductException e) {
            System.out.println(e.getMessage());
        }
        product.assignRandomDiscount();
        return product;
    }
}
