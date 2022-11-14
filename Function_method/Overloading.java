/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Function__Methods;

/**
 *
 * @author Admin
 */
public class Overloading {
       
    public static void main(String[] args) {
        fun(54);
        fun("gautam");
        //int ans = sum(3,4);
        int ans = sum(3,4,3);
        System.out.println(ans);
    }
    static int sun(int a, int b){
        return a+b;
    }
   
    static int sum(int a,int b,int c){
        return a+b+c;
    }



    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println("second one");
        System.out.println(name);
    }
    
}
