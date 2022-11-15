/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.mycompany.Arrays;

/**
 *
 * @author Admin
 */
public class ColNoFixed {

    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6},
            {7,8,9}
        };

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col< arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
    
}
