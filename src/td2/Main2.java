package td2;

public class Main2 {
    public static void main(String[] args) {
        Banque compt1 = new Banque(1, 5340, "bv5321");
        System.out.println(compt1.avoirinf());
        System.out.println(compt1.avoirsolde());
        compt1.deposer(500);
        System.out.println(compt1.avoirsolde());
        System.out.println(compt1.avoirinf());
        compt1.retirer(200);
        System.out.println(compt1.avoirsolde());
        System.out.println(compt1.avoirinf());

    }
}
