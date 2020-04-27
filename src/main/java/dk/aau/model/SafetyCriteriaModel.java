package dk.aau.model;

import java.util.ArrayList;
import java.util.List;

public class SafetyCriteriaModel {
    // Variabler
    private String name;
    private double valueNumber;
    private static double mapMin;
    private static double mapMax;

    private boolean valueBool;

    private String color;

    private static List<SafetyCriteriaModel> scEPJ = new ArrayList<SafetyCriteriaModel>();
    private static List<SafetyCriteriaModel> approvedQualiSC = new ArrayList<SafetyCriteriaModel>();
    private static List<SafetyCriteriaModel> approvedQuantiSC = new ArrayList<SafetyCriteriaModel>();

    // ikke MVC attributter
    private String tag;
    private Boolean takesNumber;

    // Constructors
    public SafetyCriteriaModel(String name, String tag) {
        this.takesNumber = false;
        this.name = name;
    }

    public SafetyCriteriaModel(String name, String tag, boolean takesNumber) {
        this.tag = tag;
        this.takesNumber = takesNumber;
        this.name = name;
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
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static double getMapMin() {
        return mapMin;
    }

    public void setMapMin(double mapMin) {
        SafetyCriteriaModel.mapMin = mapMin;
    }

    public static double getMapMax() {
        return mapMax;
    }

    public void setMapMax(double mapMax) {
        SafetyCriteriaModel.mapMax = mapMax;
    }

}