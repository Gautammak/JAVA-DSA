/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.mycompany.Function__Methods;

/**
 *
 * @author Admin
 */
public class Swap {
    
  
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

    //swap number
    //  int temp = a;
    //  a = b;
    //  b = temp;

      swap(a,b);

     System.out.println(a + " " + b);
     String name = "gautam makavana" ;
     changename(name);
     System.out.println(name);  
}
   static void changename(String naam) {
    naam = "gautam"; //creating a new  object
    
   }





static void swap(int num2,int num1){
    int temp = num1;
    num1 = num2;
    num2 = temp;

    // this change will only be valid in this function  scope only.
}
}
