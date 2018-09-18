package BeSkilled;

public class Animal {

    //anumal object state
    String name;
    String coler;
    double age;
    String race;

    // animal object behavior
    void bite() {
    }

    void eat() {
    }

    void walk() {
    }

    void bark() {
    }

    void run() {
    }
//////////////////difal constractor

    public Animal() {
    }
    //genarate constractor

    public Animal(String name, String coler, double age, String race) {
        this.name = name;
        this.coler = coler;
        this.age = age;
        this.race = race;
    }

    public static void main(String[] args) {
        Animal jarry = new Animal();
        Animal tiger = new Animal("Maslwo", "Gray", 22.20, "Banglade");
        System.out.println(tiger);

    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", coler=" + coler + ", age=" + age + ", race=" + race + '}';
    }

}
