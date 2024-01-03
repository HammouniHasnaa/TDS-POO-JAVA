package td3;

public class Ex1 {
    public static void main(String[] args) {
        Point p = new Point();
        p.Point(4, 6);
        System.out.println("les coordonee " + p.getX() + "et" + p.getY());
        p.deplace(2, 1);
        System.out.println("les coordonee " + p.getX() + "et" + p.getY());
       PointA pa= new PointA();
       pa.Point(4,5);
       pa.affiche();

    }
    }
class Point {
    private int x, y;
    public void Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
class PointA extends Point {
    void affiche() {
        System.out.println("Coordonnees : " + getX() + " " + getY());
    }
}
