package beSkilled;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputtreanTest {

    public static void main(String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("D:\\My_Git\\java\\Chapter_17\\src\\beSkilled\\fi.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);

        String s = "I am a java programmer in idb it progrem";
        byte b[] = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        System.out.println("Success");
    }
}
