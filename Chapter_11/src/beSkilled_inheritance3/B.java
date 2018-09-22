
package beSkilled_inheritance3;

public class B extends A{

    @Override
    public  void  sayHello(){
    
        System.out.println("i am  Mostafrom A ");
    }
    public  void  dis(){
        super.sayHello();
        System.out.println("i am from A");
    }
}
