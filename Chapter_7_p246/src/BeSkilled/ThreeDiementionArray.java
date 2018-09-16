package BeSkilled;

public class ThreeDiementionArray {

    public static void main(String[] args) {

        int towD1[][] = {
            {25, 88, 1},
            {2, 3, 5,},
            {88, 55, 66}

        };
        int towD2[][] = {
            {88, 1},
            {2, 3, 55,},
            {88, 555, 656}
        };
        int towD3[][] = {
            {88, 1},
            {2, 3, 55,},
            {88, 555, 656}
        };
        int threeD[][][] = {
            {
                {25, 88, 1},
                {2, 3, 5,},
                {88, 55, 66}
            },
            {
                {88, 1},
                {2, 3, 55,},
                {88, 555, 656}
            },
            {
                {88, 1},
                {2, 3, 55,},
                {88, 555, 656}
            }
        };
        for (int towD33[][] : threeD) {

            for (int towD11[] : towD2) {
                for (int i : towD11) {
                    System.out.print(i);
                }
                System.out.println();
            }

            System.out.println();

        }
        System.out.println();
    }
}
