package BeSkilled;

public class TestContinue_184 {

    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;
//evend number print do it number % 2 != 0
//old number print do it number % 2 == 0
            if (number == 5 || number==15) {
                continue;//continue is give up/gap/avoid/forbear this conditional digit
            }
            System.out.println(" " + number);
            sum += number;
        }
        System.out.println("The sum is " + sum);
    }
}
