package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMaker {
	private File quizSheet;
	private List<Questions> qAndA;
	
	public QuizMaker(String filepath) {
		this.qAndA = qAndA;
	}

	private List<Questions> readFile(String filepath) throws FileNotFoundException{
		QuizMakerCLI ourQM = new QuizMakerCLI();
		File quizSheet = new File(ourQM.askFile());
		Scanner input = new Scanner(quizSheet);
		List<Questions> qAndA = new ArrayList<>();
		String[] quiz = new String[5];
		while(input.hasNext()){
			String line = input.nextLine();
			quiz = line.split("\\|");
			for(String element : quiz)
				if (element.contains("*")){
					String targetAns = element;
					element.equals(element.replace("*", ""));
					qAndA.add(new Questions(quiz[0], quiz[1], quiz[2], quiz[3], quiz[4], targetAns));
					}
		}	return qAndA;
	}

public List<Questions> getqAndA() {
	return qAndA;
}
}
