package dk.aau.model.categorization;

import java.util.ArrayList;
import java.util.List;

import dk.aau.App;
import dk.aau.model.SafetyCriteriaModel;

public class EMCategoriesModel {

    private static String EMCategorizationIB;
    private static String EMCategorizationOB;

    private static List<SafetyCriteriaModel> yellowCriteria = new ArrayList<SafetyCriteriaModel>(); // MANGLER I MVC


    // Metoder
    public static void assignEMCategoIB() {

        boolean isYellow = false;
        boolean alreadyGreen = false;

        for (SafetyCriteriaModel colorCategoIB : SafetyCriteriaModel.getSC()) {
            if (colorCategoIB.getColor().equals("Red")) {
                EMCategoriesModel.setEMCategorizationIB("Red");
                return;
            } else if (colorCategoIB.getColor().equals("Yellow")) {
                EMCategoriesModel.setEMCategorizationIB("Yellow");
                yellowCriteria.add(colorCategoIB);
                isYellow = true;
            } else if (isYellow == false && alreadyGreen == false) {
                EMCategoriesModel.setEMCategorizationIB("Green");
                alreadyGreen = true;
            }
        }
    }

    public static void assignEMCategoOB() {

        boolean isYellow = false;
        boolean alreadyGreen = false;

        for (SafetyCriteriaModel colorCategoOB : SafetyCriteriaModel.getSC()) {
            if (colorCategoOB.getColor().equals("Red")) {
                EMCategoriesModel.setEMCategorizationOB("Red");
                return;
            } else if (colorCategoOB.getColor().equals("Yellow")) {
                EMCategoriesModel.setEMCategorizationOB("Yellow");
                yellowCriteria.add(colorCategoOB);
                isYellow = true;
            } else if (isYellow == false && alreadyGreen == false) {
                EMCategoriesModel.setEMCategorizationOB("Green");
                alreadyGreen = true;
            }
        }
    }

    public static void printYellowList()
    {
        for (SafetyCriteriaModel s : yellowCriteria) {
            System.out.println(s.getName() + " Value: " 
            + s.getQuantitativeSCValue() + " Boolean: " + s.getQualitativeSCValueBool()
            + " Categori: " + App.ANSI_YELLOW + s.getColor() + App.ANSI_RESET);
        }
    }



    // GETTERS AND SETTERS

    public String getEMCategorizationIB() {
        return EMCategorizationIB;
    }

    public static void setEMCategorizationIB(String eMCategorizationIB) {
        EMCategorizationIB = eMCategorizationIB;
    }

    public String getEMCategorizationOB() {
        return EMCategorizationOB;
    }

    public static void setEMCategorizationOB(String eMCategorizationOB) {
        EMCategorizationOB = eMCategorizationOB;
    }

    public static List<SafetyCriteriaModel> getYellowCriteria() {
        return yellowCriteria;
    }

    public static void setYellowCriteria(List<SafetyCriteriaModel> yellowCriteria) {
        EMCategoriesModel.yellowCriteria = yellowCriteria;
    }
}