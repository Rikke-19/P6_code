package dk.aau.model.person;

public class PatientModel {
    private long Cpr;

    public PatientModel(long Cpr){
        System.out.println("Oprettet");
        this.Cpr = Cpr;
    }
    
    public void SetCpr(long Cpr) {
        this.Cpr = Cpr;
    }

    public long getCpr() {
        return Cpr;
    }



}