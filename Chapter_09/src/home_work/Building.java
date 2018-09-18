package home_work;

public class Building {

    int id;
    String name;
    String location;

    public static void main(String[] args) {
        Building bd = new Building();
        bd.setId(101);
        bd.setName("Mostafizur");
        bd.setLocation("Mirpur-2");
        System.out.println("Id : " + bd.getId());
        System.out.println("Name : " + bd.getName());
        System.out.println("Location : " + bd.getLocation());

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
