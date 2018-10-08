package beSkilled;

public class InsertionSortDeffer {

    public static void main(String[] args) {
        int arr[] = {5, 3, 2, 1};
        int parr[] = inserSort(arr);
        for (int p : parr) {
            System.out.print(p + " ");

        }
    }

    public static int[] inserSort(int[] list) {
        int temp;
        for (int i = 1; i < list.length; i++) {
            for (int j = i; j > 0; j--) {
                if (list[j] < list[j - 1]) {
                    temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;

                }

            }

        }
        return list;
    }
}
