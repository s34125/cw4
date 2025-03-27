import java.util.ArrayList;
import java.util.List;

public class Klient {
    private String imię;
    private String nazwisko;
    private String email;
    private List<Wydarzenie> rezerwacje = new ArrayList<>();

    public Klient(String imię, String nazwisko) {
        this(imię, nazwisko, "");
    }

    public Klient(String imię, String nazwisko, String email) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.email = email;
    }

    // Gettery i settery
    public String getImię() { return imię; }
    public void setImię(String imię) { this.imię = imię; }

    public String getNazwisko() { return nazwisko; }
    public void setNazwisko(String nazwisko) { this.nazwisko = nazwisko; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public void dodajRezerwację(Wydarzenie wydarzenie) {
        rezerwacje.add(wydarzenie);
    }

    public void wyświetlRezerwacje() {
        for (Wydarzenie w : rezerwacje) {
            System.out.println(w);
        }
    }

    public void anulujRezerwację(Wydarzenie wydarzenie) {
        rezerwacje.remove(wydarzenie);
    }
}