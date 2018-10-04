package beSkilled;

import java.util.Scanner;

public class TowerOfHanoi_721 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int n = input.nextInt();
        System.out.println("The moves are: ");
        moveDisks(n, 'A', 'B', 'C');

    }

    public static void moveDisks(int n, char fromtower, char toTower, char auxTower) {
        if (n == 1) {
            System.out.println(" Move disk " + n + " from " + fromtower + " to " + toTower);

        } else {
            moveDisks(n - 1, fromtower, auxTower, toTower);
            System.out.println(" Move disk " + n + " from " + fromtower + " to " + toTower);

            moveDisks(n - 1, auxTower, toTower, fromtower);
        }
    }
}
