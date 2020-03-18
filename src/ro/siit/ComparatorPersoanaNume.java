package ro.siit;

import java.util.Comparator;

public class ComparatorPersoanaNume implements Comparator<Persoana> {
    @Override
    public int compare(Persoana p1, Persoana p2) {
        return p1.getNume().compareTo(p2.getNume());
    }

}