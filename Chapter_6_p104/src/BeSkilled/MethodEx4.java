
package BeSkilled;
public class MethodEx4 {
    
   int x=10;
   int y=20;
    public static void main(String[] args) {
        MethodEx4 m=new MethodEx4();
       int rs= m.makeSum(m.x, m.y,30);
        System.out.println("Result "+rs);
    }
    public int makeSum(int num1, int num2, int num3 ){
    int sum=num1+num2+ num3;
    return sum;
    }
}
