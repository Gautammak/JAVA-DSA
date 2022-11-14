/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.mycompany.Function__Methods;

/**
 *
 * @author Admin
 */
public class Shadowing {
    
    static int x = 90; //this will be  shadowed at line at line 16
    public static void main(String[] args){
        System.out.println(x); //90 
      //  int x = 40;//the class variable line 13 is shadowed by this

      int x;
  //    System.out.println(x); scope will begin when value is initialised
      x =40;
        System.out.println(x); //40
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
    
}
