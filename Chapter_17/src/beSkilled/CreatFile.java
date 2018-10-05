package beSkilled;

import java.io.File;

public class CreatFile {

    public static void main(String[] args) {
        try {
            File file = new File("D:\\My_Git\\java\\Chapter_17\\abc.txt");
            if (file.createNewFile()) {
                System.out.println("File is created");

            } else {
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

}
