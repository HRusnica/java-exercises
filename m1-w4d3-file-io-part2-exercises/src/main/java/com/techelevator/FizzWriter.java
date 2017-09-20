package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {
	
		File fizzer = new File("FizzBuzz.txt");
		try(PrintWriter fizzy = new PrintWriter(fizzer)) {
		for(int i = 1; i <= 300; i++){
			if(i == 300){
				fizzy.println("FizzBuzz");
				break;
			}else if(i % 15 == 0){
				fizzy.print("FizzBuzz, ");
			}else if(i % 5 == 0){
				fizzy.print("Buzz, ");
			}else if(i % 3 == 0){
				fizzy.print("Fizz, ");
			}else fizzy.print(String.valueOf(i) + ", ");
		}
		} catch (FileNotFoundException e) {
			System.out.println("The file does not exist." );
			System.exit(1);
		}
	}
}
