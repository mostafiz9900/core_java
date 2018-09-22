package beSkilled_inheritance3;

public class Test {

    public static void main(String[] args) {
        A a = new A();
        B b1 = new B();
        A b2 = new B();

        a.sayHello();
        b1.dis();
        b2.sayHello();
        b1.sayHello();
    }
}
