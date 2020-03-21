package ro.siit;

public class Adresa {
    private String strada;
    private int nr;
    private String localitate;
    private String tara;

    public Adresa(String strada, int nr, String localitate, String tara) {
        this.strada = strada;
        this.nr = nr;
        this.localitate = localitate;
        this.tara = tara;
    }

    @Override
    public String toString() {
        return "Adresa{" +
                "strada='" + strada + '\'' +
                ", nr=" + nr +
                ", localitate='" + localitate + '\'' +
                ", tara='" + tara + '\'' +
                '}' + "\n" + "                                                                            ";
    }
}
