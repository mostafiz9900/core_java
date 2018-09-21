package HomeWork;

public class ValueOfDemo {

    public static void main(String[] args) {
        Integer intWrapper1 = Integer.valueOf("12345");
        //Converting from binary to decimal
        Integer intWrapper2 = Integer.valueOf("11011", 2);
        //Converting from hexadecimal to decimal
        Integer intWrapper3 = Integer.valueOf("D", 16);

        System.out.println("Value of intWrapper1 object : " + intWrapper1);
        System.out.println("Value of intWrapper2 object : " + intWrapper2);
        System.out.println("Value of intWrapper3 object : " + intWrapper3);

        System.out.println("Hex value of intWrapper: " + Integer.toHexString(intWrapper1));
        System.out.println("Hex value of intWrapper: " + Integer.toBinaryString(intWrapper2));

    }
}
