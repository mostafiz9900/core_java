package array_list;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Student s1 = new Student(01, "Mostafiz");
        Student s2 = new Student(02, "Sofiqul");
        Student s3 = new Student(03, "Mahabub");

        List<Student> students = new ArrayList();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        //System.out.println(students);
        students.add(new Student(5, "Rojina"));

        for (Student s : students) {
            System.out.println(s);

        }

    }
}
