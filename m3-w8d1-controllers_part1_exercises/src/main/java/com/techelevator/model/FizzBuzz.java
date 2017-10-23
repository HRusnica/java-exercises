package com.techelevator.model;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzz {
	private int divisor1;
	private int divisor2;
	private String fizzWord;
	private String buzzWord;
	private int num1;
	private int num2;
	private int num3;
	private int num4;
	private int num5;
	
	public FizzBuzz(){
	}
	
	public FizzBuzz(int divisor1, int divisor2, String fizzWord, String buzzWord, int num1, int num2, int num3, int num4, int num5){
		this.divisor1=divisor1;
		this.divisor2=divisor2;
		this.fizzWord=fizzWord;
		this.buzzWord=buzzWord;
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
		this.num4=num4;
		this.num5=num5;
	}
	
	public Map<Integer, String> getFizzBuzzMap(){
	Map<Integer, String> parameters = new HashMap<>();
	
	int[] nums = new int[5];
	nums[0] = num1;
	nums[1] = num2;
	nums[2] = num3;
	nums[3] = num4;
	nums[4] = num5;
	
	for(int element: nums){
	if(element % divisor1 == 0 && element % divisor2 ==0){
		parameters.put(element, element + fizzWord + buzzWord);
	} else if(element % divisor1 == 0){
		parameters.put(element, element + fizzWord);
	} else if(element % divisor2 == 0){
		parameters.put(element, element + buzzWord);
	} else parameters.put(element, Integer.toString(element));
	}
	return parameters;
	}
	
	
	public int getDivisor1() {
		return divisor1;
	}
	public void setDivisor1(int divisor1) {
		this.divisor1 = divisor1;
	}
	public int getDivisor2() {
		return divisor2;
	}
	public void setDivisor2(int divisor2) {
		this.divisor2 = divisor2;
	}
	public String getFizzWord() {
		return fizzWord;
	}
	public void setFizzWord(String fizzWord) {
		this.fizzWord = fizzWord;
	}
	public String getBuzzWord() {
		return buzzWord;
	}
	public void setBuzzWord(String buzzWord) {
		this.buzzWord = buzzWord;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getNum3() {
		return num3;
	}
	public void setNum3(int num3) {
		this.num3 = num3;
	}
	public int getNum4() {
		return num4;
	}
	public void setNum4(int num4) {
		this.num4 = num4;
	}
	public int getNum5() {
		return num5;
	}
	public void setNum5(int num5) {
		this.num5 = num5;
	}

}
