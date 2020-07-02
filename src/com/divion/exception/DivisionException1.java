package com.divion.exception;

public class DivisionException1 {

	public static void main(String[] args) {
		int i=0;
		int j = 10;
		try{
		System.out.println("divion de "+1+ " par "+i+" est " + j/i);
		}catch(ArithmeticException e){
			System.out.println("division par zero impossible" +e.getMessage());
		}
		
	}

	}


