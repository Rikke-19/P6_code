package dk.aau.model;

import java.util.List;
import dk.aau.model.SafetyCriteria;

public abstract class WarningsModel {
    public static List<WarningsModel> missingResultsForSCEPJ;
    public static List<WarningsModel> missingMAPInterval;
    public static List<WarningsModel> missingCheckedSC;
    public static List<WarningsModel> unrealisticResultsForSCEPJ;
    public static List<WarningsModel> unrealisticMAPInterval;

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