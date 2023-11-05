package td2;

public class Rectangle {
    public int longeur;
    public int largeur;

    public Rectangle(){}
    public Rectangle(int largeur,int longeur){
        this.largeur=largeur;
        this.longeur=longeur;
    }
    public Rectangle(Rectangle rectangle){
        this.longeur=rectangle.getLongeur();
        this.largeur=rectangle.getLargeur();
    }

    public int getLongeur() {
        return longeur;
    }

    public void setLongeur(int longeur) {
        this.longeur = longeur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int Perimetre(int longeur,int largeur){
        int res=2*(this.longeur+this.largeur);
        return res ;
    }
    public int air(int longeur,int largeur){
        int res=this.largeur*this.longeur;
        return res;
    }
    public boolean iscarre(int longeur,int largeur){
        if(this.longeur==this.largeur)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longeur=" + longeur +
                ", largeur=" + largeur +
                '}';
    }
}
