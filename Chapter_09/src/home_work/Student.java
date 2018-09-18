package home_work;

public class Student {

    String name;
    int id;

    public Student() {
    }

    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("Mostafizur");
        stu.setId(1243560);
        System.out.println(stu);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + '}';
    }

}
