package be_skilled;

public class Matches_392 {

    public static void main(String[] args) {
        System.out.println("Hi, ABC, good".matches("ABC"));
        System.out.println("Hi, ABC, good".matches(".*ABC.*"));
        System.out.println("A,B;C".replaceAll(",;", "#"));
        System.out.println("A,B;C".replaceAll("[,;]", "#"));

        String[] tokens = "Avv,B;C".split("[,;]");

        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i] + " ");

        }

    }
}
