package ro.siit;

import java.util.Objects;

public class Persoana {
    private String nume;
    private int varsta;

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || obj.getClass() != getClass()){
            return false;
        }
        Persoana p = (Persoana) obj;
        return varsta == p.varsta  && nume.equals(p.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume) + Objects.hash(varsta);
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", varsta='" + varsta + '\'' +
                '}';
    }
}
