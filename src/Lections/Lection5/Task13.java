package Lections.Lection5;

import java.io.*;

public class Task13 {
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

        try {
            byte[] bytes = out.toByteArray();
            InputStream in = new ByteArrayInputStream(bytes);
            DataInputStream inData = new DataInputStream(in);

            System.out.println("Reading in the correct sequence: ");
            System.out.println("readByte: " + inData.readByte());
            System.out.println("readInt: " + inData.readInt());
            System.out.println("readLong: " + inData.readLong());
            System.out.println("readDouble: " + inData.readDouble());
            inData.close();
        } catch (Exception e) {
            System.out.println("Impossible IOException occurs: " + e.toString());
            e.printStackTrace();
        }
    }
}
