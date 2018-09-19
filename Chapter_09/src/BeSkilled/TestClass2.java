package BeSkilled;
/*
test encpsultedObject Packages 
*/
import BeSkilled.privet.*;

public class TestClass2 extends EncapsultedObjectEx{
    

    static private int num = 10;
    protected int num2 = 20;

    public static void main(String[] args) {
         EncapsultedObjectEx im = new EncapsultedObjectEx();
        TestClass2 tc = new TestClass2();
        System.out.println(num + " ");
        System.out.println(tc.num2 + " ");//non static vareable call use object 
        //myPan();
     
       
    }

   
}
