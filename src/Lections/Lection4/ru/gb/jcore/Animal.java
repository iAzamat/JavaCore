package Lections.Lection4.ru.gb.jcore;

public class Animal {

    void performBehavior(boolean state) {
        class Brain {
            void sleep() {
                if (state) {
                    System.out.println("Sleeping");
                } else {
                    System.out.println("Not sleeping");
                }
            }
        }
        Brain brain = new Brain();
        brain.sleep();
    }
}
