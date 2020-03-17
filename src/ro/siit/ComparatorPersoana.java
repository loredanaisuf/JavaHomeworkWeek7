package ro.siit;

import java.util.Comparator;

public class ComparatorPersoana implements Comparator<Persoana> {
    @Override
    public int compare(Persoana p1, Persoana p2) {
        if (p1.getVarsta() < p2.getVarsta()) {
            return 1;
        } else if (p1.getVarsta() == p2.getVarsta()) {
            return 0;
        } else {
            return -1;
        }
    }
}
