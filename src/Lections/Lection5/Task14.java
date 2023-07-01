package Lections.Lection5;

import java.io.*;

public class Task14 {
    public static void main(String[] args) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        try (DataOutputStream outData = new DataOutputStream(out)) {
            outData.writeByte(128);
            outData.writeInt(128);
            outData.writeLong(128);
            outData.writeDouble(128);
        } catch (Exception e) {
            System.out.println("Impossible IOException occurs: " + e.toString());
            e.printStackTrace();
        }

        // Нарушена последовательность и считывание данных дает неверный результат
        try {
            byte[] bytes = out.toByteArray();
            InputStream in = new ByteArrayInputStream(bytes);
            DataInputStream inData = new DataInputStream(in);

            System.out.println("Reading in a modified sequence:");
//            System.out.println("readByte: " + inData.readByte());
            System.out.println("readInt: " + inData.readInt());
            System.out.println("readDouble: " + inData.readDouble());
            System.out.println("readLong: " + inData.readLong());
            inData.close();
        } catch (Exception e) {
            System.out.println("Impossible IOException occurs: " + e.toString());
            e.printStackTrace();
        }
    }
}
