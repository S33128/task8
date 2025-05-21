public class Waz extends Zwierze {
    private boolean jadowity;

    public Waz(String nazwa, int wiek, boolean jadowity) {
        super(nazwa, wiek);
        this.jadowity = jadowity;
    }
    @Override
    public String wydajDzwiek() {
        return "Syss!";
    }
    @Override
    public String poruszajSie() {
        return "Pełznie po ziemi";
    }
    public void ukas() {
        if (jadowity) {
            System.out.println(getNazwa() + " kąsa i wstrzykuje jad!");
        } else {
            System.out.println(getNazwa() + " kąsa, ale nie jest jadowity.");
        }
    }
}
