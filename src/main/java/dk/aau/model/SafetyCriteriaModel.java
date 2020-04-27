package dk.aau.model;

import java.util.ArrayList;
import java.util.List;

public class SafetyCriteriaModel {
    // Variabler
    private String NameSC;
    private double QuantitativeSCValue;
    private static double MAPIntervalMin;
    private static double MAPIntervalMax;
    private String Color;

    private boolean MissingMAPInterval;
    private boolean MissingTickedQualitativeSC;
    private boolean UnrealisticMAPInterval;

    private boolean QualitativeSCValueBool; // MVC??

    private String levelOfMAPSupport; // muligvis MVC attributter
    private boolean isMAPCausingSymptoms; // muligvis MVC attributter
    private boolean stableTachy; // muligvis MVC attributter

    

    private static List<SafetyCriteriaModel> SC = new ArrayList<SafetyCriteriaModel>();
    private static List<SafetyCriteriaModel> MissingQuantitativeResultsSC = new ArrayList<SafetyCriteriaModel>();
    private static List<SafetyCriteriaModel> UnrealisticQuantitativeResults = new ArrayList<SafetyCriteriaModel>();

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

    // Metoder
    private boolean checkMissingTickedQualitativeSC() {
        return false;
    }

    private void checkMissingResultsForQuantitativeSC() {
        
    }

    private Boolean checkMissingMAPInterval() {
        return false;
    }

    private void assessUnrealisticResultsForQuantitativeSC() {

    }

    private Boolean assessUnrealisticMAPInterval() {
        return false;
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

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
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
}