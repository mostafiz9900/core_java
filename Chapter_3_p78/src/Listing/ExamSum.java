package Listing;

public class ExamSum {

    public static void main(String[] args) {
        int i = 1;
        int sum = 10;
        for (i = 1; i <= 10; i++) {
            sum += i;
            System.out.println(i);
        }
        System.out.println(sum + " sum");

        int j = 1;
        int sum2 = 10;
        while (j < 10) {
            sum2 += j;
            j++;
            System.out.println(j);
        }
        System.out.println(sum2 + " sum2");

        int k = 1;
        int sum3 = 10;

        do {
            sum3 += j;
            k++;

        } while (k < 10)
            System.out.println(k);
        
        System.out.println(sum3 + " sum3");
    }

}
