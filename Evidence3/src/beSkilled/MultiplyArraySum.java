package beSkilled;



public class MultiplyArraySum {

    public static void main(String[] args) {
        int[][] arr = {
            {2, 9},
            {6, 9, 1}
        };
        int sum = 0;
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
                sum += j;
            }

        }
        System.out.println(sum);

    }

}
