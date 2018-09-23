package beSkilled;

public class ExceptionBaring1 {

    public static void main(String[] args) {

       // System.out.println(getDivision(10, 0));
        System.out.println(grtParseDtring("ten"));

    }
// throws onner jonno rehke deoya
//    public static int getDivision(int x, int y) throws ArithmeticException {
//        int rs = x / y;
//        return rs;
//    }

    public static int grtParseDtring(String str) {
        int rs = 0;
//nijei handel kora
        try {
            rs = Integer.parseInt(str);
        } catch (Exception e) {
            System.out.println("you can tot parse string like ten ");
        }

        return rs;

    }
}
