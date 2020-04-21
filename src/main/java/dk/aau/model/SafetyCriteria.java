package dk.aau.model;

import java.util.ArrayList;
import java.util.List;

public class SafetyCriteria {
    // Variabler
    private String name;
    private double valueNumber;
    private boolean valueBool;
    private static List<SafetyCriteria> scEPJ = new ArrayList<SafetyCriteria>();
    private static List<SafetyCriteria> approvedQualiSC = new ArrayList<SafetyCriteria>();
    private static List<SafetyCriteria> approvedQuantiSC = new ArrayList<SafetyCriteria>();

    // Constructors 
    public SafetyCriteria(String name, double valueNumber){
        this.name = name;
        this.valueNumber = valueNumber;
    }

    public SafetyCriteria(String name, boolean valueBool){
        this.name = name;
        this.valueBool = valueBool;
    }

    // Liste håndtering af sikkerhedskriterierne
    public static void AddToListSc(SafetyCriteria sc) {
        scEPJ.add(sc);
    }
    
    public static void AddToListQuali(SafetyCriteria sc) {
        approvedQualiSC.add(sc);
    }

    public static void AddToListQuanti(SafetyCriteria sc) {
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

    public static List<SafetyCriteria> getScEPJ() {
        return scEPJ;
    }

    public static void setScEPJ(List<SafetyCriteria> scEPJ) {
        SafetyCriteria.scEPJ = scEPJ;
    }

    public static List<SafetyCriteria> getApprovedQualiSC() {
        return approvedQualiSC;
    }

    public static void setApprovedQualiSC(List<SafetyCriteria> approvedQualiSC) {
        SafetyCriteria.approvedQualiSC = approvedQualiSC;
    }

    public static List<SafetyCriteria> getApprovedQuantiSC() {
        return approvedQuantiSC;
    }

    public static void setApprovedQuantiSC(List<SafetyCriteria> approvedQuantiSC) {
        SafetyCriteria.approvedQuantiSC = approvedQuantiSC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}