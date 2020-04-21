package dk.aau.model;

import java.util.ArrayList;
import java.util.List;

import dk.aau.model.person.HealthcarePersonelModel;

public abstract class WarningsModel {
    private static List<SafetyCriteria> missingResultsForSCEPJ = new ArrayList<SafetyCriteria>();
    private static List<HealthcarePersonelModel> missingMAPInterval = new ArrayList<HealthcarePersonelModel>();
    private static List<HealthcarePersonelModel> missingCheckedSC = new ArrayList<HealthcarePersonelModel>();
    private static List<SafetyCriteria> unrealisticResultsForSCEPJ = new ArrayList<SafetyCriteria>();
    private static List<HealthcarePersonelModel> unrealisticMAPInterval = new ArrayList<HealthcarePersonelModel>();

// Liste håndtering af de 5 advarsler
public static void AddToListMissingResultsForSCEPJ(SafetyCriteria sc) {
    missingResultsForSCEPJ.add(sc);
}

public static void AddToListMissingMAP(HealthcarePersonelModel hp) {
    missingMAPInterval.add(hp);
}

public static void AddToListMissingCheckedSC(HealthcarePersonelModel hp) {
    missingCheckedSC.add(hp);
}

public static void AddToListUnrealisticResultsForSCEPJ(SafetyCriteria sc) {
    unrealisticResultsForSCEPJ.add(sc);
}

public static void AddToListUnrealisticMAPInterval(HealthcarePersonelModel hp) {
    unrealisticMAPInterval.add(hp);
}

}