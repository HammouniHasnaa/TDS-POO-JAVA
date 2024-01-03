package td3;

public class Ex4 {
    public static void main(String[] args) {

    }

    class Batiment{
        public String adress;
        public Batiment(){
        }
        public Batiment(String adress){
            this.adress=adress;
        }

        public String getAdress() {
            return adress;
        }

        public void setAdress(String adress) {
            this.adress = adress;
        }

        class Maison extends Batiment{
                public int nombrechambre;

            public Maison(int nombrechambre) {
                this.nombrechambre = nombrechambre;
            }

            public Maison(String adress, int nombrechambre) {
                super(adress);
                this.nombrechambre = nombrechambre;
            }

            public int getNombrechambre() {
                return nombrechambre;
            }

            public void setNombrechambre(int nombrechambre) {
                this.nombrechambre = nombrechambre;
            }

            @Override
            public String toString() {
                return "Maison{" +
                        "nombrechambre=" + nombrechambre +
                        ", adress='" + adress + '\'' +
                        '}';
            }
        }

        class Immeuble extends Batiment {
            private int nbrAppart;

            public Immeuble(String adresse, int nbrAppart) {
                super(adresse);
                this.nbrAppart = nbrAppart;
            }

            public Immeuble(int nbrAppart) {
                this.nbrAppart = nbrAppart;
            }

            public int getNbrAppart() {
                return nbrAppart;
            }

            public void setNbrAppart(int nbrAppart) {
                this.nbrAppart = nbrAppart;
            }

            @Override
            public String toString() {
                return "Immeuble{" +
                        "nbrAppart=" + nbrAppart +
                        ", adress='" + adress + '\'' +
                        '}';
            }
        }


    }
}

