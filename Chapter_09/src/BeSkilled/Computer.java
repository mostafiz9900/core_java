package BeSkilled;

public class Computer {

    int serealNumner;
    String brand;

    public Computer() {
    }

    public Computer(int serealNumner, String brand) {
        this.serealNumner = serealNumner;
        this.brand = brand;
    }

    public int getSerealNumner() {
        return serealNumner;
    }

    public String getBrand() {
        return brand;
    }

    public void setSerealNumner(int serealNumner) {
        this.serealNumner = serealNumner;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static void main(String[] args) {
        Computer cp = new Computer();
        cp.setSerealNumner(1245);
        cp.setBrand("Samsung");

        int x = cp.getSerealNumner();
        String y = cp.getBrand();
        System.out.println("x : " + x);
        System.out.println("y : " + y);

    }
}
