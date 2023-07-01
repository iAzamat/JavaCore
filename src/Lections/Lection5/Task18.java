package Lections.Lection5;

public class Task18 {
    public static void main(String[] args) {
        // StringBuilder - непотокобезопасный, работает быстрее
        // StringBuffer - многопоточность, в одном потоке чуть медленнее


        long timeStart = System.nanoTime();

        String s = "Example";
        for (int i = 0; i < 200_000; i++) {
            s = s + i;
        }
        double deltaTime = (System.nanoTime() - timeStart) * 0.000000001;
        System.out.println("Delta time (sec): " + deltaTime);

        // StringBuilder
        long timeStart2 = System.nanoTime();

        StringBuilder sb = new StringBuilder("Example");
        for (int i = 0; i < 200_000; i++) {
            sb.append(i);
        }
        double deltaTime2 = (System.nanoTime() - timeStart2) * 0.000000001;
        System.out.println("Delta time (sec): " + deltaTime2);

        // StringBuffer
        long timeStart3 = System.nanoTime();

        StringBuffer sbuffer = new StringBuffer("Example");
        for (int i = 0; i < 200_000; i++) {
            sbuffer.append(i);
        }
        double deltaTime3 = (System.nanoTime() - timeStart3) * 0.000000001;
        System.out.println("Delta time (sec): " + deltaTime3);

        System.out.println("Sting and StringBuilder: " + s.equals(sb.toString()));
        System.out.println("Sting and StringBuffer: " + s.equals(sbuffer.toString()));
    }
}
