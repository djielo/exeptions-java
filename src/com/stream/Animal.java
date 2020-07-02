package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Animal {
	
    /* public MonSream() {
		super();
		// TODO Auto-generated constructor stub
	}*/

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<Integer> animalList = new ArrayList<> ();
        animalList.add (1);
        animalList.add (2);
        animalList.add (3);
        animalList.add (4);
        animalList.add (5);
        animalList.add (6);
        animalList.add (7);
        animalList.add (8);
        animalList.add (9);
        animalList.add (10);
        animalList.add (11);
        animalList.stream ()
                .filter (value -> value % 2 == 0)
                .forEach (System.out::println);
    }
}

