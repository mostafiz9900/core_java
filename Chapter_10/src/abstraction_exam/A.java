
package abstraction_exam;


abstract class A {
    //Method do not body part
    //Abastrat & non abstract method do acces
    //Do not creat object & not call
   abstract void callMe();
   
    public void callMeToo(){
        System.out.println("This is non abstract method");
    }
    
}
