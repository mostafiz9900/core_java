package beSkilled;

public class QuickSort_871 {

    public static void quickSort(int[] list) {
        quickSort(list, 0, list.length - 1);

    }

    public static void quickSort(int[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);

        }
    }

    public static int partition(int[] list, int first, int last) {
        int pivot = list[first];
        int low = first + 1;
        int high = last;

        while (high > low) {

            while (low <= high && list[high] > pivot) {
                low++;
            }
            while (low <= high && list[high] > pivot) {
                high--;
            }
            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high > first && list[high] >= pivot) {
            high--;
        }

        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;

        } else {
            return first;
        }

    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 9, 2, 1, 4, 6};
        quickSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
