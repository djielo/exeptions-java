package com.reflexivite;

public class GetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c= String.class;
		Class c2 = new String().getClass();
		System.out.println(c2);
		System.out.println("\n");
		System.out.println(c);
		System.out.println("\n");
		Class [] faces = c.getInterfaces();
		for ( Class cc:faces){
			System.out.println(cc);
		}
	}

}
