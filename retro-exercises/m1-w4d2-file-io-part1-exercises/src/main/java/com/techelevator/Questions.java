package com.techelevator;

public class Questions {

	private String quest;
	private String ans1;
	private String ans2;
	private String ans3;
	private String ans4;
	private String correct;
	
	public Questions(String quest, String ans1, String ans2, String ans3, String ans4, String correct){
		this.quest = quest;
		this.ans1 = ans1;
		this.ans2 = ans2;
		this.ans3 = ans3;
		this.ans4 = ans4;
		this.correct = correct;
	}

	public String getQuest() {
		return quest;
	}

	public String getAns1() {
		return ans1;
	}

	public String getAns2() {
		return ans2;
	}

	public String getAns3() {
		return ans3;
	}

	public String getAns4() {
		return ans4;
	}
	
	public String getCorrect() {
		return correct;
	}
	
}
