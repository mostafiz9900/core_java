package beSkilled;

import java.util.Scanner;

public class MailValidetion {

    public static void main(String[] args) {
        Scanner input   =new Scanner(System.in);
        System.out.println("Enter email");
        String email=input.nextLine();
        int at=email.indexOf("@");
        int dot=email.indexOf(".");
        
        if (at>0 && dot<email.length()-1&&at<dot-1) {
            System.out.println("valid"); 
            
        }else{
            System.out.println("invalied");
        }
    }
}
