package com.stream;

import java.util.ArrayList;

public class LesMaps {

	public static void main(String[] args) {
		ArrayList<Integer> animalList= new ArrayList<>();
		animalList.add(1);
		animalList.add(2);
		animalList.add(3);
		animalList.add(4);
		animalList.add(5);
		animalList.add(6);
		animalList.add(7);
		animalList.add(8);
		animalList.add(9);
		animalList.add(10);
		animalList.add(11);
		animalList.stream()
		.filter(value -> value %2==1)
		.map(x-> x)
		.forEach(System.out::println);


	}

}
