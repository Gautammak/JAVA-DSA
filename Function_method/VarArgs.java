/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Function__Methods;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class VarArgs {
    public static void main(String[] args) {
       // fun(3,4,7,7,6,55,5,4);
      // multiple(2, 3, "kunal","gautam");
     // demo(2,32);
     demo("aa","b");
    }
   
     static void demo(int ...v){
        System.out.println(Arrays.toString(v));
     }


     static void demo(String ...v){
        System.out.println(Arrays.toString(v));
     }


    static void multiple(int a , int b, String ...v){
        System.out.println(Array.toString(v));

    }
    // static void fun(int ...v){
        //System.out.println(Arrays.toString(v));

    // }
    
}
