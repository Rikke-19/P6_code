package dk.aau.model;

import java.util.List;

public class SafetyCriteria {
    // Variabler
    private String name;
    private double valueNumber;
    private boolean valueBool;
    public static List<SafetyCriteria> scEPJ;
    public static List<SafetyCriteria> aQualiSC;
    public static List<SafetyCriteria> aQuantiSC;

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
    
    public void AddToListQuali(SafetyCriteria sc) {
        aQualiSC.add(sc);
    }

    public static void AddToListQuanti(SafetyCriteria sc) {
        aQuantiSC.add(sc);
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
}