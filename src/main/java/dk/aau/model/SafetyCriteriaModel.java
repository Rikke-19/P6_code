package dk.aau.model;

import java.util.ArrayList;
import java.util.List;

public class SafetyCriteriaModel {
    // Variabler
    private String NameSC;
    private double QuantitativeSCValue;
    private static double MAPIntervalMin;
    private static double MAPIntervalMax;
    private String ColorIB;
    private String ColorOB;

    private static boolean MissingMAPInterval;
    private static boolean MissingTickedQualitativeSC;
    private static boolean UnrealisticMAPInterval;

    private boolean QualitativeSCValueBool; // MVC??
    private boolean isUnrealisticQuantitativeValue;

    private String levelOfMAPSupport; 
    private boolean isMAPCausingSymptoms;
    private boolean stableTachy; 

    private static List<SafetyCriteriaModel> SC = new ArrayList<SafetyCriteriaModel>();
    private static List<SafetyCriteriaModel> MissingQuantitativeResultsSC = new ArrayList<SafetyCriteriaModel>();
    private static List<SafetyCriteriaModel> UnrealisticQuantitativeResults = new ArrayList<SafetyCriteriaModel>();
    private static List<SafetyCriteriaModel> MissingQualitativeResultsSC = new ArrayList<SafetyCriteriaModel>();

    private boolean recievedValue = false;
    private static boolean MissingQuantitativeResult;

    // ikke MVC attributter
    private String tag;
    private Boolean takesNumber;

    // Constructors
    public SafetyCriteriaModel(String NameSC, String tag) {
        this.takesNumber = false;
        this.NameSC = NameSC;
    }

    public SafetyCriteriaModel(String NameSC, String tag, boolean takesNumber) {
        this.tag = tag;
        this.takesNumber = takesNumber;
        this.NameSC = NameSC;
    }

    public SafetyCriteriaModel() {
    }

    // Metoder
    // X
    public void checkMissingTickedQualitativeSC(List<SafetyCriteriaModel> inputList) {
        MissingTickedQualitativeSC = false;
        for (SafetyCriteriaModel SC : inputList) {
            if (!SC.isRecievedValue() && !SC.takesNumber) {
                MissingQualitativeResultsSC.add(SC);
                MissingTickedQualitativeSC = true;
            }
        }
    }

    // X
    public void checkMissingResultsForQuantitativeSC(List<SafetyCriteriaModel> inputList) {
        MissingQuantitativeResult = false;
        for (SafetyCriteriaModel SC : inputList) {
            if (!SC.isRecievedValue() && SC.takesNumber) {
                MissingQuantitativeResultsSC.add(SC);
                MissingQuantitativeResult = true;
            }
        }
    }

    public static Boolean checkMissingMAPInterval() {
        String MAPMinString = Double.toString(MAPIntervalMin);
        if (MAPMinString.equals("0.0")) {
            return true;
        } else {
            return false;
        }
    }


    //
    public void assessUnrealisticResultsForQuantitativeSC() {
        isUnrealisticQuantitativeValue = false;
        for (SafetyCriteriaModel SC : SC) {
            if (!SC.getName().equals("RASS") && SC.takesNumber && SC.getQuantitativeSCValue() <= 0) {
                UnrealisticQuantitativeResults.add(SC);
                isUnrealisticQuantitativeValue = true;
            } else if (SC.getName().equals("RASS") && SC.takesNumber && SC.getQuantitativeSCValue() > 4
                    || SC.getQuantitativeSCValue() < -5) {
                UnrealisticQuantitativeResults.add(SC);
                isUnrealisticQuantitativeValue = true;
            }
        }
    }

    //
    public Boolean assessUnrealisticMAPInterval() {

        if (MAPIntervalMin <= 0) {
            UnrealisticMAPInterval = true;
            return true;
        } else {
            return false;
        }
    }

    // Liste håndtering af sikkerhedskriterierne
    public static void AddToListSC(SafetyCriteriaModel s) {
        SC.add(s);
    }

    public static void AddToListQuali(SafetyCriteriaModel s) {
        MissingQuantitativeResultsSC.add(s);
    }

    public static void AddToListQuanti(SafetyCriteriaModel s) {
        UnrealisticQuantitativeResults.add(s);
    }

    // Setters and getters

    public double getQuantitativeSCValue() {
        return QuantitativeSCValue;
    }

    public void setQuantitativeSCValue(double QuantitativeSCValue) {
        this.QuantitativeSCValue = QuantitativeSCValue;
    }

    public boolean getQualitativeSCValueBool() {
        return QualitativeSCValueBool;
    }

    public void setQualitativeSCValueBool(boolean QualitativeSCValueBool) {
        this.QualitativeSCValueBool = QualitativeSCValueBool;
    }

    public String getName() {
        return NameSC;
    }

    public void setName(String NameSC) {
        this.NameSC = NameSC;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Boolean getTakesNumber() {
        return takesNumber;
    }

    public void setTakesNumber(Boolean takesNumber) {
        this.takesNumber = takesNumber;
    }

    public static double getMAPIntervalMin() {
        return MAPIntervalMin;
    }

    public void setMAPIntervalMin(double MAPIntervalMin) {
        SafetyCriteriaModel.MAPIntervalMin = MAPIntervalMin;
    }

    public static double getMAPIntervalMax() {
        return MAPIntervalMax;
    }

    public void setMAPIntervalMax(double MAPIntervalMax) {
        SafetyCriteriaModel.MAPIntervalMax = MAPIntervalMax;
    }

    public String getLevelOfMAPSupport() {
        return levelOfMAPSupport;
    }

    public void setLevelOfMAPSupport(String levelOfMAPSupport) {
        this.levelOfMAPSupport = levelOfMAPSupport;
    }

    public boolean getStableTachy() {
        return stableTachy;
    }

    public void setStableTachy(boolean stableTachy) {
        this.stableTachy = stableTachy;
    }

    public boolean getMAPCausingSymptoms() {
        return isMAPCausingSymptoms;
    }

    public void setMAPCausingSymptoms(boolean isMAPCausingSymptoms) {
        this.isMAPCausingSymptoms = isMAPCausingSymptoms;
    }

    // getters and setters for lists

    public static List<SafetyCriteriaModel> getSC() {
        return SC;
    }

    public static void setSC(List<SafetyCriteriaModel> sC) {
        SafetyCriteriaModel.SC = sC;
    }

    public static List<SafetyCriteriaModel> getMissingQuantitativeResultsSC() {
        return MissingQuantitativeResultsSC;
    }

    public static void setMissingQuantitativeResultsSC(List<SafetyCriteriaModel> missingQuantitativeResultsSC) {
        SafetyCriteriaModel.MissingQuantitativeResultsSC = missingQuantitativeResultsSC;
    }

    public static List<SafetyCriteriaModel> getUnrealisticQuantitativeResults() {
        return UnrealisticQuantitativeResults;
    }

    public static void setUnrealisticQuantitativeResults(List<SafetyCriteriaModel> unrealisticQuantitativeResults) {
        SafetyCriteriaModel.UnrealisticQuantitativeResults = unrealisticQuantitativeResults;
    }

    public boolean isRecievedValue() {
        return recievedValue;
    }

    public void setRecievedValue(boolean recievedValue) {
        this.recievedValue = recievedValue;
    }

    public boolean isMissingMAPInterval() {
        return MissingMAPInterval;
    }

    public void setMissingMAPInterval(boolean missingMAPInterval) {
        MissingMAPInterval = missingMAPInterval;
    }

    public boolean isMissingTickedQualitativeSC() {
        return MissingTickedQualitativeSC;
    }

    public void setMissingTickedQualitativeSC(boolean missingTickedQualitativeSC) {
        MissingTickedQualitativeSC = missingTickedQualitativeSC;
    }

    public boolean isUnrealisticMAPInterval() {
        return UnrealisticMAPInterval;
    }

    public void setUnrealisticMAPInterval(boolean unrealisticMAPInterval) {
        UnrealisticMAPInterval = unrealisticMAPInterval;
    }

    public boolean isMAPCausingSymptoms() {
        return isMAPCausingSymptoms;
    }

    public static List<SafetyCriteriaModel> getMissingQualitativeResultsSC() {
        return MissingQualitativeResultsSC;
    }

    public static void setMissingQualitativeResultsSC(List<SafetyCriteriaModel> missingQualitativeResultsSC) {
        MissingQualitativeResultsSC = missingQualitativeResultsSC;
    }

    public boolean isMissingQuantitativeResult() {
        return MissingQuantitativeResult;
    }

    public void setMissingQuantitativeResult(boolean missingQuantitativeResult) {
        MissingQuantitativeResult = missingQuantitativeResult;
    }

    public String getNameSC() {
        return NameSC;
    }

    public void setNameSC(String nameSC) {
        NameSC = nameSC;
    }

    public String getColorIB() {
        return ColorIB;
    }

    public void setColorIB(String colorIB) {
        ColorIB = colorIB;
    }

    public String getColorOB() {
        return ColorOB;
    }

    public void setColorOB(String colorOB) {
        ColorOB = colorOB;
    }

    public boolean isUnrealisticQuantitativeValue() {
        return isUnrealisticQuantitativeValue;
    }

    public void setUnrealistivQuantitativeValue(boolean isUnrealisticQuantitativeValue) {
        this.isUnrealisticQuantitativeValue = isUnrealisticQuantitativeValue;
    }
}