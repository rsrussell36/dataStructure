/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructure;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Input {
	int num, i, j;
    Scanner input = new Scanner(System.in);
 
    public int[] sort_input() {
        System.out.println("Enter the number of integers to sort:");
        num = input.nextInt();
     
        int arr[] = new int[num];
     
        System.out.println("Enter " + num + " integers: ");
     
        for (i = 0; i < num; i++) {
          arr[i] = input.nextInt();
        }
    	
        return arr;
    }
	
}