public class Orzel extends Zwierze {
    private double rozpiętośćSkrzydeł;

    public Orzel(String nazwa, int wiek, double rozpiętośćSkrzydeł) {
        super(nazwa, wiek);
        this.rozpiętośćSkrzydeł = rozpiętośćSkrzydeł;
    }
    @Override
    public String wydajDzwiek() {
        return "Skrzeczenie!";
    }
    @Override
    public String poruszajSie() {
        return "Lata wysoko nad górami";
    }
    public void szybuj() {
        System.out.println(getNazwa() + " szybuje w powietrzu.");
    }
}
