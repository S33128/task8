public abstract class Zwierze {
    private String nazwa;
    private int wiek;

    public Zwierze(String nazwa, int wiek) {
        this.nazwa = nazwa;
        this.wiek = wiek;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getWiek() {
        return wiek;
    }
    public abstract String wydajDzwiek();
    public abstract String poruszajSie();
    public void wyswietlInformacje(){
        System.out.println("Zwierze: "+ nazwa + "wiek: " + wiek);
    }
}
