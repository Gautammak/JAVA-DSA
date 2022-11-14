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
public class Changevalue {
    public static void main(String[] args) {
        
    
    //create an array

    int[] arr = {1,3,2,45,6};
    change(arr);
    System.out.println(Arrays.toString(arr));
  
}

static void change(int[] nums){
    nums[0] = 99;//if you make a change to object via this ref varible same object will be channge
}
}