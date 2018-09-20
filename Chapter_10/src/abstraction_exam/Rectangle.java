package abstraction_exam;

class Rectangle extends Figure {

    public Rectangle(double a, double b) {
        super(a, b);
        int d;
    }

    @Override
    double area() {
        System.out.println("Inside area for Rectangle");
        return dim1 * dim2;
    }

}
