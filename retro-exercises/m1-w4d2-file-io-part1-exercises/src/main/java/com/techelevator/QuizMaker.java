package com.techelevator;

import java.io.File;
import java.util.Scanner;

public class QuizMaker {
	Scanner input = new Scanner(quizSheet);
	private File quizSheet;

	
	public String readFile(String filepath, File auizSheet){
		quizSheet = new File(QuizMakerCLI.askFile());
		while(input.hasNextLine(quizSheet)){
			String line = split(input.NextLine(quizSheet));

		}
	}
}
