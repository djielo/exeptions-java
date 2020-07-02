package youtube;

public class Compte {
    public Double solde;

    public Compte() {
    }

    public Compte(Double solde) {
        this.solde = solde;
    }
    public void deposer (Double  d){
       this.solde +=d ;
    }
    public void retirer( double r){
        this.solde -=r;

    }
    public void afficher(){
        System.out.println ("le solde est "+this.solde);
    }
}
