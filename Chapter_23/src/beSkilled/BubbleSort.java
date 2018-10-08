package beSkilled;

public class BubbleSort {

    public static void main(String[] args) {
        int list[] = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        bubbleSort(list);
        for (int i :bubbleSort(list)) {
            System.out.print(i + " ");

        }
    }

    public static int[] bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;

            for (int i = 0; i < list.length-k; i++) {
                if (list[i] > list[i + 1]) {
                    int trmp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = trmp;
                    needNextPass = true;

                }
            }

        }
        return list;
        
    }
}
