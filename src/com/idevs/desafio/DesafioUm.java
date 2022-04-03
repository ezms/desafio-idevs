package com.idevs.desafio;

import java.util.Scanner;

public class DesafioUm {
	String lettersWithValueOne = "AEIOULNRST";
	String lettersWithValueTwo = "DG";
	String lettersWithValueThree = "BCMP";
	String lettersWithValueFour = "FHVWY";
	String lettersWithValueFive = "K";
	String lettersWithValueEight = "JX";
	String lettersWithValueTen = "QZ";
	
	Scanner scanner = new Scanner(System.in);
	
	public int challenge() {
		System.out.println("➡ Descubra qual o valor da Palavra!!! \n");
		System.out.println("🔤 Palavra: ");
		String[] word = scanner.nextLine().split("");
		int result = 0;
		
		for (int i = 0; i < word.length; i++) {
			String letter = word[i].toUpperCase();

			if (containsInSentence(lettersWithValueOne, letter)) result += 1;
			else if (containsInSentence(lettersWithValueTwo, letter)) result += 2;
			else if (containsInSentence(lettersWithValueThree, letter)) result += 3;
			else if (containsInSentence(lettersWithValueFour, letter)) result += 4; 
			else if (containsInSentence(lettersWithValueFive, letter)) result += 5;
			else if (containsInSentence(lettersWithValueEight, letter)) result += 8;
			else if (containsInSentence(lettersWithValueTen, letter)) result += 10;
		}
		
		return result;
	}
	
	private static boolean containsInSentence(String sentence, String letter) {
		return sentence.contains(letter);
	}
}
