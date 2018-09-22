/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be_skilled_inhertance;

/**
 *
 * @author User
 */
public class A {

   int id;
   String name;
   String color;

    public A() {
    }

    public A(int id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }
   
   
   
   public void saygello(){
       System.out.println("Hi , How are you? ");
   }
}
