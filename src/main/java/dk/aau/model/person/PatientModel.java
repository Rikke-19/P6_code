package dk.aau.model.person;

public class PatientModel {
    private long cpr;

    public PatientModel(long cpr){ //constructor, tager long cpr som input, sætter cpr
        this.cpr = cpr;
    }
    
    public long GetCpr() {
        return cpr;
    }



}