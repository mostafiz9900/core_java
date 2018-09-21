package HomeWork;

public class WrapperDemo {

    public static void main(String[] args) {
        int pInt = 420;
//        Integer wInt=new Integer(pInt);
        Integer wInt = pInt;
        int p2 = wInt;
        System.out.println(p2);
        System.out.println("=================");
        Integer intObj1 = new Integer(25);
        Integer intObj2 = new Integer("25");
        Integer intObj3 = new Integer(35);

        System.out.println("Comparing usig compareTo: " + intObj1.compareTo(intObj2));
        System.out.println("Comparing usig compareTo: " + intObj1.compareTo(intObj3));
        //Equel Method
        System.out.println("Equel cheek true or false: " + intObj1.equals(intObj2));
        System.out.println("Equel cheek true or false: " + intObj1.equals(intObj3));
        //Float 
        Float f1 = new Float("2.25f");
        Float f2 = new Float("20.43f");
        Float f3 = new Float(2.25f);
        System.out.println("Comparing using compare f1 and f2: " + f1.compareTo(f2));
        System.out.println("Comparing using compare f1 and f3: " + f1.compareTo(f3));

        //Addition if Ineger with Float convartion
        Float f = intObj1.floatValue() + f1;
        System.out.println(intObj1 + " + " + f1 + " = " + f);
    }
}
