package dk.aau.model.categorization;

import java.util.ArrayList;
import java.util.List;

import dk.aau.model.SafetyCriteriaModel;

public class ColorCategorizationsModel {

    // Oprettelse af lister samt initialisering af disse
    private static List<SafetyCriteriaModel> ColorCategoIB = new ArrayList<SafetyCriteriaModel>();
    private static List<SafetyCriteriaModel> ColorCategoOB = new ArrayList<SafetyCriteriaModel>();

    // Metoder
    public static void performColorCategoIB() {

        for (SafetyCriteriaModel SC : SafetyCriteriaModel.getSC()) {
            switch (SC.getName()) {
                case "Laktat":
                    if (SC.getQuantitativeSCValue() > 4) {
                        SC.setColorIB("Yellow");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "SaO2":
                    if (SC.getQuantitativeSCValue() < 90) {
                        SC.setColorIB("Yellow");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "FiO2":
                    if (SC.getQuantitativeSCValue() > 0.6) {
                        SC.setColorIB("Yellow");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "PEEP":
                    if (SC.getQuantitativeSCValue() > 10) {
                        SC.setColorIB("Yellow");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "RASS":
                    if (SC.getQuantitativeSCValue() >= -1 && SC.getQuantitativeSCValue() <= 1) {
                        SC.setColorIB("Green");
                    } else if (SC.getQuantitativeSCValue() == -2 || SC.getQuantitativeSCValue() == 2) {
                        SC.setColorIB("Yellow");
                    } else if (SC.getQuantitativeSCValue() < -2) {
                        SC.setColorIB("Yellow");
                    } else if (SC.getQuantitativeSCValue() > 2) {
                        SC.setColorIB("Red");
                    }
                    break;

                case "Respiratory rate":
                    if (SC.getQuantitativeSCValue() > 30) {
                        SC.setColorIB("Yellow");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Ventricular rate":
                    if (SC.getStableTachy() == true && SC.getQuantitativeSCValue() > 150) {
                        SC.setColorIB("Yellow");
                    } else if (SC.getStableTachy() == true && SC.getQuantitativeSCValue() >= 120
                            && SC.getQuantitativeSCValue() <= 150) {
                        SC.setColorIB("Yellow");
                    } else if (SC.getQuantitativeSCValue() < 120) {
                        // SC.getStableTachy() == false &&
                        // Uanset om den er true eller false skal den acceptere det,
                        // så der er ingen grund til at inkludere det
                        SC.setColorIB("Green");
                    } else {
                        SC.setColorIB("Yellow"); // DE HER ER TVETYDIGE
                    }
                    break;

                case "Endotracheal Tube":
                    SC.setColorIB("Green");
                    break;

                case "Tracheostomy Tube":
                    SC.setColorIB("Green");
                    break;

                case "Mode HFOV":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Yellow");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Ventilator Dysynchrony":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Yellow");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Nitric Oxide":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Yellow");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Prostacyclin":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Yellow");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Prone Positioning":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Red");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "MAP":
                    if (SC.getQuantitativeSCValue() < SafetyCriteriaModel.getMAPIntervalMin()
                            && SC.getMAPCausingSymptoms() == true) {
                        SC.setColorIB("Yellow");
                    } else if (SC.getQuantitativeSCValue() < SafetyCriteriaModel.getMAPIntervalMin()
                            && SC.getLevelOfMAPSupport().equals("Low") || SC.getLevelOfMAPSupport().equals("Moderate")
                            || SC.getLevelOfMAPSupport().equals("High")) {
                        SC.setColorIB("Yellow");
                    } else if (SC.getQuantitativeSCValue() >= SafetyCriteriaModel.getMAPIntervalMin()
                            && (SC.getLevelOfMAPSupport().equals("Low") || SC.getLevelOfMAPSupport().equals("None"))) {
                        SC.setColorIB("Green");
                    } else if (SC.getQuantitativeSCValue() >= SafetyCriteriaModel.getMAPIntervalMin()
                            && SC.getLevelOfMAPSupport().equals("Moderate")) {
                        SC.setColorIB("Yellow");
                    } else if (SC.getQuantitativeSCValue() >= SafetyCriteriaModel.getMAPIntervalMin()
                            && SC.getLevelOfMAPSupport().equals("High")) {
                        SC.setColorIB("Yellow");
                    } else {
                        SC.setColorIB("Yellow");
                    }
                    break;

                case "Intravenous antihypotensive therapy for hypotensive emergency":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Red");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Known or suspected severepulmonary hypertension":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Yellow");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Requiring pharmacological treatment (e.g. isoprenaline) or awaiting emergency pacemaker insertion":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Red");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                // DEN HER KAN KOMBINERES MED OVENSTÅENDE OG DEREFTER FJERNES
                case "Not requiring pharmacological treatment and not awaiting emergency pacemaker insertion":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Yellow");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Dependent Rhythm":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Yellow");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Stable Underlying Rhythm":
                    SC.setColorIB("Green");
                    break;

                case "Femoral IABP":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Green");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Femoral or subclavian (not single bicaval dual lumen cannulae)":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Green");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Single bicaval dual lumen cannulae insertedinto a central vein":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Green");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Ventricular Assist Device":
                    SC.setColorIB("Green");
                    break;

                case "Pulmonary Artery Catheter or other continuous cardiac output monitoring device":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Green");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Known or suspected acute DVT/PE":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Yellow");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Known or suspected severe aortic stenosis":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Green");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Cardiac ischemia (defined as ongoing chest pain and/or dynamic EKG changes)":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Yellow");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Delirium tool -ve":
                    SC.setColorIB("Green");
                    break;

                case "Delirium tool +ve and able to follow simple commmands":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Green");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Delirium tool +ve and not able to follow simple commmands":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Yellow");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Active management of intracranial hypertension, with ICP not in desired range":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Red");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Intracranial pressure monitoring without activemanagement of intracranial hypertension":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Green");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Craniectomy":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Green");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Open lumbar drain (not clamped)":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Green");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Subgaleal drain":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Green");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Spinal precautions (pre-clearence or fixation)":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Red");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Acute spinal cord injury":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Green");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Subarachnoid haemorrhage with unclipped aneurysm":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Green");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Vasospasm post-aneurysmal clipping":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Green");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Uncontrolled seizures":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Red");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "ICUAW":
                    SC.setColorIB("Green");
                    break;

                case "Renal Replacement Therapy":
                    SC.setColorIB("Green");
                    break;

                case "Venous and arterial femoral catheters":
                    SC.setColorIB("Green");
                    break;

                case "Femoral Sheats":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Yellow");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Other drains and attachements":
                    SC.setColorIB("Green");
                    break;

                case "Known uncontrolled active bleedeing":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Red");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Suspicion of active bleeding or increasedbleeding risk":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Green");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Patient is febrile with a temperature exceedingacceptable maximum despite active physicalor pharmacological cooling mangagement":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Yellow");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Active hypothermia management":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Yellow");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Unstable/unstabilized major fracture (Pelvic, spinal, lower limp long bone)":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Yellow");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;

                case "Large open wound (Chest/Sternum, abdomen)":
                    if (SC.getQualitativeSCValueBool() == true) {
                        SC.setColorIB("Green");
                    } else {
                        SC.setColorIB("Green");
                    }
                    break;
            }
            ColorCategoIB.add(SC);
        }
    }

    public static void performColorCategoOB() {
        for (SafetyCriteriaModel SC : SafetyCriteriaModel.getSC()) {
            switch (SC.getName()) {
                case "Laktat":
                    if (SC.getQuantitativeSCValue() > 4) {
                        SC.setColorOB("Yellow");
                    } else {
                        SC.setColorOB("Green");
                    }
                    break;

                case "SaO2":
                    if (SC.getQuantitativeSCValue() < 90) {
                        SC.setColorOB("Red");
                    } else {
                        SC.setColorOB("Green");
                    }
                    break;

                case "FiO2":
                    if (SC.getQuantitativeSCValue() > 0.6) {
                        SC.setColorOB("Yellow");
                    } else {
                        SC.setColorOB("Green");
                    }
                    break;

                case "PEEP":
                    if (SC.getQuantitativeSCValue() > 10) {
                        SC.setColorOB("Yellow");
                    } else
                        SC.setColorOB("Green");

                    break;

                case "RASS":
                    if (SC.getQuantitativeSCValue() >= -1 && SC.getQuantitativeSCValue() <= 1)
                        SC.setColorOB("Green");
                    else if (Math.abs(SC.getQuantitativeSCValue()) == 2)
                        SC.setColorOB("Yellow");
                    else
                        SC.setColorOB("Red");
                    break;

                case "Respiratory rate":
                    if (SC.getQuantitativeSCValue() > 30)
                        SC.setColorOB("Yellow");
                    else
                        SC.setColorOB("Green");
                    break;

                case "Ventricular rate":
                    if (SC.getStableTachy() == true && SC.getQuantitativeSCValue() > 150) {
                        SC.setColorOB("Red");
                    } else if (SC.getStableTachy() == true && SC.getQuantitativeSCValue() >= 120
                            && SC.getQuantitativeSCValue() <= 150) {
                        SC.setColorOB("Yellow");
                    } else if (SC.getStableTachy() == false && SC.getQuantitativeSCValue() < 120) {
                        SC.setColorOB("Green");
                    } else {
                        SC.setColorOB("Yellow");
                    }
                    break;

                case "Endotracheal Tube":
                    SC.setColorOB("Green");
                    break;

                case "Tracheostomy Tube":
                    SC.setColorOB("Green");
                    break;

                case "Mode HFOV":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Red");
                    else
                        SC.setColorOB("Green");
                    break;

                case "Ventilator Dysynchrony":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Yellow");
                    else
                        SC.setColorOB("Green");
                    break;

                case "Nitric Oxide":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Yellow");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Prostacyclin":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Yellow");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Prone Positioning":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Red");
                    else
                        SC.setColorOB("Green");

                    break;

                case "MAP":
                    if (SC.getQuantitativeSCValue() < SafetyCriteriaModel.getMAPIntervalMin()
                            && SC.getMAPCausingSymptoms() == true) {
                        SC.setColorOB("Red");
                    } else if (SC.getQuantitativeSCValue() < SafetyCriteriaModel.getMAPIntervalMin()
                            && SC.getLevelOfMAPSupport().equals("Low") || SC.getLevelOfMAPSupport().equals("Moderate")
                            || SC.getLevelOfMAPSupport().equals("High")) {
                        SC.setColorOB("Red");
                    } else if (SC.getQuantitativeSCValue() >= SafetyCriteriaModel.getMAPIntervalMin()
                            && SC.getLevelOfMAPSupport().equals("Low") || SC.getLevelOfMAPSupport().equals("None")) {
                        SC.setColorOB("Green");
                    } else if (SC.getQuantitativeSCValue() >= SafetyCriteriaModel.getMAPIntervalMin()
                            && SC.getLevelOfMAPSupport().equals("Moderate")) {
                        SC.setColorOB("Yellow");
                    } else if (SC.getQuantitativeSCValue() >= SafetyCriteriaModel.getMAPIntervalMin()
                            && SC.getLevelOfMAPSupport().equals("High")) {
                        SC.setColorOB("Red");
                    } else {
                        SC.setColorOB("Yellow");
                    }
                    break;

                case "Intravenous antihypotensive therapy for hypotensive emergency":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Red");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Known or suspected severepulmonary hypertension":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Yellow");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Requiring pharmacological treatment (e.g. isoprenaline) or awaiting emergency pacemaker insertion":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Red");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Not requiring pharmacological treatment and not awaiting emergency pacemaker insertion":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Yellow");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Dependent Rhythm":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Red");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Stable Underlying Rhythm":
                    SC.setColorOB("Green");

                    break;

                case "Femoral IABP":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Red");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Femoral or subclavian (not single bicaval dual lumen cannulae)":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Red");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Single bicaval dual lumen cannulae insertedinto a central vein":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Yellow");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Ventricular Assist Device":
                    SC.setColorOB("Green");

                    break;

                case "Pulmonary Artery Catheter or other continuous cardiac output monitoring device":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Yellow");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Known or suspected acute DVT/PE":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Yellow");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Known or suspected severe aortic stenosis":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Yellow");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Cardiac ischemia (defined as ongoing chest pain and/or dynamic EKG changes)":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Red");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Delirium tool -ve":
                    SC.setColorOB("Green");

                    break;

                case "Delirium tool +ve and able to follow simple commmands":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Yellow");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Delirium tool +ve and not able to follow simple commmands":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Yellow");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Active management of intracranial hypertension, with ICP not in desired range":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Red");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Intracranial pressure monitoring without activemanagement of intracranial hypertension":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Yellow");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Craniectomy":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Yellow");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Open lumbar drain (not clamped)":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Red");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Subgaleal drain":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Yellow");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Spinal precautions (pre-clearence or fixation)":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Red");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Acute spinal cord injury":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Yellow");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Subarachnoid haemorrhage with unclipped aneurysm":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Yellow");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Vasospasm post-aneurysmal clipping":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Yellow");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Uncontrolled seizures":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Red");
                    else
                        SC.setColorOB("Green");

                    break;

                case "ICUAW":
                    SC.setColorOB("Green");

                    break;

                case "Renal Replacement Therapy":
                    SC.setColorOB("Green");

                    break;

                case "Venous and arterial femoral catheters":
                    SC.setColorOB("Green");

                    break;

                case "Femoral Sheats":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Red");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Other drains and attachements":
                    SC.setColorOB("Green");

                    break;

                case "Known uncontrolled active bleedeing":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Red");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Suspicion of active bleeding or increasedbleeding risk":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Yellow");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Patient is febrile with a temperature exceedingacceptable maximum despite active physicalor pharmacological cooling mangagement":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Yellow");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Active hypothermia management":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Yellow");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Unstable/unstabilized major fracture (Pelvic, spinal, lower limp long bone)":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Red");
                    else
                        SC.setColorOB("Green");

                    break;

                case "Large open wound (Chest/Sternum, abdomen)":
                    if (SC.getQualitativeSCValueBool() == true)
                        SC.setColorOB("Red");
                    else
                        SC.setColorOB("Green");

                    break;
            }
            ColorCategoOB.add(SC);
        }
    }

    // getters og setters

    public static List<SafetyCriteriaModel> getColorCategoIB() {
        return ColorCategoIB;
    }

    public static void setColorCategoIB(List<SafetyCriteriaModel> ColorCategoIB) {
        ColorCategorizationsModel.ColorCategoIB = ColorCategoIB;
    }

    public static List<SafetyCriteriaModel> getColorCategoOB() {
        return ColorCategoOB;
    }

    public static void setColorCategoOB(List<SafetyCriteriaModel> ColorCategoOB) {
        ColorCategorizationsModel.ColorCategoOB = ColorCategoOB;
    }
}