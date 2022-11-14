/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.mycompany.Function__Methods;
import java.util.*;

/**
 *
 * @author Admin
 */
public class Sum {
    public static void main(String[] args) {
    //   int ans =  sum2();
    //   System.out.println(ans);
    int ans = sum3(20, 30);
    System.out.println(ans);
    }
    //pass the value of number when you are calling the method in main()

       static int sum3(int a,int b){
        int sum = a + b;
        return sum;
       }









    //return the value
static int sum2(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter num1");
    int num1 = sc.nextInt();
    System.out.println("enter num2");
    int num2 = sc.nextInt(); 
    int sum = num1+num2;
    return sum;
  //System.out.println("this will never execute");
}






   static  void sum(){
      
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1");
        int num1 = sc.nextInt();
        System.out.println("enter num2");
        int num2 = sc.nextInt(); 
        int sum = num1+num2;
        System.out.println(" sum is:"+ sum);
       
    }

    /*
     * access modifier (we'll look in oop) 
     * return type name(arguments){
     * //body
     * return statement;
     * }
     */
    
}
