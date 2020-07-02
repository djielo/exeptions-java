package com.collection.j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LesSort {
    public static void  main (String [] agrs){
        // initialisation du tableau
    int maTable[] ={1,8,6,98,12,74,95,654,21,78,73,32,0,1,62,17,107,15,68,94};
    // creation d un tableau contient les objects integer
        //Integer matab[] = new Integer[maTable.length];
        // affichage du tableau avant le tri
        for(int i=0; i< maTable.length; i++){
            System.out.println (maTable[i]);
        }
        System.out.println ("Bonjour");
        int temp;
        for (int i =0; i < maTable.length; i++){
            for (int j=i+1; j < maTable.length ; j++){
                if(maTable[j] > maTable[i] ){
                    temp=maTable[i];
                    maTable[i]= maTable[j];
                    maTable[j] = temp;
                }
            }
        }
        for(int i=0; i < maTable.length; i++){
            System.out.println (maTable[i]);
        }
        System.out.println ("Bonjour");
        List<String> liste = new ArrayList<> ();

}
}
