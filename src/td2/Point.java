package td2;

public class Point {
    double x;
    char nom;
    //contructeur par defaut
    public Point(){
        x=6 ;
        nom='b';
    }
    //constructeur paramétrique
    public Point (char n,double x) {
        this.nom = n;
       this.x = x;
    }
    public void translate (double dx){
        x+=dx;
    }

    }