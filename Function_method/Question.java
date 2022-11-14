/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Function__Methods;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // int n = in.nextInt();
        // boolean ans = isPrime(n);
        // System.out.println(ans);

        // boolean ans = isArmstrong(n);
        // System.out.println(ans);

        for(int i = 100;i <1000;i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }

    }

     static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while(n>0){
            int rem = n%10;
            sum = sum+ rem*rem*rem;
            n = n/10;

        }
           return sum == original;

     }













    
     static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c =2;
        while(c*c <=n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return c *c > n;
     }

}
