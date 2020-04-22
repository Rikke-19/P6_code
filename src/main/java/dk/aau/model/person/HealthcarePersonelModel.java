package dk.aau.model.person;

import java.util.ArrayList;
import java.util.List;

public class HealthcarePersonelModel {
    private String name;
    private double valueNumber;
    private boolean valueBool;
    
    // Oprettelse af Map interval liste samt initialisering af denne
    private static List<HealthcarePersonelModel> mapInterval = new ArrayList<HealthcarePersonelModel>();

    // Oprettet en constructer
    public HealthcarePersonelModel(String name, double valueNumber) {
        this.name = name;
        this.valueNumber = valueNumber;
    }

    public HealthcarePersonelModel(String name, boolean valueBool) {
        this.name = name;
        this.valueBool = valueBool;
    }

    // Liste håndtering af map interval
	public static void AddToListMapInterval(HealthcarePersonelModel hp) {
        mapInterval.add(hp);
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
}