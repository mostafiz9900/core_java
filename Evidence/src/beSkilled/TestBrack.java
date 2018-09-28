package beSkilled;

public class TestBrack {

    public static void main(String[] args) {
        int sum = 0, number = 0;
        while (number < 20) {
            number++;
            sum += number;
            if (sum >= 100) {
                break;

            }
            System.out.println(" " + number);
        }
        System.out.println(" " + number);
        System.out.println(" " + sum);
        System.out.println("=============");
        int x = 0;
        while (x < 20) {
            x++;
            if (x == 2) {
                continue;

            }
            System.out.println(" " + x);
        }
    }
}
