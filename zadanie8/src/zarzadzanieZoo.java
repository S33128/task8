public class zarzadzanieZoo {
    public static void main(String[] args) {
        Zwierze lew = new Lew("Simba", 5, "Złota");
        Zwierze orzel = new Orzel("Bielik", 3, 2.5);
        Zwierze waz = new Waz("Kobra", 2, true);
        Zwierze[] zwierzeta = {lew, orzel, waz};
        for (Zwierze z : zwierzeta) {
            z.wyswietlInformacje();
            System.out.println("Dźwięk: " + z.wydajDzwiek());
            System.out.println("Poruszanie: " + z.poruszajSie());
            System.out.println();
        }
        ((Lew) lew).poluj();
        ((Orzel) orzel).szybuj();
        ((Waz) waz).ukas();
    }
}
