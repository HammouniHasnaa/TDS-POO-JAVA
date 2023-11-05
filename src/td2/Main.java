package td2;

import td2.Point;
import td2.Point2;

public class Main {
    public static void main(String[] args) {
        //ex1
        Point pt1= new Point('a',23);
        System.out.println( pt1.x);
        System.out.println( pt1.nom);
        pt1.translate(5.4);
        System.out.println(pt1.x);
        //ex2
        Point2 pt2=new Point2("H",3.5,4.1);
        System.out.println(pt2.Norme());
        pt2.setNom("A");
        System.out.println(pt2.getNom());
        System.out.println(pt2.getX());
        System.out.println(pt2.getY());
        //ex3
        Livre livre1=new Livre("revendel","hammouni",00,2023);
        System.out.println(livre1.toString());
        System.out.println(livre1);
        Livre l2=new Livre(livre1);
        System.out.println(l2);
        Livre l9=new Livre();
        System.out.println(l9);
    }
    }
