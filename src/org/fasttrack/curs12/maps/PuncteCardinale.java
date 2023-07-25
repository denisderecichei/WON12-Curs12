package org.fasttrack.curs12.maps;

public enum PuncteCardinale {
    NORD("N"),
    SUD("S"),
    EST("E"),
    VEST("V");

    private final String prescurtare;

    PuncteCardinale(String prescurtare) {
        this.prescurtare = prescurtare;
    }

    public String getPrescurtare() {
        return prescurtare;
    }
}
