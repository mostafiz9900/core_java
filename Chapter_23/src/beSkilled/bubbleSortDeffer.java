package beSkilled;

public class bubbleSortDeffer {

    public static void main(String[] args) {
        int arr[] = {5, 3, 2, 1};
        bubblSort(arr);
        for (int p : bubblSort(arr)) {
            System.out.print (p + " ");
        }

    }

    public static int[] bubblSort(int[] list) {
        int temp;
        for (int i = 1; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;

                }

            }

        }

        return list;
    }
}
