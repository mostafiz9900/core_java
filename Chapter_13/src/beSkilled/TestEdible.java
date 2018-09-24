/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilled;

/**
 *
 * @author User
 */
public class TestEdible {

    public static void main(String[] args) {
        Object[] objects = {new Tiger(), new Chicken_507(), new Apple()};

        for (int i = 0; i < objects.length; i++) {
            if (objects[i] instanceof Edible_507) {
                System.out.println(((Edible_507) objects[i]).howToEat());

            }
            if (objects[i] instanceof Animal_507) {
                System.out.println(((Animal_507) objects[i]).sound());
            }
        }
    }
}
