package dk.aau.model;

import java.awt.Color;

public class SafetyCriteriaModel {
    // Variabler
    private String name;
    private double valueNumber;
    private boolean valueBool;

    // Colors for categorization
    private Color colorIB;
    private Color colorOB;


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

    // Setters and getters

    public void SetColorIB(Color c)
    {
        this.colorIB = c;
    }
    public Color GetColorIB()
    {
        return colorIB;
    }

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