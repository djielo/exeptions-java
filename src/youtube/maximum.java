package youtube;

import com.sun.org.apache.xpath.internal.objects.XBoolean;

import java.util.Scanner;

public class maximum {
    public static void main(String[] arg) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Saisir un  premier nombre entiet");
        int nombre1 = sc.nextInt ();
        System.out.println ("Saisir un  premier nombre entiet");
        int nombre2 = sc.nextInt ();

        if(nombre2 > nombre1){
            System.out.println ("le maximum est "+nombre2);
        } else{
            if(nombre1>nombre2){
                System.out.println ("le maximum est "+nombre1);
        }


    }
}
}