package beSkilled;

public class BasicGenerics_743 {

    public static void main(String[] args) {
        Integer[] iArr = {1, 2, 8, 16, 6};
        String[] sArr = {"mostafiz", "Mehede", "minhan"};
        BasicGenerics_743.<Integer>p(iArr);
        BasicGenerics_743.<String>p(sArr);

    }

    public static <E> void p(E[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
            System.out.println();
        }
    }

}
