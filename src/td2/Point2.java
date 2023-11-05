package td2;

public class Point2{
    private double x,y;
    private String nom;
    public Point2(String nom,double x,double y){
          this.x=x ;
         this.y=y ;
           this.nom=nom;}
    public String getNom(){
            return nom;
    }
    public void setNom(String nom){
            this.nom=nom;
    }
    public double getX(){
            return x;
    }
    public void setX(double x){
            this.x=x;
    }
    public double getY(){
            return y;
    }
    public void setY(double y){
            this.y=y;
    }
    public double Norme(){
            return Math.sqrt(Math.pow(this.getX(),2)+Math.pow(this.getY(),2));
    }
        }