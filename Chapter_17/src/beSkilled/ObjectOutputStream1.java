package beSkilled;

import java.io.*;

public class ObjectOutputStream1 {

    public static void main(String[] args) throws IOException {
        try (
                ObjectOutputStream outs = new ObjectOutputStream(new FileOutputStream("object.dat"));) {
            outs.writeUTF("mastafiz");
            outs.writeInt(20);
            outs.writeObject(new java.util.Date());
        }
        
    }
}
