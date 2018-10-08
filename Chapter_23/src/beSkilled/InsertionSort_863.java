package beSkilled;

public class InsertionSort_863 {

    public static void main(String[] args) {
        int[] list = {1, 9, 4, 6, 5, -4};
        insertionSort(list);
        for (int j : insertionSort(list)) {
            System.out.print(j+" ");

        }

    }

    public static int[] insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {

            int currentElenment = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElenment; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElenment;
        }
        return list;
    }

}
