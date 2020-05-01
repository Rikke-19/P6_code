/*
* This Java source file was generated by the Gradle 'init' task.
*/
package dk.aau;

import java.util.Scanner;

import dk.aau.controller.WarningsCtrl;
import dk.aau.controller.categorization.ColorCategorizationsCtrl;
import dk.aau.controller.categorization.EMCategoriesCtrl;
import dk.aau.controller.person.HealthcarePersonelCtrl;
import dk.aau.controller.person.PatientCtrl;
import dk.aau.model.SafetyCriteriaModel;
import dk.aau.model.categorization.ColorCategorizationsModel;
import dk.aau.model.categorization.EMCategoriesModel;
import dk.aau.model.person.HealthcarePersonelModel;
import dk.aau.model.person.PatientModel;
import dk.aau.view.SafetyAssessmentView;
import dk.aau.view.WarningsView;
import dk.aau.view.categorization.ColorCategorizationsView;
import dk.aau.view.person.HealthcarePersonelView;
import dk.aau.view.person.PatientView;

public class App {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static final Scanner input = new Scanner(System.in);


    public static void main(String[] args) { 


        // initialization
        Init.InitSafetyCriteria();

        HealthcarePersonelModel hModel = new HealthcarePersonelModel();
        HealthcarePersonelView hView = new HealthcarePersonelView();

        SafetyCriteriaModel sModel = new SafetyCriteriaModel();
        WarningsView wView = new WarningsView();

        PatientModel pModel = new PatientModel(1234567890);
        PatientView pView = new PatientView();

        ColorCategorizationsModel cModel = new ColorCategorizationsModel();
        ColorCategorizationsView cView = new ColorCategorizationsView();

        EMCategoriesModel eModel = new EMCategoriesModel();
        SafetyAssessmentView aView = new SafetyAssessmentView();

        ColorCategorizationsCtrl cCtrl = new ColorCategorizationsCtrl(cModel, cView);
        EMCategoriesCtrl eCtrl = new EMCategoriesCtrl(eModel, aView);
        PatientCtrl pCtrl = new PatientCtrl(pModel, pView);
        HealthcarePersonelCtrl hCtrl = new HealthcarePersonelCtrl(hModel, hView);
        WarningsCtrl wCtrl = new WarningsCtrl(hModel, wView, sModel);

        // indsæt værdier
        // Indsæt kvalitative OG kvantitative grundet proof of concept
        hModel.tickQualitativeSCResults();

        // - - - - - FOR TESTING - - - - - - - - - - - - - - - - - - - -
        /*
         * int i = 0; for (SafetyCriteriaModel s : SafetyCriteriaModel.getSC()) {
         * s.setQuantitativeSCValue(i); i++; s.setLevelOfMAPSupport("Low"); if
         * (s.getName().equals("MAP")) { boolean savedValue;
         * System.out.print(s.getName()); savedValue = false; while (savedValue ==
         * false) { if (s.getTakesNumber()) { System.out.println(" [insert number]: ");
         * String inputString = input.nextLine(); try { if (inputString == "exit" ||
         * inputString == "Exit") { savedValue = true; } else {
         * s.setQuantitativeSCValue(Double.parseDouble(inputString)); savedValue = true;
         * s.setRecievedValue(true); } } catch (Exception e) {
         * System.out.println("Invalid input"); savedValue = false; } } else { if
         * (s.getTakesNumber()) { System.out.println(" [insert number]: "); String
         * inputString = input.nextLine(); try { if (inputString.equals("exit") ||
         * inputString.equals("Exit")) { savedValue = true; } else {
         * s.setQuantitativeSCValue(Double.parseDouble(inputString)); savedValue = true;
         * s.setRecievedValue(true); } } catch (Exception e) {
         * System.out.println("Invalid input"); savedValue = false; } } else {
         * System.out.println(" [insert yes/no]: "); String inputString =
         * input.nextLine(); try { if (inputString.equals("exit") ||
         * inputString.equals("Exit")) { savedValue = true; } else if
         * (inputString.equals("yes") || inputString.equals("Yes")) {
         * s.setQualitativeSCValueBool(true); s.setRecievedValue(true); savedValue =
         * true; } else if (inputString.equals("no") || inputString.equals("No")) {
         * s.setQualitativeSCValueBool(false); s.setRecievedValue(true); savedValue =
         * true; } } catch (Exception e) { System.out.println("Invalid input");
         * savedValue = false; } } } } savedValue = false; while (!savedValue) {
         * System.out.println("Insert level of MAP support [Low, Moderate or High]");
         * String input = App.input.nextLine(); try { if (input.equals("Low") ||
         * input.equals("Moderate") || input.equals("High") || input.equals("low") ||
         * input.equals("moderate") || input.equals("high")) {
         * s.setLevelOfMAPSupport(input); savedValue = true; } else{
         * System.out.println("Invalid input"); savedValue = false; } } catch (Exception
         * e) { System.out.println("Invalid input"); savedValue = false; } }
         * 
         * } else if(i % 2 == 0) { s.setQualitativeSCValueBool(true);
         * 
         * s.setRecievedValue(true); } else { s.setQualitativeSCValueBool(false);
         * s.setRecievedValue(true); //s.setQuantitativeSCValue(0); } }
         */
        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        
        // risikokontrol
        while (wCtrl.CheckValues()) {
            
        }
        

        // kategorisering
        ColorCategorizationsModel.performColorCategoIB();
        ColorCategorizationsModel.performColorCategoOB();

        EMCategoriesModel.assignEMCategoIB();
        EMCategoriesModel.assignEMCategoOB();

        if (eModel.getEMCategorizationIB().equals("Yellow") || eModel.getEMCategorizationOB().equals("Yellow")) {
            EMCategoriesModel.printYellowList();
        }

        // vis kategorisering
        eCtrl.getEMCategorizationIB();
        eCtrl.getEMCategorizationOB();
        
    
        // vis alle kriterier
        System.out.println("Do you want to see all safety criteria? \n [yes/no]");
        
        boolean savedValue = false;
        while (!savedValue) {
            try {
                String iString = input.nextLine();
                if (iString.equals("yes") || iString.equals("yes"))
                {
                    ShowAllCriteria();
                    savedValue = true;
                } else if (iString.equals("no") || iString.equals("No")) {

                    savedValue = true;
                    
                } else if (iString.equals("exit") || iString.equals("Exit")) {
                    savedValue = true;
                }
            } catch (Exception e) {
                System.out.println("Invalid input");
                savedValue = false;
            }

            // close scanner
            // input.close();
        }
    
    }
    private static void ShowAllCriteria() {
        for (SafetyCriteriaModel s : SafetyCriteriaModel.getSC()) {
            System.out.println("Name: " + ANSI_BLUE + s.getName() + ANSI_RESET + " Value: " + 
            ANSI_BLUE + s.getQuantitativeSCValue()+ ANSI_RESET + " Boolean: " + ANSI_BLUE + 
            s.getQualitativeSCValueBool()+ ANSI_RESET + " Color in bed: " +  ANSI_BLUE +
            s.getColorIB()+ ANSI_RESET + " Color out of bed " + ANSI_BLUE + s.getColorOB() + ANSI_RESET);
        }
    }

}
