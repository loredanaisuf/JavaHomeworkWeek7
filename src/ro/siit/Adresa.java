package ro.siit;

public class Adresa {
    private String strada;
    private int nr;
    private String localitate;

    public Adresa(String strada, int nr, String localitate) {
        this.strada = strada;
        this.nr = nr;
        this.localitate = localitate;
    }

    @Override
    public String toString() {
        return "Adresa{" +
                "strada='" + strada + '\'' +
                ", nr=" + nr +
                ", localitate='" + localitate + '\'' +
                '}' + "\n" + "                                                                    ";
    }
}
