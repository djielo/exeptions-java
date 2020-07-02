package com.divion.exception;
import com.divion.exception.*;

public class Ville {
	String pNom;
	int pNbre;
	String pPays;
	

	public Ville(String pNom, int pNbre, String pPays) throws Nombrhabitantexception
		{
			if(pNbre < 0)
				throw new Nombrhabitantexception();
			 else 
			{
				this.pNom = pNom;
				this.pNbre = pNbre;
				this.pPays = pPays;	
			}
		}
	
	


	@Override
	public String toString() {
		return "Ville [pNom=" + pNom + ", pNbre=" + pNbre + ", pPays=" + pPays + "]";
	}




	public static void main(String[] args) {
		try{
		Ville v = new Ville ("paris",100, "france");
		System.out.println(v.toString());
		}catch(Nombrhabitantexception e){}
	}

}
