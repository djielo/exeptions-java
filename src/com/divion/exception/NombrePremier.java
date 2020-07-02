package com.divion.exception;

import java.util.Scanner;

public class NombrePremier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" saisir un nombre");
		int valeur = sc.nextInt();
		if (valeur % 2 == 0) {
			System.out.println(valeur + " est un nombre paire");
		} else
			System.out.println(valeur + " est un nombre impaire");

	}
}