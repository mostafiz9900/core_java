package immutable;

public final class Building2 {

    final int id;
    final String name;

    public Building2(int id, String name) {
        this.id = id;
        this.name = name;
    }
    //reference data type create method class name and method name use
    public  static Building2 displayDetails(Building1_p353 b1){
    Building2 b2=new Building2(b1.getId(), b1.getName());
    return b2;
            
    }

    @Override
    public String toString() {
        return "Building2{" + "id=" + id + ", name=" + name + '}';
    }
    

}
