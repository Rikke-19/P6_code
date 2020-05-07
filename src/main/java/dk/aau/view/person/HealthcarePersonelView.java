package dk.aau.view.person;

import java.util.List;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HealthcarePersonelView {

    private Button SafetyAssesment;
    private List QualitativeSCValue;
    private TextField MAPInterval;

    public Button getSafetyAssesment() {
        return SafetyAssesment;
    }

    public void setSafetyAssesment(Button safetyAssesment) {
        SafetyAssesment = safetyAssesment;
    }

    public List getQualitativeSCValue() {
        return QualitativeSCValue;
    }

    public void setQualitativeSCValue(List qualitativeSCValue) {
        QualitativeSCValue = qualitativeSCValue;
    }

    public TextField getMAPInterval() {
        return MAPInterval;
    }

    public void setMAPInterval(TextField mAPInterval) {
        MAPInterval = mAPInterval;
    }

}