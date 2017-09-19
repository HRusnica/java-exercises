package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class KataRomanNumerals {
public String ones;
public String tens;
public String hundreds;
public String thousands;
public int input;
public int[] numArray;
public ArrayList<String> romNumeralArray = new ArrayList<String>();
	

	public int[] convertToNumArray(int input) {
		String numString =  Integer.toString(input);
		char[] charArray = numString.toCharArray();
		int[] numArray = new int[charArray.length];
		for(int i = 0; i < charArray.length; i++){
			numArray[i] = Character.getNumericValue(charArray[i]);
		}
	return numArray;
	}
	
	public String findValues(int input){
		numArray = convertToNumArray(input);
		if(numArray.length == 4){
			return convertThousands(numArray[0]) + convertHundreds(numArray[1]) + convertTens(numArray[2]) + convertOnes(numArray[3]);
		}
		if(numArray.length > 2){
			return convertHundreds(numArray[0]) + convertTens(numArray[1]) + convertOnes(numArray[2]);
		}
		if(numArray.length > 1){
			return convertTens(numArray[0]) + convertOnes(numArray[1]);
		}
		if(numArray.length != 0){
			return convertOnes(numArray[0]);
		}
		return null;
	}
	
	public String convertOnes(int input) {
		String ones = "";
		if(input == 0){
			return "";
		}else if(input < 4){
			for(int i = 0; i < input; i++){
			ones += "I";
			}
		} else if (input == 4){
			ones = "IV";
		} else if(input == 5){
			ones = "V";
		} else if(input > 5 && input <= 8){
			ones = "V";
			for(int i = 6; i <= input; i++){
			ones += "I";
			}
		} if(input == 9){
			ones = "IX";
		}
		return ones;
		}
	
	public String convertTens(int input) {
		String tens = "";
			if(input == 0){
				return "";
			} else if(input < 4){
			for(int i = 0; i < input; i++){
			tens += "X";
			}
		} else if (input == 4){
			tens = "XL";
		} else if(input == 5){
			tens = "L";
		} else if(input > 5 && input <= 8){
			tens = "L";
			for(int i = 6; i <= input; i++){
			tens += "X";
			}
		} if(input == 9){
			tens = "XC";
		}
		return tens;
		}
	
	public String convertHundreds(int input) {
		String hundreds = "";
			if(input == 0){
				return "";
			} else if(input < 4){
			for(int i = 0; i < input; i++){
			hundreds += "C";
			}
		} else if (input == 4){
			hundreds = "CD";
		} else if(input == 5){
			hundreds = "D";
		} else if(input > 5 && input <= 8){
			hundreds = "D";
			for(int i = 6; i <= input; i++){
			hundreds += "C";
			}
		} if(input == 9){
			hundreds = "CM";
		}
		return hundreds;
		}
	
	public String convertThousands(int input) {
		String thousands = "";
			for(int i = 0; i < input; i++){
			thousands += "M";
			}
		return thousands;
		}
	
	
public List<String> convertToArray(String romNumeral, List<String> romNumeralArray) {
	char[] romNumCharArray = romNumeral.toCharArray();
	for(int i = 0; i < romNumCharArray.length; i++){
		romNumeralArray.add(String.valueOf(romNumCharArray[i]));
	}
		return romNumeralArray;
	}
	
}

