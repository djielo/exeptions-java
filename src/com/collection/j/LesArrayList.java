package com.collection.j;

import java.util.ArrayList;
import java.util.List;

public class LesArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String > maFamille = new ArrayList<>();
		maFamille.add("jerome");
		maFamille.add("guy");
		maFamille.add("jean");
		maFamille.add("paul");
		maFamille.add("robert");
		maFamille.add("lesly");
		for( String mf: maFamille){
		System.out.println(mf);
		}
	}

}
