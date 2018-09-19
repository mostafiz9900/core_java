package BeSkilled.privet;

public class TestClass {

    static private int num = 10;
    protected int num2 = 20;

    public static void main(String[] args) {
        EncapsultedObjectEx im = new EncapsultedObjectEx();
        TestClass tc = new TestClass();
        System.out.println(num + " ");
        System.out.println(tc.num2 + " ");//non static vareable cal
        myPan();
        tc.myHistory();
        
    }

    //Direct call
    public static void myPan() {
        System.out.println("This is My pan");
    }

    //Object creat then call
   void myHistory() {
        System.out.println("This is My History pan");
    }
}
