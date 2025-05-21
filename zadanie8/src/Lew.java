 public class Lew extends Zwierze {
        private String kolorGrzywy;

        public Lew(String nazwa, int wiek, String kolorGrzywy) {
            super(nazwa, wiek);
            this.kolorGrzywy = kolorGrzywy;
        }
        @Override
        public String wydajDzwiek() {
            return "Ryk!";
        }
        @Override
        public String poruszajSie() {
            return "Biega po sawannie";
        }
        public void poluj() {
            System.out.println(getNazwa() + " poluje na antylopy.");
        }
    }

