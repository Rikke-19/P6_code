package dk.aau.model;

public class SafetyCriteria {
    private String name;
    private double valueNumber;
    private boolean valueBool;

    public SafetyCriteria(String name, double valueNumber){
        this.name = name;
        this.valueNumber = valueNumber;
    }

    public SafetyCriteria(String name, boolean valueBool){
        this.name = name;
        this.valueBool = valueBool;
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