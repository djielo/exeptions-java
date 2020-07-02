package com.collection.j;

import java.util.Enumeration;
import java.util.Hashtable;

public class LesMap {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable<>();
		// hastable n accepte pas la valeur nulle
		ht.put(1, "printemps");
		ht.put(10, "été");
		ht.put(12, "autonne");
		ht.put(9, "hiver");
		ht.put(13, "printemps");
		ht.put(17, "l'eau");
		ht.put(11, "lumiere");
		ht.put(1, "soleil");
		Enumeration e = ht.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		for (int i=0; i <ht.size(); i++){
			if(ht.contains("soleil")){
				System.out.println(ht.put(28, "jerome"));
			}
		}
		

	}

}
