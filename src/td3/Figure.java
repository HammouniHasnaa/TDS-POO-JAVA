package td3;

public abstract class Figure {
    private String nom;

    public Figure() {

    }
    protected Figure(String nom) {
        this.nom = nom;
    }

    public abstract String getPerimetre();

    public abstract String getAire();

    @Override
    public String toString() {
        return "Figure{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
class Disque extends Figure{
    int centre;
    int r;
    public Disque() {
    }
    public Disque(int centre, int r) {
        this.centre = centre;
        this.r = r;
    }
    public Disque(String nom, int centre, int r) {
        super(nom);
        this.centre = centre;
        this.r = r;
    }

    @Override
    public String getAire() {
        return "la'ire est"+2*Math.PI*this.getR();
    }

    @Override
    public String getPerimetre() {

        return "le perimetre est "+Math.PI*this.r*this.r;
    }

    public int getCentre() {
        return centre;
    }

    public void setCentre(int centre) {
        this.centre = centre;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
 class Rectangle extends Figure{
    int lang;
    int larg;
    public Rectangle(){
    }
    public Rectangle(int lang,int larg){
        this.lang=lang;
        this.larg=larg;
    }
    public Rectangle(String nom,int lang,int larg){
        super(nom);
        this.lang=lang;
        this.larg=larg;
    }

    public int getLang() {
        return lang;
    }

    public void setLang(int lang) {
        this.lang = lang;
    }

    public int getLarg() {
        return larg;
    }

    public void setLarg(int larg) {
        this.larg = larg;
    }

     @Override
     public String getPerimetre() {
         return "le perimetre="+2*(this.getLarg()+this.getLang());
     }

     @Override
     public String getAire() {
         return "l'aire est="+this.getLang()*this.getLarg();
     }
 }
