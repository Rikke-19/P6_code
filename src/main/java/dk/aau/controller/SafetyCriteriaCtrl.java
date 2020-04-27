package dk.aau.controller;

import dk.aau.model.SafetyCriteriaModel;
import dk.aau.model.person.HealthcarePersonelModel;

public class SafetyCriteriaCtrl {
    private HealthcarePersonelModel hModel;
    private SafetyCriteriaModel sModel;

    public SafetyCriteriaCtrl(SafetyCriteriaModel sModel, HealthcarePersonelModel hModel)
    {
        this.hModel = hModel;
        this.sModel = sModel;
    }

    public void checkValues()
    {
        sModel.checkMissingResultsForQuantitativeSC(SafetyCriteriaModel.getSC());
        sModel.checkMissingTickedQualitativeSC(SafetyCriteriaModel.getSC());
        sModel.checkMissingMAPInterval();
        sModel.assessUnrealisticMAPInterval();
        sModel.assessUnrealisticResultsForQuantitativeSC();

        if (sModel.isMissingMAPInterval()) {
            hModel.enterMAPIfMissing();
        }
        if (sModel.isUnrealisticMAPInterval()) {
            hModel.enterMAPIfUnrealistic();
        }
        if (sModel.isMissingQuantitativeResult()) {
            hModel.enterResultsForSCIfMissing(SafetyCriteriaModel.getMissingQualitativeResultsSC());
        }
        if (sModel.isMissingTickedQualitativeSC()) {
            hModel.tickQualitativeSCresultsIfMissing(SafetyCriteriaModel.getMissingQualitativeResultsSC());
        }
    }
    
    //Metoder
    public void getSCList()
    {

    }
}