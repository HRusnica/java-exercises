package com.techelevator;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args){
			String searchWord;
			int lineCount = 0;
			
		System.out.println("Please enter a search word. ");
		Scanner scanner = new Scanner(System.in);
		searchWord = scanner.nextLine();
		System.out.println("Please provide the path for a textfile and I will provide the word count. ");
		String filepath = scanner.nextLine();
		System.out.println("Does case matter? Please enter (Y/N)? ");
		if(scanner.nextLine().equals("N")){
			try{File searchText = new File(filepath);
			Scanner input = new Scanner(searchText);
			while(input.hasNextLine()){
			String line = input.nextLine();
			lineCount++;
			if( line.toLowerCase().contains(searchWord.toLowerCase())){
				System.out.println(lineCount + ") " + line);
			}
			}
			}
			catch (FileNotFoundException e) {
				System.out.println("The file is not at that filepath");
			}	
		}
		try{File searchText = new File(filepath);
		Scanner input = new Scanner(searchText);
		while(input.hasNextLine()){
		String line = input.nextLine();
		lineCount++;
		if(line.contains(searchWord)){
			System.out.println(lineCount + ") " + line);
		}
		}
		}
		catch (FileNotFoundException e) {
			System.out.println("The file is not at that filepath");
		}
	}
}
