package dk.aau.model.categorization;

import java.util.ArrayList;
import java.util.List;

public class ColorCategorizationsModel {
    
    // Oprettelse af lister samt initialisering af disse
    private static List<ColorCategorizationsModel> colorCategoIB = new ArrayList<ColorCategorizationsModel>();
    private static List<ColorCategorizationsModel> colorCategoOB = new ArrayList<ColorCategorizationsModel>();
    
    // Liste håndtering
    public static void AddToListEnteredSC(ColorCategorizationsModel hp) {
        colorCategoIB.add(hp);
    }

	public static void AddToListMapInterval(ColorCategorizationsModel hp) {
        colorCategoOB.add(hp);
    }

    //Metoder
    private void performColorCategoIB() {

    }

    private void performColorCategoOB() {

    }

    // getters og setters

    public static List<ColorCategorizationsModel> getColorCategoIB() {
        return colorCategoIB;
    }

    public static void setColorCategoIB(List<ColorCategorizationsModel> colorCategoIB) {
        ColorCategorizationsModel.colorCategoIB = colorCategoIB;
    }

    public static List<ColorCategorizationsModel> getColorCategoOB() {
        return colorCategoOB;
    }

    public static void setColorCategoOB(List<ColorCategorizationsModel> colorCategoOB) {
        ColorCategorizationsModel.colorCategoOB = colorCategoOB;
    }
}