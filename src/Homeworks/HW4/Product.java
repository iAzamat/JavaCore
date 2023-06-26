package Homeworks.HW4;

import Homeworks.HW4.Exceptions.TooMuchSaleException;

import java.util.Random;

public class Product {
    private String title;
    private double price;
    private Category category;
    private DiscountSize discountSize;

    public Product(String title, double price, Category category) {
        this.title = title;
        this.price = price;
        this.category = category;
        this.discountSize = DiscountSize.NO_DISCOUNT;
    }

    public void assignRandomDiscount() {
        Random random = new Random();
        DiscountSize[] discounts = DiscountSize.values();
        int index = random.nextInt(discounts.length);
        DiscountSize randomDiscount = discounts[index];

        try {
            setDiscountSize(randomDiscount);
        } catch (TooMuchSaleException e) {
            System.out.println(e.getMessage());
        }

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Название не может быть null или пустым");
        }
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price < 0) {
            throw new IllegalArgumentException("Цена не может быть отрицательной");
        }
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        if (category == null) {
            throw new IllegalArgumentException("Категория не может быть null");
        }
        this.category = category;
    }

    public DiscountSize getDiscountSize() {
        return discountSize;
    }

    public void setDiscountSize(DiscountSize discountSize) throws TooMuchSaleException {
        if (discountSize == null) {
            throw new IllegalArgumentException("Размер скидки не может быть null");
        }
        if (this.category == Category.PREMIUM && discountSize.getDiscountValue() > 0.15) {
            throw new TooMuchSaleException("Для премиум товаров нельзя установить размер скидки больше 15%");
        }
        this.discountSize = discountSize;
    }

    @Override
    public String toString() {
        String categoryTitle = "стандарт";
        if (category == Category.PREMIUM) {
            categoryTitle = "премиум";
        }
        int discountProcent = (int) (discountSize.getDiscountValue() * 100);
        return '\n' +
                "   Название: " + title + '\n' +
                "   Цена: " + price + '\n' +
                "   Категория: " + categoryTitle + '\n' +
                "   Скидка: " + discountProcent + " %";
    }
}
