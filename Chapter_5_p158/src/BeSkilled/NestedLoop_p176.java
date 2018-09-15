package BeSkilled;

public class NestedLoop_p176 {

    public static void main(String[] args) {
        //Display the table heading
        System.out.println("       Multiplication Table");
        //Display the number title
        System.out.print("    ");

        for (int j = 1; j <= 9; j++) {
            System.out.print("   " + j);
        }
        System.out.println("\n----------------------------------------");
        //Display the table body
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");

            for (int j = 1; j <= 9; j++) {
        //display the product and align properly
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

    }
}
