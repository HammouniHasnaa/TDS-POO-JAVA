package td2;

import java.sql.SQLOutput;

public class Temps {
        private int heures, minutes, secondes;

        public Temps() {
        }

        public Temps(int heures) {
                this.heures = heures;
        }

        public Temps(int heures, int minutes) {
                this.heures = heures;
                this.minutes = minutes;
        }

        public Temps(int heures, int minutes, int secondes) {
                this.heures = heures;
                this.minutes = minutes;
                this.secondes = secondes;
        }

        public Temps(Temps temps) {
                this.heures = temps.getHeures();
                this.minutes = temps.getMinutes();
                this.secondes = temps.getSecondes();
        }

        public int getHeures() {
                return heures;
        }

        public void setHeures(int heures) {
                this.heures = heures;
        }

        public int getMinutes() {
                return minutes;
        }

        public void setMinutes(int minutes) {
                this.minutes = minutes;
        }

        public int getSecondes() {
                return secondes;
        }

        public void setSecondes(int secondes) {
                this.secondes = secondes;
        }

        public void ajouterHeures(int heures) {
                setHeures(getHeures() + heures);
        }

        public void ajouterMin(int min) {
                min = min + getMinutes();
                ajouterHeures(min / 60);
                setMinutes(min % 60);
        }

        @Override
        public String toString() {
                return "Temps{" +
                        "heures=" + heures +
                        ", minutes=" + minutes +
                        ", secondes=" + secondes +
                        '}';
        }


        public void main(String[] args) {
                Temps temps = new Temps(11, 12, 13);
                System.out.println(temps.toString());
        }

}