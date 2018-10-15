package beSkilled;

public class SearchNumber {

    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 3, 22, 55, 4, 8, 99, 56, 25, 32, 14, 88};
        int searchNum = 22;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchNum) {
                System.out.println("Found");
                break;
            } else {
                System.out.println("Not Found");
            }

        }
    }
}
