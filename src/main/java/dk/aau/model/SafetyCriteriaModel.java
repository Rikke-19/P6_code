package dk.aau.model;

import java.util.ArrayList;
import java.util.List;

public class SafetyCriteriaModel {
    // Variabler
    private String name;
    private double valueNumber;
    private boolean valueBool;
    private static List<SafetyCriteriaModel> scEPJ = new ArrayList<SafetyCriteriaModel>();
    private static List<SafetyCriteriaModel> approvedQualiSC = new ArrayList<SafetyCriteriaModel>();
    private static List<SafetyCriteriaModel> approvedQuantiSC = new ArrayList<SafetyCriteriaModel>();

    // Constructors 
    public SafetyCriteriaModel(String name, double valueNumber){
        this.name = name;
        this.valueNumber = valueNumber;
    }

    public SafetyCriteriaModel(String name, boolean valueBool){
        this.name = name;
        this.valueBool = valueBool;
    }

    // Metoder
    private void checkMissingResultsForSCEPJ() {

    }

    private Boolean checkMissingMAPInterval() {
        return false;
    }

    private Boolean checkMissingCheckedSC() {
        return false;
    }

    private void accessUnrealisticResultsForSCEPJ() {

    }

    private Boolean accessUnrealisticMAPInterval() {
        return false;
    }
    
    // Liste håndtering af sikkerhedskriterierne
    public static void AddToListSc(SafetyCriteriaModel sc) {
        scEPJ.add(sc);
    }
    
    public static void AddToListQuali(SafetyCriteriaModel sc) {
        approvedQualiSC.add(sc);
    }

    public static void AddToListQuanti(SafetyCriteriaModel sc) {
        approvedQuantiSC.add(sc);
    }

    // Metoder


    // Setters and getters
    public double getValueNumber() {
        return valueNumber;
    }

    public void setValueNumber(double valueNumber) {
        this.valueNumber = valueNumber;
    }

    public boolean getValueBool() {
        return valueBool;
    }

    public void setValueBool(boolean valueBool) {
        this.valueBool = valueBool;
    }

    public static List<SafetyCriteriaModel> getScEPJ() {
        return scEPJ;
    }

    public static void setScEPJ(List<SafetyCriteriaModel> scEPJ) {
        SafetyCriteriaModel.scEPJ = scEPJ;
    }

    public static List<SafetyCriteriaModel> getApprovedQualiSC() {
        return approvedQualiSC;
    }

    public static void setApprovedQualiSC(List<SafetyCriteriaModel> approvedQualiSC) {
        SafetyCriteriaModel.approvedQualiSC = approvedQualiSC;
    }

    public static List<SafetyCriteriaModel> getApprovedQuantiSC() {
        return approvedQuantiSC;
    }

    public static void setApprovedQuantiSC(List<SafetyCriteriaModel> approvedQuantiSC) {
        SafetyCriteriaModel.approvedQuantiSC = approvedQuantiSC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}