package com.techelevator;

import java.util.List;

public class KataRomanToNormal {

	public String romanNumeral;	
	public int normNumber;
	char I = 'I';
	char V = 'V';
	char X = 'X';
	char L = 'L';
	char C = 'C';
	char D = 'D';
	char M = 'M';
	
	public int main(String romanNumeral){
		int normNumber = findValue(romanNumeral);
		if (findFour(romanNumeral)){
			normNumber -= 2;
		}
		if (findNine(romanNumeral)){
			normNumber -= 2;
		}
		if (findForty(romanNumeral)){
			normNumber -= 20;
		}
		if (findNinety(romanNumeral)){
			normNumber -= 20;
		}
		if (findFourhundred(romanNumeral)){
			normNumber -= 200;
		}
		if (findNinehundred(romanNumeral)){
			normNumber -= 200;
		}
		return normNumber;
	}
	
	public int findValue(String romanNumeral){
		char[] romanChars = romanNumeral.toCharArray();
		for(char element : romanChars){
			if(element == I){
				normNumber++;
			} if(element == V){
				normNumber += 5;
			} if(element == X){
				normNumber += 10;
			} if(element == L){
				normNumber += 50;
			} if(element == C){
				normNumber += 100;
			} if(element == D){
				normNumber += 500;
			} if(element == M){
				normNumber += 1000;
			}
		}
			return normNumber;
		}
	
	public boolean findFour(String romanNumeral){
		return romanNumeral.contains("IV");
	}
	
	public boolean findNine(String romanNumeral){
		return romanNumeral.contains("IX");
	}
	
	public boolean findForty(String romanNumeral){
		return romanNumeral.contains("XL");
	}
	
	public boolean findNinety(String romanNumeral){
		return romanNumeral.contains("XC");
	}
	
	public boolean findFourhundred(String romanNumeral){
		return romanNumeral.contains("CD");
	}
	
	public boolean findNinehundred(String romanNumeral){
		return romanNumeral.contains("CM");
	}
	
}
