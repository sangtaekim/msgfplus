package edu.ucsd.msjava.msdbsearch;

public class LibraryMatch extends Match {

    private final String protein;

    public LibraryMatch(
            int score,
            float peptideMass,
            int nominalPeptideMass,
            int charge,
            String pepSeq,
            String protein) {
        super(score, peptideMass, nominalPeptideMass, charge, pepSeq, null);
        this.protein = protein;
    }

    public String getProtein() {
        return protein;
    }
}
