package dk.aau.model;

import java.util.List;
import dk.aau.model.SafetyCriteria;

public abstract class WarningsModel {
    public static List<SafetyCriteria> missingResultsForSCEPJ;
    public static List<SafetyCriteria> missingMAPInterval;
    public static List<SafetyCriteria> missingCheckedSC;
    public static List<SafetyCriteria> unrealisticResultsForSCEPJ;
    public static List<SafetyCriteria> unrealisticMAPInterval;

public void AddToList(SafetyCriteria sc) {
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