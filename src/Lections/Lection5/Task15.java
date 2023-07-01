package Lections.Lection5;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Task15 {
    public static void main(String[] args) {
        try (RandomAccessFile catFile = new RandomAccessFile("cat.txt", "rw")) {
            FileChannel inChannel = catFile.getChannel();
            ByteBuffer buf = ByteBuffer.allocate(100);
            int bytesRead = inChannel.read(buf);

            while (bytesRead != -1) {
                System.out.println("Read " + bytesRead + " bytes");
                // Set read mode
                buf.flip();
                while (buf.hasRemaining()) {
                    System.out.print((char) buf.get());
                }

                buf.clear();
                bytesRead = inChannel.read(buf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
