package beSkilled;

public class ForLoop {

    public static void main(String[] args) {
        int counter=0;
        String sum="0";
        for (int i = 0; i < 10; i++) {
            System.out.println("Welcome to java");
            
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("          "+i*j);
                for (int k = 0; k < 10; k++) {
                    System.out.println(i*j*k);
                    
                }
                
            }
            
        }
    }
}
