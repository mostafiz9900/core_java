package BeSkilled;

public class AnimalDog {

    int age;
    String name;
    String color;

    public static void main(String[] args) {
        AnimalDog ad = new AnimalDog();
        ad.setAge(25);
        ad.setName("Pogu");
        ad.setColor("Black");
        System.out.println(" Age " + ad.getAge());
        System.out.println(" Name " + ad.getName());
        System.out.println(" Color " + ad.getColor());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
