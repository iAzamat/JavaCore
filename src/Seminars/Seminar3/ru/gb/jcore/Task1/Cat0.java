package Seminars.Seminar3.ru.gb.jcore.Task1;

public class Cat0 {
    private static final int CURRENT_YEAR = 2022;
    private static int id = 0;

    private String name;
    private String color;
    private int birthYear;
    private int uid;

    Cat0(String name, String color, int age) {
        setBirth(age);
        this.name = name;
        this.color = color;
        this.uid = ++id;
    }

    private void setBirth(int age) {
        this.birthYear = CURRENT_YEAR - age;
    }

    public int getUid() {
        return uid;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return CURRENT_YEAR - birthYear;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", birthYear=" + birthYear +
                ", uid=" + uid +
                '}';
    }

    public static void main(String[] args) {
        Cat0 cat = new Cat0("Барсик","Белый",5);
        System.out.println(cat);
    }
}
