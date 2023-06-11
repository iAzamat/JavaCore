package Lections.Lection4.ru.gb.jcore;

public class Orange {
//    public void squeezeJuice() {
//        System.out.println("Squeeze juice ...");
//    }
//
//    class Juice {
//        public void flow() {
//            System.out.println("Juice dripped ...");
//        }
//    }

    private Juice juice;

    public Orange() {
        this.juice = new Juice();
    }

    public void squeezeJuice() {
        System.out.println("Squeeze juice ...");
        juice.flow();
    }

    private class Juice {
        public void flow() {
            System.out.println("Juice dripped ...");
        }
    }
}
