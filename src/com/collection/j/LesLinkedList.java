package com.collection.j;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LesLinkedList {
public static  void main(String[] args) {
	List linklist = new LinkedList<>();
	linklist.add("nicole");
	linklist.add("joel");
	linklist.add("ariane");
	linklist.add("george");
	linklist.add("ramcesse");
	
	System.out.println(linklist);
	System.out.println("\n");
	for( int j=0; j <linklist.size();j++){
		System.out.println("l element " +j+" = "+ linklist.get(j));
	}
	System.out.println("parcours avec listIterator \n");
	// listIterator recupere la liste declaré
	ListIterator li = linklist.listIterator();
	while(li.hasNext()){
		System.out.println(li.next());
	}
	
}
}
