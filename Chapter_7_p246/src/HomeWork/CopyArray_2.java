package HomeWork;

public class CopyArray_2 {

    public static void main(String[] args) {
        int sourceArr[] = {1, 22, 3, 5, 44,66};
        int targetArr[] = new int[sourceArr.length];

        for (int i = 0; i < sourceArr.length; i++) {
            targetArr[i] = sourceArr[i];

        }
        for (int p : targetArr) {
            System.out.print(p + "  ");

        }
        System.out.println();
        int newArray[] = new int[sourceArr.length];
        //System.arraycopy(sourceArr, 0, newArray, 0, sourceArr.length);
         System.arraycopy(sourceArr, 2, newArray,1,3);
        for (int k : newArray) {
            System.out.print(k + " ");

        }
        System.out.println();
    }
}
