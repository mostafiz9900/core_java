package HomeWork;

public class TestMaxMin_381 {

    public static void main(String[] args) {
        System.out.println("The maximum & minimum Integer : " + Integer.MAX_VALUE + " + " + Integer.MIN_VALUE);
        System.out.println("The maximum & minimum Short: " + Short.MAX_VALUE + " + " + Short.MIN_VALUE);
        System.out.println("The maximum & minimum double: " + Double.MAX_VALUE + " + " + Double.MIN_VALUE);
        System.out.println("The maximum & minimum Long: " + Long.MAX_VALUE + " + " + Long.MIN_VALUE);
        System.out.println("The maximum & minimum Byte: " + Byte.MAX_VALUE + " + " + Byte.MIN_VALUE);
        System.out.println("The maximum & minimum Float: " + Float.MAX_VALUE + " + " + Float.MIN_VALUE);
        System.out.println("The maximum & minimum Character: " + Character.MAX_VALUE + " + " + Character.MIN_VALUE);
        System.out.println("=============");
//static valueOf Method 
        Double x = Double.valueOf("12.4");
        Integer y = Integer.valueOf("12");
        System.out.println(x + "");
        System.out.println(y + "");

        System.out.println("===================");
//static parsing methods
        String p = "10";
        int q = Integer.parseInt(p);
        System.out.println(p + "");
        System.out.println(q + "");
    }
}
