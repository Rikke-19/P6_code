package dk.aau.model.person;

public class PatientModel {
    private long cpr;

    public PatientModel(long cpr){
        System.out.println("Oprettet");
        this.cpr = cpr;
    }
    
    public void SetCpr(long cpr) {
        this.cpr = cpr;
    }

    public long GetCpr() {
        return cpr;
    }



}