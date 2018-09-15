package BeSkilled;

public class MethodEx3 {

    double balance = 5000;

    public static void main(String[] args) {
        MethodEx3 m = new MethodEx3();
        boolean rs = m.checkBalance(4200);
        System.out.println("Result " + rs);
    }

    //Creat Methode
    public boolean checkBalance(double withdrew) {
        balance = balance - withdrew;
        if (balance >= 1000) {
            return true;
        } else {
            return false;
        }
    }
}
