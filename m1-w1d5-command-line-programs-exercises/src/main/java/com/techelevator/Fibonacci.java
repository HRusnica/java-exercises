package com.techelevator;

import java.util.ArrayList;
import java.util.Scanner;


/*
 The Fibonacci numbers are the integers in the following sequence:  
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 
Write a command line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number.

  
 $ java Fiboncci
 
Please enter the Fibonacci number: 25
 
 0, 1, 1, 2, 3, 5, 8, 13, 21
 */
public class Fibonacci {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int num = input.nextInt();
		//int[] sequence = new int [100]; 
		//int j = 0;
		
		System.out.print(fibonacci(num));
	}
		
	public static ArrayList<Integer> fibonacci(int num){
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(0);
		myList.add(1);
		for (int i = 0; myList.get(i + 1) < num; i++) {
			myList.add(myList.get(i) + myList.get(i+1));
		} 
		
		myList.remove(myList.size() - 1);
		return myList;
	}
	
//	public static int[] fibonacci(int[] sequence, int num){
//		for (int j = 0; sequence[j] < num; j++) { 
//			if (j  == 0) {
//		sequence[0] = 0;
//			} else if (j == 1) {
//		sequence[1] = 1;
//			}
//		for (int i = 2; i < 100; i++) {
//		sequence[i] = (sequence[i-2] + sequence[i-1]);
//		}
//		return sequence[]; 
//		}
//	}
}
	
	/* trying to use an ArrayList to solve the problem of unknown Array length...
	 */
	 	
	
		/*public static int arraySize(int num, int j){
			for (j = 1; j < num; j++){
				j = j + j - 1;
				return j; */
	

			
			
			

		

