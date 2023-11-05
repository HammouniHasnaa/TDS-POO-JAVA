package td2;

public class Banque {
    private int numc;
    private float solde;
    private String cin;
    public Banque (int numc,float solde,String cin){
        this.numc=numc;
        this.solde=solde;
        this.cin=cin;
    }
    public void deposer(float solde) {
        this.solde += solde;
    }
    public void retirer(float solde){
        this.solde-=solde;
    }
    public float avoirsolde(){
        return solde;
    }
    public String avoirinf(){
        return "td2.Banque{" +
                "numc=" + numc +
                ", solde=" + solde +
                ", cin='" + cin + '\'' +
                '}';
    }
    public static void main(String[] args) {
        Banque compt1=new Banque(1,5340,"bv5321");
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

