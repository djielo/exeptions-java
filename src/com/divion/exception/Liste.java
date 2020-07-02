package com.divion.exception;

import java.util.ArrayList;
import java.util.List;

public class Liste {
	
	public static void main(String[] args) {
		List<String> maFamille = new ArrayList<>();
		maFamille.add("jerome");
		maFamille.add("joel");
		maFamille.add("jean");
		maFamille.add("paul");
		maFamille.add("francis");
		maFamille.add("mado");
		maFamille.add("charlotte");
		maFamille.add("kevin");
		for(String f:maFamille){
			System.out.println(f);
			
		}

	}

}
