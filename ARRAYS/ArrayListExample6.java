/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ArrayListExample6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list  = new ArrayList<>(10);
      //  list.add(67);
        // list.add(62);
        //  list.add(67);
        //   list.add(63);
        //    list.add(65);
        //     list.add(67);

        //    System.out.println(list.contains(67)); //true
        //      System.out.println(list.contains(68)); //false

        // list.set(0,99);

        // list.remove(2);

        // System.out.println(list);
       
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
            
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here2 
            
        }

 //       System.out.println(list);
    }
    
    
}
