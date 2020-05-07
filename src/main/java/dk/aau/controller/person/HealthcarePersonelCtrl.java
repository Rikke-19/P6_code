package dk.aau.controller.person;

import dk.aau.model.SafetyCriteriaModel;
import dk.aau.model.person.HealthcarePersonelModel;
import dk.aau.view.person.HealthcarePersonelView;

public class HealthcarePersonelCtrl {

    private HealthcarePersonelModel model;
    private HealthcarePersonelView view;

    public HealthcarePersonelCtrl(HealthcarePersonelModel model, HealthcarePersonelView view)
    {
        this.model = model;
        this.view = view;
    }

    public void setQualitativeSCTicked()
    {
        model.tickQualitativeSCResults();
    }


    public void setMAPInterval()
    {
        
    }

    //Metoder
    private void sendEnteredResultsForQuantitativeSC() {}
}