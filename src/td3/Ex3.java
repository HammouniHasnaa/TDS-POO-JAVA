package td3;

public class Ex3 {
    public static void main(String[]args){
        Point3 point = new Point3(3 , 10 );
        Center center = new Center(5 , 1 , "H");
        center.affiche();
    }
}
class Point3 {
    private int x, y;

    public Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void affCoord() {
        System.out.println("Coordonnees : " + x + " " + y);
    }

    public void affiche() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
}
class Center extends Point3{
    String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Center(int x, int y, String nom) {
        super(x, y);
        this.nom = nom;
    }
    public void affNom(){
        System.out.println("nom="+this.getNom());
    }

    @Override
    public void affiche() {
        affNom();
        super.affiche();
    }
}
class Cercle extends Center{
    int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Cercle(int x, int y, String nom,int r) {
        super(x, y, nom);
        this.r=r;
    }

}