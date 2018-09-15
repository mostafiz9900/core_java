package BeSkilled;

import java.lang.reflect.Method;

public class MethodEx5 {
    public static void main(String[] args) {
        MethodEx5 m=new MethodEx5();
        int rs=m.makeSubstituteFromTwoMethod(5, 7);
        System.out.println("Result "+rs);
    }
    public int makeSum(int num1, int  num2){
    int sum=num1+num2;
    return sum;
    }
    public int makeMulti(int num1, int num2){
    int multi=num1*num2;
    return multi;
    
    }
    public int makeSubstituteFromTwoMethod(int n1, int n2){
    int result=makeMulti(n1, n2)-makeSum(n1, n2);
    return result;
    
    }
}
