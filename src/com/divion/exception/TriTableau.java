package com.divion.exception;

public class TriTableau {

	public static void main(String[] args) {
		int tableau[] = { 9, 10, 89, 12, 78, 3, 85, 96, 4, 8, 25, 32, 47 };
		int temp;
		for (int i = tableau.length - 2; i >= 1; i--) {
			for (int j = 0; j <= i; j++) {
				if (tableau[j + 1] < tableau[j]) {
					temp = tableau[j];
					tableau[j] = tableau[j + 1];
					tableau[j + 1] = temp;
				}

			}

		}
		for(int j = 0; j < tableau.length; j++){
			System.out.println(tableau[j]);
		}
	}
}
