package dk.aau.model;

import java.util.ArrayList;
import java.util.List;

public abstract class WarningsModel {
    private static List<SafetyCriteria> missingResultsForSCEPJ = new ArrayList<SafetyCriteria>();
    private static List<SafetyCriteria> missingMAPInterval = new ArrayList<SafetyCriteria>();
    private static List<SafetyCriteria> missingCheckedSC = new ArrayList<SafetyCriteria>();
    private static List<SafetyCriteria> unrealisticResultsForSCEPJ = new ArrayList<SafetyCriteria>();
    private static List<SafetyCriteria> unrealisticMAPInterval = new ArrayList<SafetyCriteria>();

// Liste håndtering af de 5 advarsler
public static void AddToList(SafetyCriteria sc) {
    missingResultsForSCEPJ.add(sc);
}

public void AddToList2(SafetyCriteria sc) {
    missingMAPInterval.add(sc);
}

public void AddToList3(SafetyCriteria sc) {
    missingCheckedSC.add(sc);
}

public void AddToList4(SafetyCriteria sc) {
    unrealisticResultsForSCEPJ.add(sc);
}

public void AddToList5(SafetyCriteria sc) {
    unrealisticMAPInterval.add(sc);
}

}