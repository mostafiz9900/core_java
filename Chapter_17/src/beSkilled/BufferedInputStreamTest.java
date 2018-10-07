package beSkilled;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamTest {

    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("D:\\My_Git\\java\\Chapter_17\\src\\beSkilled\\fi.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);

            int i;
            while ((i = bin.read()) != -1) {
                System.out.print((char) i);

            }
            fin.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
