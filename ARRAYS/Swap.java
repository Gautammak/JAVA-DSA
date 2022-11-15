/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Arrays;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class Swap {

    public static void main(String[] args) {
        int[] arr = {2,4,5, 6,5,};
     //   swap(arr,1,2);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
       while(start < end){
        //swap
        swap(arr,start,end);
        start++;
        end--;
       }

    }








    
    static void swap(int[] arr, int index1,int index2  ){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] =  temp;

   }
}
