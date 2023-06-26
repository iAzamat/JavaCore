package Homeworks.HW4;

import Homeworks.HW4.Exceptions.AmountException;
import Homeworks.HW4.Exceptions.CustomerException;
import Homeworks.HW4.Exceptions.ProductException;

public class Validator {

    private static final int MAX_QUANTITY = 100;
    private static final String CUSTOMER_NOT_FOUND_MSG = "Несуществующий покупатель";
    private static final String PRODUCT_NOT_FOUND_MSG = "Несуществующий товар";
    private static final String INVALID_QUANTITY_MSG = "Некорректное количество товара: ";
    private static final String INVALID_QUANTITY_EMPTY_MSG = "Товар закончился";

    public static void validateCustomer(Customer customer) throws CustomerException {
        if (customer == null) {
            throw new CustomerException(CUSTOMER_NOT_FOUND_MSG);
        }
    }

    public static void validateProduct(Product product) throws ProductException {
        if (product == null) {
            throw new ProductException(PRODUCT_NOT_FOUND_MSG);
        }
    }

    public static void validateQuantity(int quantity) throws AmountException {
        if (quantity < 0 || quantity > MAX_QUANTITY) {
            throw new AmountException(INVALID_QUANTITY_MSG + quantity);
        } else if (quantity == 0) {
            throw new AmountException(INVALID_QUANTITY_EMPTY_MSG);
        }
    }
}
