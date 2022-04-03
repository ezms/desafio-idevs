package com.idevs.desafio;

import java.util.ArrayList;

public class DesafioDois {
	public ArrayList<String> challenge() {
		ArrayList<String> sameDividersList = new ArrayList<String>();
		int posDivider = 0;

		for (int i = 1; i <= 10000; i++) {
			int counter = dividersCounter(i);
			int valueToSave = i - 1;

			if (posDivider == counter) {
				sameDividersList.add(String.valueOf(valueToSave));
			}

			posDivider = counter;
		}

		return sameDividersList;
	}

	private int dividersCounter(int number) {
		int counter = 1;

		for (int i = 1; i <= (number / 2); i++) {
			if (compareIndex(number, i)) {
				counter++;
			}
		}

		return counter;
	}

	private boolean compareIndex(int parentIndex, int childIndex) {
		return parentIndex % childIndex == 0;
	}
}
