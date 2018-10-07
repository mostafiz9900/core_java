package beSkilled;

import java.io.*;


public class ObjectInputStrm {

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        try (ObjectInputStream oits = new ObjectInputStream(new FileInputStream("object.dat"));) {

            String name = oits.readUTF();
            int score = oits.readInt();
            java.util.Date date = (java.util.Date) (oits.readObject());
            System.out.print(name + " " + score + " " + date);
        }

    }
}
