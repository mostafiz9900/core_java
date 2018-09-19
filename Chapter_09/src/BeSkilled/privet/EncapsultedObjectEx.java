package BeSkilled.privet;

public class EncapsultedObjectEx {

    private static int id;
    protected static String name;

    public EncapsultedObjectEx() {

    }

    public static void main(String[] args) {
        EncapsultedObjectEx im = new EncapsultedObjectEx();
        id = 200;
        im.id = 500;
        name = "mosta";
        System.out.println(im.getName());
        getName();
        im.myCar();

    }

    private  static void myCar() {
        System.out.println("This is my privet car");

    }
    static void myCar2() {
        System.out.println("This is my privet car");

    }

    private static int myId() {
        return id;

    }

    public static int getId() {
        return id;
    }

    public static String getName() {
        return name;
    }

}
