package td3;

public class Ex2 {
    public static void main(String args[]) {
        Points p = new Points();
        p.Points(2, 5);
        p.affCoord();
        PointNom pn1 = new PointNom();
        pn1.setPointNom(1, 7, 'A');
        pn1.affCoordNom();
        pn1.deplace(9, 3);
        pn1.affCoordNom();

    }
}
     class Points {
         private int x, y ;

         public void Points (int x, int y) { this.x = x ; this.y = y ; }
        public void deplace (int dx, int dy) { x += dx ; y += dy ; }
        public void affCoord ()
        { System.out.println ("Coordonnees : " + x + " " + y) ;}
    }

    class PointNom extends Points {
        private char nom;
        public void setPointNom(int x, int y, char nom) {
            Points(x, y);
            this.nom = nom;
        }

        public void setNom(char nom) {
            this.nom = nom;
        }

        public void affCoordNom() {
            System.out.print("point " + nom + " ");
            affCoord();
        }

    }

