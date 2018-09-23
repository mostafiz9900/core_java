package beSkilled;

public class ExceptionExamp2 {

    public static void main(String[] args) {
        System.out.println("1111111111111");

        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println("You can not divide by zero");
        }

        System.out.println("222222222");

        try {
            System.out.println(Integer.parseInt("ten"));
        } catch (Exception e) {
            System.out.println("You can not parse TEN five ");
        }
        System.out.println("Finish");
    }
}
