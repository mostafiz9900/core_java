package BeSkilled;

public class ClassRome {

    int id;
    String location;

    public ClassRome() {
    }

    public ClassRome(int id, String location) {
        this.id = id;
        this.location = location;
    }

    public static void main(String[] args) {
        ClassRome cr = new ClassRome(100, "4th Floor");
        System.out.println("Id" + cr.getId());
         System.out.println("Location" + cr.getLocation());
        
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

}
