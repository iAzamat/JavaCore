package Lections.Lection3.ru.gb.jcore;

public class Cat {
    static int pawsCount = 4;
    private String name;
    private String color;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "Имя кота: '" + name + '\'' +
                ", цвет: '" + color + '\'' +
                ", возраст: " + age +
                '}';
    }

    void jump() {
        if (age < 5)
            System.out.println(name + " jumps");
    }

    void voice() {
        System.out.println(name + " meows");
    }
}
