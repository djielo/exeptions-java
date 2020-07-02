package com.reflexivite;

public class InstanceDynamique {

private String valeur1;
private String valeur2;

	public InstanceDynamique() {
	super();
	// TODO Auto-generated constructor stub
}

	public InstanceDynamique(String valeur1, String valeur2) {
		super();
		this.valeur1 = valeur1;
		this.valeur2 = valeur2;
	}

	public String getValeur1() {
		return valeur1;
	}

	public void setValeur1(String valeur1) {
		this.valeur1 = valeur1;
	}

	public String getValeur2() {
		return valeur2;
	}

	public void setValeur2(String valeur2) {
		this.valeur2 = valeur2;
	}

	@Override
	public String toString() {
		return "InstanceDynamique [valeur1=" + valeur1 + ", valeur2=" + valeur2 + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
