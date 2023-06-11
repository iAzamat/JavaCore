package Lections.Lection4.ru.gb.jcore;

public class MyException {
    private static int div0(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("parameter error");
        }
        return a / b;
    }

    private static int div1() {
        return div0(1, 0);
    }

    private static int div2() {
        return div1();
    }

//    public static void methodA() {
//        RuntimeException e = new RuntimeException();
//        throw e;
//    }

//    public static void methodB() {
//        try {
//            throw new IOException();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//
//    }

//    public static void methodB() throws IOException{
//        throw new IOException();
//    }
//
//    public static void methodA(){
//        RuntimeException e = new RuntimeException();
//        //throw e;
//        methodB();
//    }

    public static void main(String[] args) throws java.lang.Exception {
//        int result = div2();
//        System.out.println(result);
//        System.out.println(div0(1, 2));
//        System.out.println(div0(1, 0));

//        int[] arr = {1};
////        System.out.println(arr[2]);
//        try {
//            methodA();
//        } catch (java.lang.Exception e) {
//            System.out.println(e);
//        }

//        methodA();
    }

}
