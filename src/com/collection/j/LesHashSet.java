package com.collection.j;

import java.util.HashSet;
import java.util.Iterator;

public class LesHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet<>();
		hs.add("amos");
		hs.add("daniel");
		hs.add("dongmo");
		hs.add("jerome");
		hs.add("djielo");
		hs.add("toukem");
		Iterator it = hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}
