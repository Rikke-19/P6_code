package dk.aau.model.categorization;

import java.util.ArrayList;
import java.util.List;

import dk.aau.model.SafetyCriteriaModel;
import dk.aau.view.SafetyAssessmentView;

public class EMCategoriesModel {

    private static List<SafetyCriteriaModel> yellowCriteria = new ArrayList<SafetyCriteriaModel>();
    private static boolean emColorFound = false;

    // Metoder
    public static void assignEMCategoIB() {
 
        /*do {
            for (SafetyCriteriaModel colorCategoIB : SafetyCriteriaModel.getScEPJ()) {
                    if (colorCategoIB.getColor() == "Red") {
                        SafetyAssessmentView.setEMCategorizationIB("Red");
                        emColorFound = true;
                    } else if (colorCategoIB.getColor() == "Yellow") {
                        SafetyAssessmentView.setEMCategorizationIB("Yellow");
                        yellowCriteria.add(colorCategoIB);
                        // emColorFound = true;
                    } else if (colorCategoIB.getColor() == "Green") {
                        SafetyAssessmentView.setEMCategorizationIB("Green");
                        // emColorFound = true;
                }
            }            
        } while (emColorFound == false);
        */ // Giver oventstående mere mening end nedenstående?
        int i = 0;
        for (SafetyCriteriaModel colorCategoIB : SafetyCriteriaModel.getScEPJ()) {
            while (emColorFound == false) {
                if (colorCategoIB.getColor() == "Red") {
                    SafetyAssessmentView.setEMCategorizationIB("Red");
                    emColorFound = true;
                } else if (colorCategoIB.getColor() == "Yellow") {
                    SafetyAssessmentView.setEMCategorizationIB("Yellow"); // TO DO skal nøjes med at melde gul én gang
                    yellowCriteria.add(colorCategoIB);
                    // emColorFound = true;
                } else if (colorCategoIB.getColor() == "Green") {
                    SafetyAssessmentView.setEMCategorizationIB("Green"); // TO DO Skal nøjes med at melde grøn én gang
                    // emColorFound = true;
            }
        }
        System.out.println(colorCategoIB.getColor());
        System.out.println(i);
        i++;
        }
            
    }

    private static void assignEMCategoOB() {
        
    }
}