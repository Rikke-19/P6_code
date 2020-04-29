package dk.aau.controller.categorization;

import dk.aau.model.categorization.EMCategoriesModel;
import dk.aau.view.SafetyAssessmentView;

public class EMCategoriesCtrl {

    EMCategoriesModel eModel;
    SafetyAssessmentView aView;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";


    public EMCategoriesCtrl(EMCategoriesModel eModel, SafetyAssessmentView aView)
    {
        this.eModel = eModel;
        this.aView = aView;
    }

    //Metoder
    public void getEMCategorizationIB()
    {
        if (eModel.getEMCategorizationIB().equals("Green")) {
            System.out.println("Color in bed: " + ANSI_GREEN + eModel.getEMCategorizationIB() + ANSI_RESET);
        } else if (eModel.getEMCategorizationIB().equals("Yellow")) {
            System.out.println("Color in bed: " + ANSI_YELLOW + eModel.getEMCategorizationIB() + ANSI_RESET);
        } else if (eModel.getEMCategorizationIB().equals("Red")) {
            System.out.println("Color in bed: " + ANSI_RED + eModel.getEMCategorizationIB() + ANSI_RESET);
        }
    }
    public void getEMCategorizationOB()
    {
        if (eModel.getEMCategorizationOB().equals("Green")) {
            System.out.println("Color out of bed: " + ANSI_GREEN + eModel.getEMCategorizationOB() + ANSI_RESET);
        } else if (eModel.getEMCategorizationOB().equals("Yellow")) {
            System.out.println("Color out of bed: " + ANSI_YELLOW + eModel.getEMCategorizationOB() + ANSI_RESET);
        } else if (eModel.getEMCategorizationOB().equals("Red")) {
            System.out.println("Color out of bed: " + ANSI_RED + eModel.getEMCategorizationOB() + ANSI_RESET);
        }
    }
    private void getYellowSCListIB()
    {

    }
    private void getYellowSCListOB()
    {

    }
}