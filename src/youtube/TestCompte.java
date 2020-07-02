package youtube;

public class TestCompte {
    public  static void  main(String[] args){
        Compte compte= new Compte (100.0);
        compte.deposer (25.0);
        compte.retirer (20.0);
        compte.afficher ();
       ;
    }
}
