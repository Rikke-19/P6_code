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

    public boolean setMissingQuantitativeResultsSC()
    {
        boolean b = true;

        sModel.checkMissingResultsForQuantitativeSC(SafetyCriteriaModel.getSC());
        if (sModel.isMissingQuantitativeResult()) {
            hModel.enterResultsForSCIfMissing(SafetyCriteriaModel.getMissingQuantitativeResultsSC());
            b = false;
        }

        return b;
    }

    public boolean setMissingMAPInterval()
    {
        boolean b = true;

        if (SafetyCriteriaModel.checkMissingMAPInterval()) {
            hModel.enterMAPInterval();
            b = false;
        }

        return b;
    }

    public boolean setMissingTickedQualitativeSC()
    {
        boolean b = true;

        sModel.checkMissingTickedQualitativeSC(SafetyCriteriaModel.getSC());
        if (sModel.isMissingTickedQualitativeSC()) {
            hModel.tickQualitativeSCresultsIfMissing(SafetyCriteriaModel.getMissingQualitativeResultsSC());
            b = false;
        }

        return b;
    }

    public boolean setUnrealisticQualitativeResults()
    {
        boolean b = true;
        
        sModel.assessUnrealisticResultsForQuantitativeSC();
        if (sModel.isUnrealisticQuantitativeValue()) {
            hModel.enterResultsForSCIfUnrealistic(SafetyCriteriaModel.getUnrealisticQuantitativeResults());
            b = false;
        }

        return b;
    }

    public boolean setUnrealisticMAPInterval()
    {
        boolean b = true;

        sModel.assessUnrealisticMAPInterval();
        if (sModel.isUnrealisticMAPInterval()) {
            hModel.enterMAPInterval();
            b = false;
        }

        return b;
    }
  

}