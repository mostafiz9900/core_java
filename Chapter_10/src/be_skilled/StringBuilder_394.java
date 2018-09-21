package be_skilled;

public class StringBuilder_394 {

    public static void main(String[] args) {
        StringBuilder stringBuld = new StringBuilder();
        stringBuld.append("Welcome");
        stringBuld.append(' ');
        stringBuld.append("to");
        stringBuld.append(' ');
        stringBuld.append("Java");
        System.out.println(stringBuld);

        //System.out.println(stringBuld.delete(2, 4));
        //2= start & 4 before 4
         //System.out.println(stringBuld.deleteCharAt(4));
         //only one charcter
          //System.out.println(stringBuld.reverse());
          //sebaret chsarecter
          // System.out.println(stringBuld.replace(11, 15, "HTML"));
            //System.out.println(stringBuld.setCharAt(0, 'w')); void type method does not print
         stringBuld.setCharAt(0, 'w');
            System.out.println(stringBuld);

    }

}
