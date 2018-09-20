
package be_skilled.is_has_relation;


public class Bike {
    private String color;
    private int maxSpeed;
    
    
    public void info(){
        System.out.println("Bike color : "+color+"Max Speed: "+maxSpeed);
    }
    

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
}
