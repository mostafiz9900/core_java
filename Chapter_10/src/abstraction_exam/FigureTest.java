package abstraction_exam;

public class FigureTest {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figure;// this is ok no object is creat
        figure = r;

        System.out.println("Area is : " + figure.area());
        figure=t;
        System.out.println("Area is : " + figure.area());
    }
}
