package td2;



public class Ex1 {
    double x;
    char nom;
    //contructeur par defaut
    public Ex1(){
        x=6 ;
        nom='b';
    }
    //constructeur paramétrique
    public Ex1 (char n,double x) {
        this.nom = n;
       this.x = x;
    }
    public void translate (double dx){
        x+=dx;
    }

    }