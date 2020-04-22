package dk.aau.model.person;

import java.util.ArrayList;
import java.util.List;

public class HealthcarePersonelModel {
    private String name;
    private double valueNumber;
    private boolean valueBool;
    
    // Oprettelse af lister samt initialisering af disse
    private static List<HealthcarePersonelModel> enteredResultsForSC = new ArrayList<HealthcarePersonelModel>();
    private static List<HealthcarePersonelModel> mapInterval = new ArrayList<HealthcarePersonelModel>();
    private static List<HealthcarePersonelModel> checkedSC = new ArrayList<HealthcarePersonelModel>();

    // Oprettet en constructer
    public HealthcarePersonelModel(String name, double valueNumber) {
        this.name = name;
        this.valueNumber = valueNumber;
    }

    public HealthcarePersonelModel(String name, boolean valueBool) {
        this.name = name;
        this.valueBool = valueBool;
    }

    // Liste håndtering
    public static void AddToListEnteredSC(HealthcarePersonelModel hp) {
        enteredResultsForSC.add(hp);
    }

	public static void AddToListMapInterval(HealthcarePersonelModel hp) {
        mapInterval.add(hp);
    }

    public static void AddToListCheckedSC(HealthcarePersonelModel hp) {
        checkedSC.add(hp);
    }

    // Getters og setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValueNumber() {
        return valueNumber;
    }

    public void setValueNumber(double valueNumber) {
        this.valueNumber = valueNumber;
    }

    public boolean isValueBool() {
        return valueBool;
    }

    public void setValueBool(boolean valueBool) {
        this.valueBool = valueBool;
    }

    public static List<HealthcarePersonelModel> getMapInterval() {
        return mapInterval;
    }



    //Metoder
    private void enterResultsForSC() {

    }

    private void enterMAPInterval() {

    }

    private void checkSC() {

    }
    public static void setMapInterval(List<HealthcarePersonelModel> mapInterval) {
        HealthcarePersonelModel.mapInterval = mapInterval;
    }

    public static List<HealthcarePersonelModel> getEnteredResultsForSC() {
        return enteredResultsForSC;
    }

    public static void setEnteredResultsForSC(List<HealthcarePersonelModel> enteredResultsForSC) {
        HealthcarePersonelModel.enteredResultsForSC = enteredResultsForSC;
    }

    public static List<HealthcarePersonelModel> getCheckedSC() {
        return checkedSC;
    }

    public static void setCheckedSC(List<HealthcarePersonelModel> checkedSC) {
        HealthcarePersonelModel.checkedSC = checkedSC;
    }
}