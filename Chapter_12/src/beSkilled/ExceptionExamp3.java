package beSkilled;

public class ExceptionExamp3 {

    public static void main(String[] args) {
        System.out.println("1111111111111");

        try {
            System.out.println(10 / 0);
             System.out.println(Integer.parseInt("ten"));
        } catch (ArithmeticException e) {
            System.out.println("You can not divide by zero");
        }catch (NumberFormatException e) {
            System.out.println("You can not parse TEN five ");
        }

        System.out.println("222222222");

        
        System.out.println("Finish");
    }
}
