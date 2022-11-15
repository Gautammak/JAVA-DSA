
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.mycompany.Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class PassingFunction3 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,4};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr){
        arr[0] = 99;
    }
    
}
