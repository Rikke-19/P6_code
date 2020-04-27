package dk.aau.model.categorization;

import java.util.ArrayList;
import java.util.List;
import java.lang.Object;

import dk.aau.model.SafetyCriteriaModel;
import dk.aau.view.SafetyAssessmentView;

public class EMCategoriesModel {

    private static List<SafetyCriteriaModel> yellowCriteria = new ArrayList<SafetyCriteriaModel>();

    // Metoder
    public static void assignEMCategoIB() {

        boolean isYellow = false;
        boolean alreadyGreen = false;

        for (SafetyCriteriaModel colorCategoIB : SafetyCriteriaModel.getScEPJ()) {
                if (colorCategoIB.getColor().equals("Red")) {
                    SafetyAssessmentView.setEMCategorizationIB("Red");
                    return;
                } else if (colorCategoIB.getColor().equals("Yellow")) {
                    SafetyAssessmentView.setEMCategorizationIB("Yellow");
                    yellowCriteria.add(colorCategoIB);
                    isYellow = true;
                } else if (isYellow == false && alreadyGreen == false) {
                    SafetyAssessmentView.setEMCategorizationIB("Green");
                    alreadyGreen = true; 
                }
        }
    }
    
    public static void assignEMCategoOB() {

            boolean isYellow = false;
            boolean alreadyGreen = false;
            
            for (SafetyCriteriaModel colorCategoOB : SafetyCriteriaModel.getScEPJ()) {
                    if (colorCategoOB.getColor().equals("Red")) {
                        SafetyAssessmentView.setEMCategorizationOB("Red");
                        return;
                    } else if (colorCategoOB.getColor().equals("Yellow")) {
                        SafetyAssessmentView.setEMCategorizationOB("Yellow");
                        yellowCriteria.add(colorCategoOB);
                        isYellow = true;
                    } else if (isYellow == false && alreadyGreen == false) {
                        SafetyAssessmentView.setEMCategorizationOB("Green");
                        alreadyGreen = true; 
                    }
            }
    }
}