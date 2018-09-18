package BeSkilled;

public class Teacher {

    //step -1: instance variable declare
    int id;
    String name;
    String education;
    //deafult constructor naya(optional)

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    //step -4: Take a Main Method or any method(optional)
    public static void main(String[] args) {
        Teacher tec = new Teacher();
        tec.setId(200);
        tec.setName("Mostafiz");
        tec.setEducation("it");
        System.out.println(" id " + tec.getId() + " Name " + tec.getName() + " Education " + tec.getEducation());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEducation() {
        return education;
    }

}
