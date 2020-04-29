package dk.aau.view;

import java.util.ArrayList;
import java.util.List;

import dk.aau.model.SafetyCriteriaModel;

public class WarningsView {

    private List<SafetyCriteriaModel> MissingQuantitativeResultsSC = new ArrayList<SafetyCriteriaModel>();
    private List<SafetyCriteriaModel> UnrealisticQuantitativeResults = new ArrayList<SafetyCriteriaModel>();
    private boolean MissingMAPInterval;
    private boolean MissingTickedQuantitativeSC;
    private boolean UnrealisticMAPInterval;

    //Metoder
    public void showMissingQuantitativeResultsSC() {

    }

    public void showMissingMAPInterval() {
        
    }

    public void showMissingQualitativeSC() {
        
    }

    public void showUnrealisticQuantitativeResults() {
        
    }

    public void showUnrealisticMAPInterval() {
        
    }
}