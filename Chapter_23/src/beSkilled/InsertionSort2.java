package beSkilled;

public class InsertionSort2 {

    public static void main(String[] args) {
        int arr[] = {5,3, 2, 1};
        int parr[] = insertionSort(arr);
        for (int p : parr) {
            System.out.print(p + " ");

        }
    }

    public static int[] insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > currentElement; j--) {
                list[j + 1] = list[j];

            }

            list[j + 1] = currentElement;
        }

        return list;
    }

}
