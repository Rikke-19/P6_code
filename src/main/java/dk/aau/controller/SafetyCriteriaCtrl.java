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
        
        //sModel.assessUnrealisticResultsForQuantitativeSC();
        
        sModel.checkMissingMAPInterval();
        if (sModel.isMissingMAPInterval()) {
            hModel.enterMAPIfMissing();
        }
        sModel.assessUnrealisticMAPInterval();
        if (sModel.isUnrealisticMAPInterval()) {
            hModel.enterMAPIfUnrealistic();
        }
        sModel.checkMissingResultsForQuantitativeSC(SafetyCriteriaModel.getSC());
        if (sModel.isMissingQuantitativeResult()) {
            hModel.enterResultsForSCIfMissing(SafetyCriteriaModel.getMissingQualitativeResultsSC());
        }
        sModel.checkMissingTickedQualitativeSC(SafetyCriteriaModel.getSC());
        if (sModel.isMissingTickedQualitativeSC()) {
            hModel.tickQualitativeSCresultsIfMissing(SafetyCriteriaModel.getMissingQualitativeResultsSC());
        }
    }
    
    //Metoder
    public void getSCList()
    {
        
    }
}