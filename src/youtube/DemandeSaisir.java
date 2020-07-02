package youtube;

import java.util.Scanner;

public class DemandeSaisir {
    public static void  main(String [] arg){
        Scanner sc = new Scanner (System.in);
        System.out.println ("Saisir un nombre entiet");
        int nombre = sc.nextInt ();
        int somme = 0;
        for( int i=1; i <= nombre; i++){
            somme =somme + i;
        }
        System.out.println ("la somme des premiers nombres est "+ somme);
    }
}
