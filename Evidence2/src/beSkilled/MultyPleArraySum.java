package beSkilled;


public class MultyPleArraySum {

    public static void main(String[] args) {
        long[][] arr = {
            {12},
            {5}
        };
       
        long sum = 0;
        for (long[] one : arr) {
            for (long i :one) {
                sum+=i;
            }
            
        }
        System.out.println(sum);
       
    }
}
