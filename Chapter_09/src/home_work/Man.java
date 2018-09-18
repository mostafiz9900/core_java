package home_work;

public class Man {

    //object state
    //instance variavale
    String name;
    char gender;
    int id;
    //defuale constactor

    public Man() {
    }
    //argumenestic constracor

    public Man(String name, char gender, int id) {
        this.name = name;
        this.gender = gender;
        this.id = id;
    }

    public static void main(String[] args) {
        Man mm = new Man("Mostafizur", 'M', 1243560);
        System.out.println(mm + " ");
    }

    @Override
    public String toString() {
        return "Man{" + "name=" + name + ", gender=" + gender + ", id=" + id + '}';
    }

}
