
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.mycompany.Arrays;

import java.util.Arrays;
import java.util.Scanner;

import com.mycompany.Arrays.Main1;

/**
 *
 * @author Admin
 */
public class input2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 333;
        arr[3] = 44;
        arr[4] = 444;
        //[23,45,333,44,444];
    //    System.out.println(arr[3]); //44

        //  for(int i=0;i<arr.length;i++){
        //     arr[i] = in.nextInt();

        //  }

        //  System.out.println(Arrays.toString(arr));

        //  for(int i=0;i<arr.length;i++){        // 1 2 3 4 5 
        //     System.out.print(arr[i] + " ");   //1  2 4 5 5
                                         
        //  }
               
        // for(int num: arr){ // for every element in array,print the element
        //     System.out.print(num + " "); //here num represent element of the array //1 2 3 4 5 
        // }


     // System.out.println(arr[5]); //arrays index is outof bound

     //array of object

      String[] str = new String[4];
      for(int i = 0; i < str.length;i++){
        str[i] = in.next();
       
      }

      System.out.println(Arrays.toString(str));





    }
    
}
