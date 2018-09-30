package beSkilled;

public class ArrayDisply_Sum {

    public static void main(String[] args) {
        int[] arr = {8, 6, 2, 4, 9, 1};
        int sum = 0;

        for (int i : arr) {
            sum += i;
            System.out.println(i);

        }
        System.out.println(sum);
    }
}
