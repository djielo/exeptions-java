package com.stream;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class LesReduces {


		public static void main(String[] args) {
			ArrayList<Integer> animalList= new ArrayList<>();
			Stream<Integer> sn =animalList.stream();
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
			 sn= animalList.stream();
			 Optional<Integer> sum= sn.filter(value -> value %2==1)
			.map(x-> x)
			.reduce((x,y) -> x+y );
			 System.out.println(sum);

	}

}
