/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Function__Methods;

import javax.sound.sampled.SourceDataLine;

/**
 *
 * @author Admin
 */
public class Scope {
    public static void main(String[] args) {
        
    
    int a = 10; 
    int b = 20;
    String name = "kunal";

   {
     //int a =78; //already initialiased outside the block in the same method ,hence you can notinitialiased again
     a =100;//reassign the origin ref ariable to some other value
     System.out.println(a);
     
     int c = 99;
     name = "Rahul";
     System.out.println(name);
  // values initialiased in this block will remain in block
   }
   int c =900; //butc cant use it outside box
    System.out.println(a);
    System.out.println(name);
 //  System.out.println(c); //cannot use outside the block
      
   //scoping in for loops
        for(int i =0;i<4;i++){
         //  System.out.println(i);
            //a =1000;
          //  int a = 10; cannot initialize again outside of box
        }
   System.out.println(a);
    }

    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }

    
}
