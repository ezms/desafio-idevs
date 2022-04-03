package com.idevs.desafio;

import java.util.Scanner;

public class DesafioTres {
	Scanner scanner = new Scanner(System.in);

	public int challenge() {
		int amount = 0;
		int result = 0;
		int primeNumbers = 0;
		
		System.out.println("🔢 Número:");
		int inputNumber = scanner.nextInt();
		scanner.close();
		
		for (int i = 1; i < inputNumber; i++) {
			if (getPrimeNumber(i)) {
				primeNumbers = i;
				amount += i;
			}
			
			if (amount == inputNumber) {
				result = primeNumbers;
			}
		}

		return result;
	}

	private boolean getPrimeNumber(int number) {
		if (number == 2)
			return true;
		if (number < 2)
			return false;

		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				return false;
		}

		return true;
	}
}
