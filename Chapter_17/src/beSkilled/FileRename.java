package beSkilled;

import java.io.File;

public class FileRename {

    public static void main(String[] args) {
        File oldfile = new File("D:\\My_Git\\java\\Chapter_17\\abc.txt");
        File newFile = new File("D:\\My_Git\\java\\Chapter_17\\mostafiz.txt");
        if (oldfile.renameTo(newFile)) {
            System.out.println("Rename succesful");

        } else {
            System.out.println("Rename failed");
        }
    }
}
