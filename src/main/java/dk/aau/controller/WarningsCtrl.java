package dk.aau.controller;

import java.util.List;

import dk.aau.controller.person.HealthcarePersonelCtrl;
import dk.aau.model.SafetyCriteriaModel;
import dk.aau.view.WarningsView;

public class WarningsCtrl {
    private HealthcarePersonelCtrl hCtrl;
    private WarningsView wView;
    private SafetyCriteriaModel sModel;

    public WarningsCtrl(HealthcarePersonelCtrl hCtrl, WarningsView wView, SafetyCriteriaModel sModel)
    {   
        this.hCtrl = hCtrl;
        this.sModel = sModel;
        this.wView = wView;
    }   

    //Metoder
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