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
public class MultidimentionalArrayList7 {
    public static void main(String[] args) {
        Scanner in =new  Scanner(System.in);
    
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    for(int i = 0 ; i<3;i++){
        list.add(new ArrayList<>());

    }

    //add element
    for (int i = 0; i < 3; i++) {
        for(int j = 0 ; j<3; j++){
            list.get(i).add(in.nextInt());
        }
        
    }

     System.out.println(list);
    
}
}