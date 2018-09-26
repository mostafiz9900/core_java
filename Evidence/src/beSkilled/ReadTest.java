package beSkilled;

public class ReadTest {

    public static void main(String[] args) {
        System.out.println("\\t is a tab character");
        System.out.println("\" namjn");
        System.out.println("\\b is a backspace");
        System.out.println("\n line feed");
        System.out.println("\f form feed");
        System.out.println("\r return feed");
        System.out.println(Math.ceil(2.1));//3
        System.out.println(Math.ceil(2.0));//3
        System.out.println(Math.ceil(-2.0));//2
        System.out.println(Math.ceil(-2.1));//2
        System.out.println("\n line feed  " + Math.floor(2.1));
        System.out.println(Math.floor(2.9));
        System.out.println(Math.floor(-2.1));
        System.out.println(Math.floor(2.0));
        System.out.println(Math.floor(-2.0));
        System.out.println("==========");
        System.out.println((int) (Math.random() * 10));
        System.out.println(10 + (int) (Math.random() * 10));
        char ch = 'A';
        System.out.println(++ch);
       byte a='A';
        System.out.println(a);
        System.out.println("===============");
        int i='2'+'3';
        System.out.println(i);
        int j= 'A';
        System.out.println(j);
    }
}
