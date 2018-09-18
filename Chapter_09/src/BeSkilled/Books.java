package BeSkilled;

public class Books {

    int id;
    String name;

    public Books() {
    }

    public Books(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Books bk = new Books(101, "Java");
        System.out.println("Id " + bk.getId());
        System.out.println("Name " + bk.getName());

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
