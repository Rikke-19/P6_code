package dk.aau.model.categorization;

import java.util.ArrayList;
import java.util.List;

import dk.aau.model.SafetyCriteriaModel;

public class ColorCategorizationsModel {
    
    // Oprettelse af lister samt initialisering af disse
    private static List<SafetyCriteriaModel> colorCategoIB = new ArrayList<SafetyCriteriaModel>();
    private static List<SafetyCriteriaModel> colorCategoOB = new ArrayList<SafetyCriteriaModel>();
    
    // Liste håndtering
    public static void AddToListEnteredSC(SafetyCriteriaModel hp) {
        colorCategoIB.add(hp);
    }
    
    public static void AddToListMapInterval(SafetyCriteriaModel hp) {
        colorCategoOB.add(hp);
    }
    
    //Metoder
    public void performColorCategoIB() {
        for(SafetyCriteriaModel sc : SafetyCriteriaModel.getScEPJ())
        {
            switch (sc.getName()){
                
                case "Laktat":
                if (sc.getValueNumber() > 4){
                    sc.setColor("Yellow");
                } else 
                {
                    sc.setColor("Green");
                }
                break;
                
                case "FiO2"
                if () {
                }

                
            }
        }
    }
    
    private void performColorCategoOB() {
        
    }
    
    // getters og setters
    
    public static List<SafetyCriteriaModel> getColorCategoIB() {
        return colorCategoIB;
    }
    
    public static void setColorCategoIB(List<SafetyCriteriaModel> colorCategoIB) {
        ColorCategorizationsModel.colorCategoIB = colorCategoIB;
    }
    
    public static List<SafetyCriteriaModel> getColorCategoOB() {
        return colorCategoOB;
    }
    
    public static void setColorCategoOB(List<SafetyCriteriaModel> colorCategoOB) {
        ColorCategorizationsModel.colorCategoOB = colorCategoOB;
    }
}