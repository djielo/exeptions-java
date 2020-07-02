package com.file;

import java.io.File;

public class gestionFichier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("text.txt");
		System.out.println("chemin absolu du fichier: " +f.getAbsolutePath());
		System.out.println("nom du fichier "+ f.getName());
		System.out.println("est-ce qu' il existe? "+f.exists());
		System.out.println("est-ce un repertoire "+f.isDirectory());
		System.out.println("Est-ce un fichier "+f.isFile());
		System.out.println("\n Affichage des lecteurs à la racine du pc");
		for( File file:f.listRoots())
		{
			System.out.println(file.getAbsoluteFile());
			try{
				int i=0;
				for(File nom:file.listFiles()){
					System.out.println("\t\t"+((nom.isDirectory())? nom.getName()+"/" : nom.getName()));
				
					if(i%4== 0){
						System.out.println("\n");
					}
					i++;
				}
				System.out.println("\n");
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}

	}


