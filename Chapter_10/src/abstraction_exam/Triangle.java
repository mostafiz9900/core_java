package abstraction_exam;

class Triangle extends Figure {

    public Triangle(double a, double b) {
        super(a, b);

    }

    @Override
    double area() {
        System.out.println("Insert area for Triangle");
        return dim1 * dim2 / 2;
    }

}
