package BeSkilled;

public class ArrayDeclaration_246 {
//Array Index start from 0 zero

    int[] x = new int[2];//2 is array length
    //int []y=new int[3];// not good
    int z[] = new int[5];//best Method

    public static void main(String[] args) {
        //2 is array length
        int[] x = new int[2];
        //int []y=new int[3];// not good
        int z[] = new int[5];//best Method
        x[0] = 10;
        x[1] = 20;
        System.out.println("x[0] " + x[0]);
        System.out.println("x[1] " + x[1]);

        for (int i : x) {
            System.out.println(i);

        }
        System.out.println("==============================");
        //alternative way  array declaration
        int p[] = {10, 25, 35, 26, 48, 25, 84};//length 8, index 7
        System.out.println("p[5]" + p[5]);
        System.out.println("length : " + p.length);

        p = new int[9]; // if new declaring array before data & strature remove

        for (int i : p) {
            System.out.print("   " + i);
        }

    }

}
