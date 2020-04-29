package dk.aau.model.categorization;

import java.util.ArrayList;
import java.util.List;

import dk.aau.App;
import dk.aau.model.SafetyCriteriaModel;

public class EMCategoriesModel {

    private static String EMCategorizationIB;
    private static String EMCategorizationOB;

    private static List<SafetyCriteriaModel> yellowCriteriaIB = new ArrayList<SafetyCriteriaModel>(); 
    private static List<SafetyCriteriaModel> yellowCriteriaOB = new ArrayList<SafetyCriteriaModel>();


    // Metoder
    public static void assignEMCategoIB() {

        boolean isYellow = false;
        boolean alreadyGreen = false;

        for (SafetyCriteriaModel colorCategoIB : SafetyCriteriaModel.getSC()) {
            if (colorCategoIB.getColorIB().equals("Red")) {
                EMCategoriesModel.setEMCategorizationIB("Red");
                return;
            } else if (colorCategoIB.getColorIB().equals("Yellow")) {
                EMCategoriesModel.setEMCategorizationIB("Yellow");
                yellowCriteriaIB.add(colorCategoIB);
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
            if (colorCategoOB.getColorOB().equals("Red")) {
                EMCategoriesModel.setEMCategorizationOB("Red");
                return;
            } else if (colorCategoOB.getColorOB().equals("Yellow")) {
                EMCategoriesModel.setEMCategorizationOB("Yellow");
                yellowCriteriaOB.add(colorCategoOB);
                isYellow = true;
            } else if (isYellow == false && alreadyGreen == false) {
                EMCategoriesModel.setEMCategorizationOB("Green");
                alreadyGreen = true;
            }
        }
    }

    public static void printYellowList()
    {

        for (SafetyCriteriaModel s : yellowCriteriaIB) {
            System.out.println(s.getName() + " Value: " 
            + s.getQuantitativeSCValue() + " Boolean: " + s.getQualitativeSCValueBool()
            + " Out of bed color: " + App.ANSI_YELLOW + s.getColorIB() + App.ANSI_RESET);
        }

        for (SafetyCriteriaModel s : yellowCriteriaOB) {
            System.out.println(s.getName() + " Value: " 
            + s.getQuantitativeSCValue() + " Boolean: " + s.getQualitativeSCValueBool()
            + " Out of bed color: " + App.ANSI_YELLOW + s.getColorOB() + App.ANSI_RESET);
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


}