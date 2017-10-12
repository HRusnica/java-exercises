package com.techelevator;

import java.io.File;
import java.util.Scanner;

import com.techelevator.view.Menu;

public class QuizMakerCLI {

	
private String filepath = "/Users/heatherrusnica/workspace/exercises/retro-exercises/m1-w4d2-file-io-part1-exercises/";

QuizMakerCLI() {
	this.filepath = filepath;
}

public QuizMakerCLI(String filePath) {
	this.filepath = filepath;
	File quizSheet = new File(filePath);
	if(!quizSheet.exists()){
		System.out.println("The file path does not exist.");
		System.exit(1);
	}
}

Scanner getIt = new Scanner(System.in);

public String askFile(){
	System.out.println("Please provide a filepath for your quiz." );
	filepath = getIt.nextLine();
	return filepath;
}

	public static void main(String[] args) {
		
		System.out.println(QuizMaker.getqAndA().get(0).getQuest());
		System.out.println("1) " + QuizMaker.getqAndA().get(0).getAns1());
		System.out.println("2) " + QuizMaker.getqAndA().get(0).getAns2());
		System.out.println("3) " + QuizMaker.getqAndA().get(0).getAns3());
		System.out.println("4) " + QuizMaker.getqAndA().get(0).getAns4());
		System.out.println("Please enter your answer ");
		
		
		
		
	}

	public String getFilepath() {
		return filepath;
	}

}
