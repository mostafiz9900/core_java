package Listing;

import java.util.Scanner;

public class ComputeAndInterpretBMI_p89 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.println("Enter heigh in pounds: ");
        double heigh = input.nextDouble();

        final double METERS_TER_INCH = 0.0254;

        double weightInKilograms = weight;
        double heightInMeters = heigh * METERS_TER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
// display result
        System.out.println("BMI id " + bmi);
        if (bmi < 18.50) {
            System.out.println("UnderWeight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("overWeight");
        } else {
            System.out.println("Obese");
        }
    }

}
