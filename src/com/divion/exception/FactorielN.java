package com.divion.exception;

import java.util.Scanner;

public class FactorielN {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("saisir un nombre");
		int nombre = sc.nextInt();
		int fact = 1;
		if(nombre !=0)
		for( int i = 1; i <= nombre; i++ ){
		fact = fact * i;	
		}
		System.out.println(fact);
	}
	}


