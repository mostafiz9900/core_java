package beSkilled_interface;

public class Teat {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        Cat c1 = new Cat();
        Cow c11 = new Cow();
        System.out.println(d1.eat());
        System.out.println(d1.Run());
        System.out.println(c1.eat());
        System.out.println(c11.eat());

//        Object[] obj = {new Dog(), new Cat(), new Cow()};
//        for (int i = 0; i < obj.length; i++) {
//            if (obj[i] instanceof Animal) {
//                System.out.println(((Animal)obj[i]).eat());
//                
//            }
//            
//        }
    }
}
