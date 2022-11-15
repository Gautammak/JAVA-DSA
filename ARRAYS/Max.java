/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Arrays;

import javax.sound.sampled.SourceDataLine;

/**
 *
 * @author Admin
 */
public class Max {
    public static void main(String[] args) {
        int[] arr = {2,4,5, 6};
       // System.out.println(max(arr));
       System.out.println(maxRange(arr, 1, 3));

       
    }

    //max val
//    static int max(int[] arr){
    //  if(arr.length == 0){
    //     return -1;
    //  }
//     int maxVal = arr[0];
//     for (int i = 0; i < arr.length; i++) {
//         if(arr[i] > maxVal){
//             maxVal = arr[i];
//         }
        
//     }
//     return maxVal;

//    }
  //work on edge cases here like arrray beign null   
static int maxRange(int[] arr,int start, int end){
    if(end > start){
        return -1;
    }

     if(arr == null){
        return -1;
     }
    int maxVal = arr[start];
    for (int i = start; i < end; i++) {
        if(arr[i] > maxVal){
            maxVal = arr[i];
        }
        
    }
    return maxVal;

   }
}
