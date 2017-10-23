package com.techelevator.model;

import java.util.ArrayList;
import java.util.List;


public class LastTwoList {
	private String word1;
	private String word2;
	private String word3;
	private String word4;
	private String word5;
	private String word6;
	private String word7;
	private String word8;
	private String word9;
	private String word10;
	
	
	public List<String> makeWordList(){
		List<String> wordList = new ArrayList<>();
		wordList.add(word1);
		wordList.add(word2);
		wordList.add(word3);
		wordList.add(word4);
		wordList.add(word5);
		wordList.add(word6);
		wordList.add(word7);
		wordList.add(word8);
		wordList.add(word9);
		wordList.add(word10);
		return wordList;
	}
	
	public List<String> reverseWords(List<String> wordList){
		List<String> reverseList = new ArrayList<>();
		for(String element: wordList){
			if(element.length() <= 1){
				reverseList.add(element);
			} else {
				reverseList.add(element.substring(0, element.length()-2) + element.charAt(4) + element.charAt(3));
			}
		} return reverseList;
	}
}
