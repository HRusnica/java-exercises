package com.techelevator;

public class HomeworkAssignment {

	public int totalMarks;
	private int possibleMarks;
	private String submitterName;
	
	public String getLetterGrade() {
		if ((totalMarks * 100) / possibleMarks >= 90 ) {
			return "A";
		} else if ((totalMarks * 100) / possibleMarks >= 80) {
			return "B";
		} else if ((totalMarks * 100) / possibleMarks >= 70) {
			return "C";
		} else if ((totalMarks * 100) / possibleMarks >=60) {
			return "D";
		} return "F";
		}
	
	public HomeworkAssignment(int possibleMarks){
		this.possibleMarks = possibleMarks; 
	}
	
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public int getPossibleMarks() {
		return possibleMarks;
	}

	public String getSubmitterName() {
		return submitterName;
	}

	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}
		
	}		
	
