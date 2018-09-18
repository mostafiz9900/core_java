package BeSkilled;

public class Student {

    public static void main(String[] args) {
        Student male = new Student("Mostafizur", 1243560);
        System.out.println(male + " ");

    }
    String name;
    int id;

    public Student() {
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + '}';
    }

}
