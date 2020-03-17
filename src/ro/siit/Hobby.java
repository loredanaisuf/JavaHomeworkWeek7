package ro.siit;

import java.util.List;

public class Hobby {
    private String nume;
    private int frecventa;
    private List<Adresa> adrese;

    public Hobby(String nume, int frecventa, List<Adresa> adrese) {
        this.nume = nume;
        this.frecventa = frecventa;
        this.adrese = adrese;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "nume='" + nume + '\'' +
                ", frecventa=" + frecventa +
                ", adrese=" + adrese +
                '}' + "\n" + "                                  ";
    }
}
