package beSkilled;

public class TestGenericStack {

    public static void main(String[] args) {
        GenericStack_741<String> str = new GenericStack_741<>();
        str.push("Mostafizur");
        str.push("Minhan");
        str.push("Rashidul");
        str.push("Sumaya");
        System.out.println(str);

        GenericStack_741<Integer> integer2 = new GenericStack_741<>();
        integer2.push(2);
        integer2.push(6);
        integer2.push(25);
        System.out.println(integer2);
    }
}
