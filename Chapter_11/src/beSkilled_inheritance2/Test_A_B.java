package beSkilled_inheritance2;

//A class reference only a hbe 
//A class reference only a hbe 
// 
public class Test_A_B {

    public static void main(String[] args) {
        B b1 = new B();
        A b2 = new B();
        A b3 = new A();
// three future of java 1. object 2. inheritance 3. polymorphism
        C c1 = new C();
        B c2 = new C();
        A c3 = new C();
        
        System.out.println(b2 instanceof B);
        System.out.println(b2 instanceof A);
        System.out.println(c1 instanceof C);
        System.out.println(b3 instanceof A);
        System.out.println(b2 instanceof B);
        System.out.println(b2 instanceof C);
    }

}
