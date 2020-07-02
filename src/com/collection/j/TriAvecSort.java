package com.collection.j;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TriAvecSort {
    public static  void main(String[] agrs){
        List<Integer> maListe = new ArrayList<>();
        maListe.add (10);
        maListe.add (8);
        maListe.add (5);
        maListe.add (8);
        maListe.add (0);
        maListe.add (15);
        maListe.add (8);
        maListe.add (12);
        maListe.add (20);
        maListe.add (2);
        Collections.sort (maListe);
        for(Integer ls:maListe){
            System.out.println (ls);
        }
    }
}
