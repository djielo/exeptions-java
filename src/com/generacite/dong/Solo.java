package com.generacite.dong;

public class Solo<T> {
private T valeur;

	
	public Solo() {
	super();
	// TODO Auto-generated constructor stub
}


	public Solo(T valeur) {
		super();
		this.valeur = valeur;
	}


	public T getValeur() {
		return valeur;
	}


	public void setValeur(T valeur) {
		this.valeur = valeur;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solo<Integer> val = new Solo<Integer>(10);
		int nombre = val.getValeur();
		System.out.print(nombre);
		Solo<String> sl=new Solo<String>("merci jerome");
		System.out.println("\n\n");
		System.out.println(sl.getValeur());

	}

}
