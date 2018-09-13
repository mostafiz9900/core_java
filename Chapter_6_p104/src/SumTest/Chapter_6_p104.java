package SumTest;

public class Chapter_6_p104 {

    public static void main(String[] args) {
        Chapter_6_p104 m=new Chapter_6_p104();
        int rs=m.makeSum(1,2 ,3, 4, 5, 6, 7, 8, 9,10);
        System.out.println("Total sum "+rs);
    }

    public int makeSum(int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10){
      int  sum = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;
      return sum;
    }
}
