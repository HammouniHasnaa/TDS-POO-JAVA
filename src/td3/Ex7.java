package td3;

public class Ex7 {
    public static void main(String args[]) {

    }
}
abstract class Employee{
    String nom;
    String prenom;
    public Employee(){
    }
    public Employee(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public abstract int gain();
    @Override
    public String toString() {
        return "Employee{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

}
 class Patron extends Employee{
    int salaire;
    public Patron(){
    }

     public Patron(String nom, String prenom, int salaire) {
         super(nom, prenom);
         this.salaire = salaire;
     }

     public int getSalaire() {
         return salaire;
     }

     public void setSalaire(int salaire) {
         this.salaire = salaire;
     }

     @Override
     public String toString() {
         return "Patron{" +
                 "salaire=" + salaire +
                 ", nom='" + nom + '\'' +
                 ", prenom='" + prenom + '\'' +
                 '}';
     }

     @Override
     public int gain() {
         return salaire;
     }
 }
class TravailleurCommission extends Employee{
    int salaire;
    int commission;
    int quantite;



    public TravailleurCommission(String nom, String prenom, int salaire, int commission) {
        super(nom, prenom);
        this.salaire = salaire;
        this.commission = commission;

    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public int gain() {
        return this.salaire;
    }

    @Override
    public String toString() {
        return "TravailleurCommission{" +
                "salaire=" + salaire +
                ", commission=" + commission +
                ", quantite=" + quantite +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
 class travailleurhoraire extends Employee{
int retribution;
int heures;

     public travailleurhoraire() {

     }

     @Override
     public int gain() {
         return this.getRetribution();
     }

     public travailleurhoraire(String nom, String prenom, int retribution) {
         super(nom, prenom);
         this.retribution = retribution;

     }

     public int getRetribution() {
         return retribution;
     }

     public void setRetribution(int retribution) {
         this.retribution = retribution;
     }

     public int getHeures() {
         return heures;
     }

     public void setHeures(int heures) {
         this.heures = heures;
     }

     @Override
     public String toString() {
         return "travailleurhoraire{" +
                 "retribution=" + retribution +
                 ", heures=" + heures +
                 ", nom='" + nom + '\'' +
                 ", prenom='" + prenom + '\'' +
                 '}';
     }
 }
