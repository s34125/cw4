import java.util.ArrayList;
import java.util.List;

public class SystemRezerwacji {
    private List<Wydarzenie> wydarzenia = new ArrayList<>();
    private List<Klient> klienci = new ArrayList<>();

    public void dodajWydarzenie(Wydarzenie wydarzenie) {
        wydarzenia.add(wydarzenie);
    }

    public void dodajWydarzenie(String nazwa, double cena) {
        wydarzenia.add(new Wydarzenie(nazwa, cena));
    }

    public void dodajKlienta(Klient klient) {
        klienci.add(klient);
    }

    public void dodajKlienta(String imię, String nazwisko) {
        klienci.add(new Klient(imię, nazwisko));
    }

    public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
        if (wydarzenie.getDostępneMiejsca() > 0) {
            klient.dodajRezerwację(wydarzenie);
            wydarzenie.zarezerwujMiejsce();
        }
    }

    public Wydarzenie znajdźWydarzenie(String nazwa) {
        for (Wydarzenie w : wydarzenia) {
            if (w.getNazwa().equals(nazwa)) {
                return w;
            }
        }
        return null;
    }

    public Klient znajdźKlienta(String nazwisko) {
        for (Klient k : klienci) {
            if (k.getNazwisko().equals(nazwisko)) {
                return k;
            }
        }
        return null;
    }

    public void zmieńCenęWydarzenia(String nazwa, double nowaCena) {
        Wydarzenie w = znajdźWydarzenie(nazwa);
        if (w != null) {
            w.setCena(nowaCena);
        }
    }
}