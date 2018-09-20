
package abstraction_exam;


 abstract class Figure {
    double dim1;
    double dim2;
    int x=4;

   Figure(double a, double b) {
        this.dim1 = a;
        this.dim2 = b;
    }
   //area is now abstract method
    abstract  double area();
    void sum(){}
    
}
