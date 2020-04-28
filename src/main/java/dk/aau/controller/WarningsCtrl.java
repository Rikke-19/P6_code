package dk.aau.controller;

import java.util.List;

import dk.aau.model.SafetyCriteriaModel;
import dk.aau.model.person.HealthcarePersonelModel;
import dk.aau.view.WarningsView;

public class WarningsCtrl {
    private HealthcarePersonelModel hModel;
    private WarningsView wView;
    private SafetyCriteriaModel sModel;
    
    public WarningsCtrl(HealthcarePersonelModel hModel, WarningsView wView, SafetyCriteriaModel sModel)
    {   
        this.hModel = hModel;
        this.sModel = sModel;
        this.wView = wView;
    }   
    //Metoder
    public void CheckValues()
    {
        // IF MAP IN UNREALISTIC
        
        if (sModel.checkMissingMAP()) {
            hModel.enterMAPIfMissing();
        }

        if (!sModel.checkMissingMAPInterval()) {
            hModel.enterMAPInterval();
        }

        sModel.assessUnrealisticMAPInterval();
        if (sModel.isUnrealisticMAPInterval()) {
            hModel.enterMAPIfUnrealistic();
        }
        
        sModel.checkMissingResultsForQuantitativeSC(SafetyCriteriaModel.getSC());
        if (sModel.isMissingQuantitativeResult()) {
            hModel.enterResultsForSCIfMissing(SafetyCriteriaModel.getMissingQuantitativeResultsSC());
        }
        
        sModel.checkMissingTickedQualitativeSC(SafetyCriteriaModel.getSC());
        if (sModel.isMissingTickedQualitativeSC()) {
            hModel.tickQualitativeSCresultsIfMissing(SafetyCriteriaModel.getMissingQualitativeResultsSC());
        }
    }
    
        
    
    
    //getters
    
    private List<SafetyCriteriaModel> MissingQuantitativeSC() {
        return sModel.getMissingQuantitativeResultsSC();
    }
    
    private void getMissingMAPInterval() {
        
    }
    
    private void getMissingCheckedSC() {
        
    }
    
    private void getUnrealisticResultsForSCEPJ() {
        
    }
    
    private void getUnrealisticMAPInterval() {
        
    }
}