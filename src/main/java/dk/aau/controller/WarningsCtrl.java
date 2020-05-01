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
    public boolean CheckValues()
    {
        boolean b = true;
        // IF MAP IN UNREALISTIC
        
        if (sModel.checkMissingMAP()) {
            hModel.enterMAPIfMissing();
            b = false;
        }

        if (!sModel.checkMissingMAPInterval()) {
            hModel.enterMAPInterval();
            b = false;
        }

        sModel.assessUnrealisticMAPInterval();
        if (sModel.isUnrealisticMAPInterval()) {
            hModel.enterMAPIfUnrealistic();
            b = false;
        }
        
        sModel.checkMissingResultsForQuantitativeSC(SafetyCriteriaModel.getSC());
        if (sModel.isMissingQuantitativeResult()) {
            hModel.enterResultsForSCIfMissing(SafetyCriteriaModel.getMissingQuantitativeResultsSC());
            b = false;
        }
        
        sModel.checkMissingTickedQualitativeSC(SafetyCriteriaModel.getSC());
        if (sModel.isMissingTickedQualitativeSC()) {
            hModel.tickQualitativeSCresultsIfMissing(SafetyCriteriaModel.getMissingQualitativeResultsSC());
            b = false;
        }
        sModel.assessUnrealisticResultsForQuantitativeSC();
        if (sModel.isUnrealistivQuantitativeValue()) {
            hModel.enterResultsForSCIfUnrealistic(SafetyCriteriaModel.getUnrealisticQuantitativeResults());
            b = false;
        }
        return b;
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