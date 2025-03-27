import java.util.ArrayList;
import java.util.List;

public class Wydarzenie {
    private String nazwa;
    private double cena;
    private String data;
    private int maxLiczbaMiejsc;
    private int dostępneMiejsca;

    public Wydarzenie(String nazwa, double cena) {
        this(nazwa, cena, null, 100);
    }

    public Wydarzenie(String nazwa, double cena, String data) {
        this(nazwa, cena, data, 100);
    }

    public Wydarzenie(String nazwa, double cena, String data, int maxLiczbaMiejsc) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
        this.maxLiczbaMiejsc = maxLiczbaMiejsc;
        this.dostępneMiejsca = maxLiczbaMiejsc;
    }

    // Gettery i settery
    public String getNazwa() { return nazwa; }
    public void setNazwa(String nazwa) { this.nazwa = nazwa; }

    public double getCena() { return cena; }
    public void setCena(double cena) { this.cena = cena; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public int getMaxLiczbaMiejsc() { return maxLiczbaMiejsc; }
    public void setMaxLiczbaMiejsc(int maxLiczbaMiejsc) { this.maxLiczbaMiejsc = maxLiczbaMiejsc; }

    public int getDostępneMiejsca() { return dostępneMiejsca; }
    public void setDostępneMiejsca(int dostępneMiejsca) { this.dostępneMiejsca = dostępneMiejsca; }

    @Override
    public String toString() {
        return nazwa + " - Cena: " + cena + " PLN" + (data != null ? ", Data: " + data : "")
                + ", Miejsca: " + dostępneMiejsca + "/" + maxLiczbaMiejsc;
    }

    public void zarezerwujMiejsce() {
        if (dostępneMiejsca > 0) {
            dostępneMiejsca--;
        }
    }
}