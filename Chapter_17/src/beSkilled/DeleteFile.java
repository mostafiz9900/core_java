package beSkilled;

import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {
        try {
            File deletFile = new File("D:\\My_Git\\java\\Chapter_17\\mostafiz.txt");
            if (deletFile.delete()) {
                System.out.println(deletFile.getName() + "is deleted ");

            } else {
                System.out.println("Delete oparation is failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
