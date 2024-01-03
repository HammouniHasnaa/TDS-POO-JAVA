package td3;

public class Ex5 {
    public static void main(String[] args) {

    }
}
class Vehicul{
    private int nbrPassager;

    public Vehicul(int nbpassager) {
        this.nbrPassager = nbpassager;
    }

    public int getNbrPassager() {
        return nbrPassager;
    }

    public void setNbrPassager(int nbrPassager) {
        this.nbrPassager = nbrPassager;
    }

    @Override
    public String toString() {
        return "Vehicul{" +
                "nbrPassager=" + nbrPassager +
                '}';
    }
}

class Moto extends Vehicul{
    private int nbrRoues = 2;

    public Moto(int n, int nbrRoues) {
        super(n);
        this.nbrRoues = nbrRoues;
    }

    public Moto(int n) {
        super(n);
    }

    public int getNbrRoues() {
        return nbrRoues;
    }

    public void setNbrRoues(int nbrRoues) {
        this.nbrRoues = nbrRoues;
    }
}


class Avion extends Vehicul{
    private int nbrMoteur;

    public Avion(int nPr) {
        super(nPr);
    }

    public Avion(int nPr, int nbrMoteur) {
        super(nPr);
        this.nbrMoteur = nbrMoteur;
    }

    public int getNbrMoteur() {
        return nbrMoteur;
    }

    public void setNbrMoteur(int nbrMoteur) {
        this.nbrMoteur = nbrMoteur;
    }
}
class Triporteur extends Moto{
    int nbtri;

    public Triporteur(int n, int nbrRoues,int nbtri) {
        super(n, nbrRoues);
        this.nbtri=nbtri;
    }




}

