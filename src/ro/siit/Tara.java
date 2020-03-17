package ro.siit;

import java.util.List;

public class Tara {
    private String nume;

    public Tara(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Tara{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
