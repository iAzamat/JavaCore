package Seminars.Seminar3.ru.gb.jcore.Task2;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Мурзик");
        Dog dog1 = new Dog("Тузик", 0.5f, 500, 10);
        Dog dog2 = new Dog("Шарик", 0.5f, 500, 10);

        Animal[] arr = {cat1, cat2, dog1, dog2};
        float toJump = 1.5f;
        float toRun = 350;
        float toSwim = 5;

        for (int i = 0; i < arr.length; i++) {
            String nameString = arr[i].getType() + " " + arr[i].getName() + " can ";

            String eventName = String.format("jump max %.2fm. Tries to jump ", arr[i].getMaxJump());
            String eventResult = (arr[i].jump(toJump)) ? "succeed" : "fails";
            System.out.println(nameString + eventName + toJump + "m and " + eventResult);

            eventName = String.format("run max %.2fm. Tries to run ", arr[i].getMaxRun());
            eventResult = arr[i].run(toRun) ? "succeed" : "fails";
            System.out.println(nameString + eventName + toRun + "m and " + eventResult);

            int swimResult = arr[i].swim(toSwim);
            eventName = String.format("swim max %.2fm. Tries to run ", arr[i].getMaxSwim());
            eventResult = (swimResult == Animal.SWIM_OK) ? "succeed" : "fails";
            if (swimResult == Animal.SWIM_WTF)
                eventResult = "too scared to enter the water";
            System.out.println(nameString + eventName + toSwim + "m and " + eventResult);
        }
    }
}
