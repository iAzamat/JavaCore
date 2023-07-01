package Lections.Lection5;

public class Task19 {
    public static void main(String[] args) {
        String cat0 = "BestCat";
        String cat1 = "BestCat";
        String cat2 = "Best" + "Cat";
        String cat30 = "Best";
        String cat3 = cat30 + "Cat";

        System.out.println("cat0 equal to cat1? " + (cat0 == cat1));
        System.out.println("cat0 equal to cat2? " + (cat0 == cat2));
        System.out.println("cat0 equal to cat3? " + (cat0 == cat3));

        System.out.println();
        System.out.println("cat0 equal to cat1? " + (cat0.equals(cat1)));
        System.out.println("cat0 equal to cat2? " + (cat0.equals(cat2)));
        System.out.println("cat0 equal to cat3? " + (cat0.equals(cat3)));
    }
}
