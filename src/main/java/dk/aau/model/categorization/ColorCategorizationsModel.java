package dk.aau.model.categorization;

import java.util.ArrayList;
import java.util.List;

import dk.aau.model.SafetyCriteriaModel;

public class ColorCategorizationsModel {
    
    // Oprettelse af lister samt initialisering af disse
    private static List<SafetyCriteriaModel> colorCategoIB = new ArrayList<SafetyCriteriaModel>();
    private static List<SafetyCriteriaModel> colorCategoOB = new ArrayList<SafetyCriteriaModel>();
    
    //Metoder
    public static void performColorCategoIB() {
        for(SafetyCriteriaModel sc : SafetyCriteriaModel.getScEPJ())
        {
            switch (sc.getName()){
                case "Laktat":
                if (sc.getValueNumber() > 4){
                    sc.setColor("Yellow");
                } else {
                    sc.setColor("Green");
                }
                break;
                
                case "SaO2":
                if (sc.getValueNumber() < 90){
                    sc.setColor("Yellow");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "FiO2":
                if (sc.getValueNumber() <= 0.6) {
                    sc.setColor("Green");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "PEEP":
                if (sc.getValueNumber() <= 10) {
                    sc.setColor("Green");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "RASS":
                if (sc.getValueNumber() == -1 || sc.getValueNumber() == 0 || sc.getValueNumber() == 1) {
                    sc.setColor("Green");
                } else if (sc.getValueNumber() == -2 || sc.getValueNumber() == 2) {
                    sc.setColor("Yellow");
                } else if (sc.getValueNumber() <-2) {
                    sc.setColor("Yellow");
                } else if (sc.getValueNumber() >2) {
                    sc.setColor("Red");
                }
                break;

                case "Respiratory rate":
                if (sc.getValueNumber() <= 33) {
                    sc.setColor("Green");
                } else {
                    sc.setColor("Green");
                }
                break;
                
                case "Ventricular rate":
                if (sc.getStableTachy() == true && sc.getValueNumber() > 150) {
                    sc.setColor("Yellow");
                } else if (sc.getStableTachy() == true && sc.getValueNumber() >= 120 && sc.getValueNumber() <= 150 ){
                    sc.setColor("Yellow");
                } else if (sc.getStableTachy() == false && sc.getValueNumber() < 120) {
                    sc.setColor("Green");
                } 
                break;

                case "Endotracheal Tube":
                if (sc.getValueBool() == true) {
                    sc.setColor("Green");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Tracheostomy Tube":
                if (sc.getValueBool() == true) {
                    sc.setColor("Green");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Mode HFOV":
                if (sc.getValueBool() == true) {
                    sc.setColor("Yellow");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Ventilator Dysynchrony":
                if (sc.getValueBool() == true) {
                    sc.setColor("Yellow");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Nitric Oxide":
                if (sc.getValueBool() == true) {
                    sc.setColor("Yellow");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Prostacyclin":
                if (sc.getValueBool() == true) {
                    sc.setColor("Yellow");
                } else {
                    sc.setColor("Green");
                }
                break;
                
                case "Prone Positioning":
                if (sc.getValueBool() == true) {
                    sc.setColor("Red");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "MAP":
                if (sc.getValueNumber() < SafetyCriteriaModel.getMapMin() && sc.getMAPCausingSymptoms() == true) {
                    sc.setColor("Yellow");
                } else if (sc.getValueNumber() >= SafetyCriteriaModel.getMapMin() && sc.getLevelOfMAPSupport().equals("Low")) {
                    sc.setColor("Green");
                } else if (sc.getValueNumber() >= SafetyCriteriaModel.getMapMin() && sc.getLevelOfMAPSupport().equals("Moderate")) {
                    sc.setColor("Yellow");
                } else if (sc.getValueNumber() >= SafetyCriteriaModel.getMapMin() && sc.getLevelOfMAPSupport().equals("High")) {
                    sc.setColor("Yellow");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Intravenous antihypotensive therapy for hypotensive emergency":
                if (sc.getValueBool() == true) {
                    sc.setColor("Red");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Known or suspected severepulmonary hypertension":
                if (sc.getValueBool() == true) {
                    sc.setColor("Yellow");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Requiring pharmacological treatment (e.g. isoprenaline) or awaiting emergency pacemaker insertion":
                if (sc.getValueBool() == true) {
                    sc.setColor("Red");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Not requiring pharmacological treatment and not awaiting emergency pacemaker insertion":
                if (sc.getValueBool() == true) {
                    sc.setColor("Yellow");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Dependent Rhythm":
                if (sc.getValueBool() == true) {
                    sc.setColor("Yellow");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Stable Underlying Rhythm":
                if (sc.getValueBool() == true) {
                    sc.setColor("Green");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Femoral IABP":
                if (sc.getValueBool() == true) {
                    sc.setColor("Green");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Femoral or subclavian (not single bicaval dual lumen cannulae)":
                if (sc.getValueBool() == true) {
                    sc.setColor("Green");
                } else {
                    sc.setColor("green");
                }
                break;

                case "Single bicaval dual lumen cannulae insertedinto a central vein":
                if (sc.getValueBool() == true) {
                    sc.setColor("Green");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Ventricular Assist Device":
                if (sc.getValueBool() == true) {
                    sc.setColor("Green");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Pulmonary Artery Catheter or other continuous cardiac output monitoring device":
                if (sc.getValueBool() == true) {
                    sc.setColor("Green");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Known or suspected acute DVT/PE":
                if (sc.getValueBool() == true) {
                    sc.setColor("Yellow");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Known or suspected severe aortic stenosis":
                if (sc.getValueBool() == true) {
                    sc.setColor("Green");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Cardiac ischemia (defined as ongoing chest pain and/or dynamic EKG changes)":
                if (sc.getValueBool() == true) {
                    sc.setColor("Yellow");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Delirum tool -ve":
                if (sc.getValueBool() == true) {
                    sc.setColor("Green");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Delirium tool +ve and able to follow simple commmands":
                if (sc.getValueBool() == true) {
                    sc.setColor("Green");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Delirium tool +ve and not able to follow simple commmands":
                if (sc.getValueBool() == true) {
                    sc.setColor("Yellow");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Active management of intracranial hypertension, with ICP not in desired range":
                if (sc.getValueBool() == true) {
                    sc.setColor("Red");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Intracranial pressure monitoring without activemanagement of intracranial hypertension":
                if (sc.getValueBool() == true) {
                    sc.setColor("Green");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Craniectomy":
                if (sc.getValueBool() == true) {
                    sc.setColor("Green");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Open lumbar drain (not clamped)":
                if (sc.getValueBool() == true) {
                    sc.setColor("Green");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Subgaleal drain":
                if (sc.getValueBool() == true) {
                    sc.setColor("Green");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Spinal precautions (pre-clearence or fixation)":
                if (sc.getValueBool() == true) {
                    sc.setColor("Red");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Acute spinal cord injury":
                if (sc.getValueBool() == true) {
                    sc.setColor("Green");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Subarachnoid haemorrhage with unclipped aneurysm":
                if (sc.getValueBool() == true) {
                    sc.setColor("Green");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Vasospasm post-aneurysmal clipping":
                if (sc.getValueBool() == true) {
                    sc.setColor("Green");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Uncontrolled seizures":
                if (sc.getValueBool() == true) {
                    sc.setColor("Red");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "ICUAW":
                if (sc.getValueBool() == true) {
                    sc.setColor("Green");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Renal Replacement Therapy":
                if (sc.getValueBool() == true) {
                    sc.setColor("Green");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Venous and arterial femoral catheters":
                if (sc.getValueBool() == true) {
                    sc.setColor("Green");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Femoral Sheats":
                if (sc.getValueBool() == true) {
                    sc.setColor("Yellow");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Other drains and attachements":
                if (sc.getValueBool() == true) {
                    sc.setColor("Green");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Known uncontrolled active bleedeing":
                if (sc.getValueBool() == true) {
                    sc.setColor("Red");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Suspicion of active bleeding or increasedbleeding risk":
                if (sc.getValueBool() == true) {
                    sc.setColor("Green");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Patient is febrile with a temperature exceedingacceptable maximum despite active physicalor pharmacological cooling mangagement":
                if (sc.getValueBool() == true) {
                    sc.setColor("Yellow");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Active hypothermia management":
                if (sc.getValueBool() == true) {
                    sc.setColor("Yellow");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Unstable/unstabilized major fracture (Pelvic, spinal, lower limp long bone)":
                if (sc.getValueBool() == true) {
                    sc.setColor("Yellow");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Large open wound (Chest/Sternum, abdomen)":
                if (sc.getValueBool() == true) {
                    sc.setColor("Green");
                } else {
                    sc.setColor("Green");
                }
                break;
            }
        colorCategoIB.add(sc);
        }
    }
    
    public static void performColorCategoOB() {
        for(SafetyCriteriaModel sc : SafetyCriteriaModel.getScEPJ())
        {
            switch (sc.getName()){
                case "Laktat":
                if (sc.getValueNumber() > 4){
                    sc.setColor("Yellow");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "SaO2":
                if (sc.getValueNumber() < 90){
                    sc.setColor("Red");
                } else {
                    sc.setColor("Green");
                }
                break;
                
                case "FiO2":
                if (sc.getValueNumber() > 0.6) {
                    sc.setColor("Yellow");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "PEEP":
                if (sc.getValueNumber() > 10) {
                    sc.setColor("Yellow");
                } else
                    sc.setColor("Green");
                
                break;

                case "RASS":
                if (sc.getValueNumber() > -1 && sc.getValueNumber() < 1)
                    sc.setColor("Green");
                else if (sc.getValueNumber() == Math.abs(2) ) 
                    sc.setColor("Yellow");
                else 
                    sc.setColor("Red");
                break;

                case "Respiratory rate":
                if (sc.getValueNumber() > 30)
                    sc.setColor("Yellow");
                else 
                    sc.setColor("Green");
                break;

                case "Ventricular rate":
                if (sc.getStableTachy() == true && sc.getValueNumber() > 150) {
                    sc.setColor("Red");
                } else if (sc.getStableTachy() == true && sc.getValueNumber() >= 120 && sc.getValueNumber() <= 150 ){
                    sc.setColor("Yellow");
                } else if (sc.getStableTachy() == false && sc.getValueNumber() < 120) {
                    sc.setColor("Green");
                } 
                break;

                case "Endotracheal Tube":
                sc.setColor("Green"); 
                break;

                case "Tracheostomy Tube":
                sc.setColor("Green");
                break;

                case "Mode HFOV":
                if(sc.getValueBool() == true)
                    sc.setColor("Red");
                else
                    sc.setColor("Green");
                break;

                case "Ventilator Dysynchrony":
                if(sc.getValueBool() == true)
                    sc.setColor("Yellow");
                else
                    sc.setColor("Green");
                break;

                case "Nitric Oxide":
                if(sc.getValueBool() == true)
                    sc.setColor("Yellow");
                else
                    sc.setColor("Green");
                
                break;

                case "Prostacyclin":
                if(sc.getValueBool() == true)
                    sc.setColor("Yellow");
                else
                    sc.setColor("Green");
                
                break;
                
                case "Prone Positioning":
                if(sc.getValueBool() == true)
                    sc.setColor("Red");
                else
                    sc.setColor("Green");
                
                break;

                case "MAP":
                if (sc.getValueNumber() < SafetyCriteriaModel.getMapMin() && sc.getMAPCausingSymptoms() == true) {
                    sc.setColor("Red");
                } else if (sc.getValueNumber() >= SafetyCriteriaModel.getMapMin() && sc.getLevelOfMAPSupport().equals("Low")) {
                    sc.setColor("Green");
                } else if (sc.getValueNumber() >= SafetyCriteriaModel.getMapMin() && sc.getLevelOfMAPSupport().equals("Moderate")) {
                    sc.setColor("Yellow");
                } else if (sc.getValueNumber() >= SafetyCriteriaModel.getMapMin() && sc.getLevelOfMAPSupport().equals("High")) {
                    sc.setColor("Red");
                } else {
                    sc.setColor("Green");
                }
                break;

                case "Intravenous antihypotensive therapy for hypotensive emergency":
                if(sc.getValueBool() == true)
                    sc.setColor("Red");
                else
                    sc.setColor("Green");
                
                break;

                case "Known or suspected severepulmonary hypertension":
                if(sc.getValueBool() == true)
                    sc.setColor("Yellow");
                else
                    sc.setColor("Green");
                
                break;

                case "Requiring pharmacological treatment (e.g. isoprenaline) or awaiting emergency pacemaker insertion":
                if(sc.getValueBool() == true)
                    sc.setColor("Red");
                else
                    sc.setColor("Green");
                
                break;

                case "Not requiring pharmacological treatment and not awaiting emergency pacemaker insertion":
                if(sc.getValueBool() == true)
                    sc.setColor("Yellow");
                else
                    sc.setColor("Green");
                
                break;

                case "Dependent Rhythm":
                if(sc.getValueBool() == true)
                    sc.setColor("Red");
                else
                    sc.setColor("Green");
                
                break;

                case "Stable Underlying Rhythm":
                sc.setColor("Green");
                
                break;

                case "Femoral IABP":
                if(sc.getValueBool() == true)
                    sc.setColor("Red");
                else
                    sc.setColor("Green");
                
                break;

                case "Femoral or subclavian (not single bicaval dual lumen cannulae)":
                if(sc.getValueBool() == true)
                    sc.setColor("Red");
                else
                    sc.setColor("Green");
                
                break;

                case "Single bicaval dual lumen cannulae insertedinto a central vein":
                if(sc.getValueBool() == true)
                    sc.setColor("Yellow");
                else
                    sc.setColor("Green");
                
                break;

                case "Ventricular Assist Device":
                sc.setColor("Green");
                
                break;

                case "Pulmonary Artery Catheter or other continuous cardiac output monitoring device":
                if(sc.getValueBool() == true)
                    sc.setColor("Yellow");
                else
                    sc.setColor("Green");
                
                break;

                case "Known or suspected acute DVT/PE":
                if(sc.getValueBool() == true)
                    sc.setColor("Yellow");
                else
                    sc.setColor("Green");
                
                break;

                case "Known or suspected severe aortic stenosis":
                if(sc.getValueBool() == true)
                    sc.setColor("Yellow");
                else
                    sc.setColor("Green");
                
                break;

                case "Cardiac ischemia (defined as ongoing chest pain and/or dynamic EKG changes)":
                if(sc.getValueBool() == true)
                    sc.setColor("Red");
                else
                    sc.setColor("Green");
                
                break;

                case "Delirum tool -ve":
                sc.setColor("Green");
                
                break;

                case "Delirium tool +ve and able to follow simple commmands":
                if(sc.getValueBool() == true)
                    sc.setColor("Yellow");
                else
                    sc.setColor("Green");
                
                break;

                case "Delirium tool +ve and not able to follow simple commmands":
                if(sc.getValueBool() == true)
                    sc.setColor("Yellow");
                else
                    sc.setColor("Green");
                
                break;

                case "Active management of intracranial hypertension, with ICP not in desired range":
                if(sc.getValueBool() == true)
                    sc.setColor("Red");
                else
                    sc.setColor("Green");
                
                break;

                case "Intracranial pressure monitoring without activemanagement of intracranial hypertension":
                if(sc.getValueBool() == true)
                    sc.setColor("Yellow");
                else
                    sc.setColor("Green");
                
                break;

                case "Craniectomy":
                if(sc.getValueBool() == true)
                    sc.setColor("Yellow");
                else
                    sc.setColor("Green");
                
                break;

                case "Open lumbar drain (not clamped)":
                if(sc.getValueBool() == true)
                    sc.setColor("Red");
                else
                    sc.setColor("Green");
                
                break;

                case "Subgaleal drain":
                if(sc.getValueBool() == true)
                    sc.setColor("Yellow");
                else
                    sc.setColor("Green");
                
                break;

                case "Spinal precautions (pre-clearence or fixation)":
                if(sc.getValueBool() == true)
                    sc.setColor("Red");
                else
                    sc.setColor("Green");
                
                break;

                case "Acute spinal cord injury":
                if(sc.getValueBool() == true)
                    sc.setColor("Yellow");
                else
                    sc.setColor("Green");
                
                break;

                case "Subarachnoid haemorrhage with unclipped aneurysm":
                if(sc.getValueBool() == true)
                    sc.setColor("Yellow");
                else
                    sc.setColor("Green");
                
                break;

                case "Vasospasm post-aneurysmal clipping":
                if(sc.getValueBool() == true)
                    sc.setColor("Yellow");
                else
                    sc.setColor("Green");
                
                break;

                case "Uncontrolled seizures":
                if(sc.getValueBool() == true)
                    sc.setColor("Red");
                else
                    sc.setColor("Green");
                
                break;

                case "ICUAW":
                sc.setColor("Green");
                
                break;

                case "Renal Replacement Therapy":
                sc.setColor("Green");
                
                break;

                case "Venous and arterial femoral catheters":
                sc.setColor("Green");
                
                break;

                case "Femoral Sheats":
                if(sc.getValueBool() == true)
                    sc.setColor("Red");
                else
                    sc.setColor("Green");
                
                break;

                case "Other drains and attachements":
                sc.setColor("Green");
                
                break;

                case "Known uncontrolled active bleedeing":
                if(sc.getValueBool() == true)
                    sc.setColor("Red");
                else
                    sc.setColor("Green");
                
                break;

                case "Suspicion of active bleeding or increasedbleeding risk":
                if(sc.getValueBool() == true)
                    sc.setColor("Yellow");
                else
                    sc.setColor("Green");
                
                break;

                case "Patient is febrile with a temperature exceedingacceptable maximum despite active physicalor pharmacological cooling mangagement":
                if(sc.getValueBool() == true)
                    sc.setColor("Yellow");
                else
                    sc.setColor("Green");
                
                break;

                case "Active hypothermia management":
                if(sc.getValueBool() == true)
                    sc.setColor("Yellow");
                else
                    sc.setColor("Green");
                
                break;

                case "Unstable/unstabilized major fracture (Pelvic, spinal, lower limp long bone)":
                if(sc.getValueBool() == true)
                    sc.setColor("Red");
                else
                    sc.setColor("Green");
                
                break;

                case "Large open wound (Chest/Sternum, abdomen)":
                if(sc.getValueBool() == true)
                    sc.setColor("Red");
                else
                    sc.setColor("Green");
                
                break;
            }
        colorCategoOB.add(sc);
        }
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