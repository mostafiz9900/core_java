package immutable;

public final class Building1_p353 {

    final int id;
    final String name;

    public Building1_p353(int id, String name) {
        this.id = id;
        this.name = name;
    }
//immutable do not setMethod 
    //it only get Method

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
