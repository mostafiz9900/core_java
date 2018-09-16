package BeSkilled;

public class TwoDiementionalArray {

    public static void main(String[] args) {
        int x[] = {2, 3, 5};//Single diementional
        int y[] = {7, 9, 8};//Single diementional

        int twoD[][] = {
            {2},
            {7, 9},
            {88, 66, 77},
            {11, 44, 99, 88}
        };
        System.out.println(twoD[2][1]);
        System.out.println(twoD[3][3]);
        System.out.println(twoD[2][2]);

        for (int oneD[] : twoD) {
            for (int i : oneD) {
                System.out.print(i + " ");

            }
            System.out.println();

        }
        int twoD2[][] = {
            {2,00,11,22},
            {7, 9},
            {88, 66, 77},
            {11, 44, 99, 88}
        };
        System.out.println("===================================");
        for (int oneD2[]:twoD2) {
            for (int i :oneD2) {
                System.out.print(i);
                
            }
            System.out.println();
        }
        System.out.println("===================================");
        String str[][]={
            {"Mostafizur Rahman"},
            {"Sofiqul"}
        };
        for (String strD1[]:str ) {
            for (String i:strD1) {
                System.out.println(i);
                
            }
            System.out.println();
        }
    }
}
