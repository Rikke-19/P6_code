package dk.aau;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import dk.aau.model.SafetyCriteriaModel;

public class Init {
    
    public static void InitSafetyCriteria() {
    //Sikkerhedskriterier instantieres
    //Kvantitative
    SafetyCriteriaModel laktat = new SafetyCriteriaModel("Laktat", "Cardiovascular", true);
    SafetyCriteriaModel.AddToListSc(laktat);
    SafetyCriteriaModel fiO2 = new SafetyCriteriaModel("FiO2", "Respiratory", true);
    SafetyCriteriaModel.AddToListSc(fiO2);
    SafetyCriteriaModel peep = new SafetyCriteriaModel("PEEP", "Respiratory", true);
    SafetyCriteriaModel.AddToListSc(peep);
    SafetyCriteriaModel rass = new SafetyCriteriaModel("RASS", "Neuro", true);
    SafetyCriteriaModel.AddToListSc(rass);
    SafetyCriteriaModel respRate = new SafetyCriteriaModel("Respiratory rate", "Respiratory", true);
    SafetyCriteriaModel.AddToListSc(respRate);
    SafetyCriteriaModel saO2 = new SafetyCriteriaModel("SaO2", "Respiratory", true);
    SafetyCriteriaModel.AddToListSc(saO2);
    SafetyCriteriaModel ventriRate = new SafetyCriteriaModel("Ventricular rate", "Cardiovascular", true);
    SafetyCriteriaModel.AddToListSc(ventriRate);
    //Kvalitative
    //Respiratory
    SafetyCriteriaModel endotrachealTube = new SafetyCriteriaModel("Endotracheal Tube", "Respiratory");
    SafetyCriteriaModel.AddToListSc(endotrachealTube);
    SafetyCriteriaModel tracheostomytube = new SafetyCriteriaModel("Tracheostomy Tube", "Respiratory");
    SafetyCriteriaModel.AddToListSc(tracheostomytube);
    SafetyCriteriaModel modeHFOV = new SafetyCriteriaModel("Mode HFOV", "Respiratory");
    SafetyCriteriaModel.AddToListSc(modeHFOV);
    SafetyCriteriaModel ventilatorDysynchrony = new SafetyCriteriaModel("Ventilator Dysynchrony", "Respiratory");
    SafetyCriteriaModel.AddToListSc(ventilatorDysynchrony);
    SafetyCriteriaModel nitricOxide = new SafetyCriteriaModel("Nitric Oxide", "Respiratory");
    SafetyCriteriaModel.AddToListSc(nitricOxide);
    SafetyCriteriaModel prostacyclin = new SafetyCriteriaModel("Prostacyclin", "Respiratory");
    SafetyCriteriaModel.AddToListSc(prostacyclin);
    SafetyCriteriaModel pronePositioning = new SafetyCriteriaModel("Prone Positioning", "Respiratory");
    SafetyCriteriaModel.AddToListSc(pronePositioning);
    
    //Cardiovascular
    
    SafetyCriteriaModel stableTachyarrhythmia = new SafetyCriteriaModel("Any stable tachyarrhythmia", "Cardiovascular");
    SafetyCriteriaModel.AddToListSc(stableTachyarrhythmia);
    SafetyCriteriaModel mapCausingSymptoms = new SafetyCriteriaModel("Is MAP causing symptoms", "Cardiovascular");
    SafetyCriteriaModel.AddToListSc(mapCausingSymptoms);
    SafetyCriteriaModel mapLevelOfSupport = new SafetyCriteriaModel("MAP level of support", "Cardiovascular");
    SafetyCriteriaModel.AddToListSc(mapLevelOfSupport);
    SafetyCriteriaModel intravenousAntihypotensive = new SafetyCriteriaModel("Intravenous antihypotensive therapy for hypotensive emergency", "Cardiovascular");
    SafetyCriteriaModel.AddToListSc(intravenousAntihypotensive);
    SafetyCriteriaModel severepulmonaryHypertension = new SafetyCriteriaModel("Known or suspected severepulmonary hypertension", "Cardiovascular");
    SafetyCriteriaModel.AddToListSc(severepulmonaryHypertension);
    SafetyCriteriaModel bradycardiaReq = new SafetyCriteriaModel("Requiring pharmacological treatment (e.g. isoprenaline) or awaiting emergency pacemaker insertion", "Cardiovascular");
    SafetyCriteriaModel.AddToListSc(bradycardiaReq);
    SafetyCriteriaModel bradycardiaNotReq = new SafetyCriteriaModel("Not requiring pharmacological treatment and not awaiting emergency pacemaker insertion", "Cardiovascular");
    SafetyCriteriaModel.AddToListSc(bradycardiaNotReq);
    SafetyCriteriaModel dependentRhythm = new SafetyCriteriaModel("Dependent Rhythm", "Cardiovascular");
    SafetyCriteriaModel.AddToListSc(dependentRhythm);
    SafetyCriteriaModel stableUnderlyingRhythm = new SafetyCriteriaModel("Stable Underlying Rhythm", "Cardiovascular");
    SafetyCriteriaModel.AddToListSc(stableUnderlyingRhythm);
    SafetyCriteriaModel femoralIABP = new SafetyCriteriaModel("Femoral IABP", "Cardiovascular");
    SafetyCriteriaModel.AddToListSc(femoralIABP);
    SafetyCriteriaModel ecmoFemoralSubclavian = new SafetyCriteriaModel("Femoral or subclavian (not single bicaval dual lumen cannulae)", "Cardiovascular");
    SafetyCriteriaModel.AddToListSc(ecmoFemoralSubclavian);
    SafetyCriteriaModel ecmoSingleBicavalDualLumen = new SafetyCriteriaModel("Single bicaval dual lumen cannulae insertedinto a central vein", "Cardiovascular");
    SafetyCriteriaModel.AddToListSc(ecmoSingleBicavalDualLumen);
    SafetyCriteriaModel ventricularAssist = new SafetyCriteriaModel("Ventricular Assist Device", "Cardiovascular");
    SafetyCriteriaModel.AddToListSc(ventricularAssist);
    SafetyCriteriaModel pulmonaryArteryCatheter = new SafetyCriteriaModel("Pulmonary Artery Catheter or other continuous cardiac output monitoring device", "Cardiovascular");
    SafetyCriteriaModel.AddToListSc(pulmonaryArteryCatheter);
    SafetyCriteriaModel acuteDVT = new SafetyCriteriaModel("Known or suspected acute DVT/PE", "Cardiovascular");
    SafetyCriteriaModel.AddToListSc(acuteDVT);
    SafetyCriteriaModel severeAorticStenosis = new SafetyCriteriaModel("Known or suspected severe aortic stenosis", "Cardiovascular");
    SafetyCriteriaModel.AddToListSc(severeAorticStenosis);
    SafetyCriteriaModel cardiacischemia = new SafetyCriteriaModel("Cardiac ischemia (defined as ongoing chest pain and/or dynamic EKG changes)", "Cardiovascular");
    SafetyCriteriaModel.AddToListSc(cardiacischemia);
    SafetyCriteriaModel map = new SafetyCriteriaModel("MAP", "Cardiovascular", true);
    SafetyCriteriaModel.AddToListSc(map);
    
    // neurological
    
    SafetyCriteriaModel deltool = new SafetyCriteriaModel("Delirum tool -ve", "Neuro");
    SafetyCriteriaModel.AddToListSc(deltool);
    SafetyCriteriaModel deltoolcommands = new SafetyCriteriaModel("Delirium tool +ve and able to follow simple commmands", "Neuro");
    SafetyCriteriaModel.AddToListSc(deltoolcommands);
    SafetyCriteriaModel deltoolnocommands = new SafetyCriteriaModel("Delirium tool +ve and not able to follow simple commmands", "Neuro");
    SafetyCriteriaModel.AddToListSc(deltoolnocommands);
    SafetyCriteriaModel intercranialhypotenstion = new SafetyCriteriaModel("Active management of intracranial hypertension, with ICP not in desired range", "Neuro");
    SafetyCriteriaModel.AddToListSc(intercranialhypotenstion);
    SafetyCriteriaModel intercranialpressure = new SafetyCriteriaModel("Intracranial pressure monitoring without activemanagement of intracranial hypertension", "Neuro");
    SafetyCriteriaModel.AddToListSc(intercranialpressure);
    SafetyCriteriaModel craniectomy = new SafetyCriteriaModel("Craniectomy", "Neuro");
    SafetyCriteriaModel.AddToListSc(craniectomy);
    SafetyCriteriaModel openlumbar = new SafetyCriteriaModel("Open lumbar drain (not clamped)", "Neuro");
    SafetyCriteriaModel.AddToListSc(openlumbar);
    SafetyCriteriaModel subgalealdrain = new SafetyCriteriaModel("Subgaleal drain", "Neuro");
    SafetyCriteriaModel.AddToListSc(subgalealdrain);
    SafetyCriteriaModel spinalprecautions = new SafetyCriteriaModel("Spinal precautions (pre-clearence or fixation)", "Neuro");
    SafetyCriteriaModel.AddToListSc(spinalprecautions);
    SafetyCriteriaModel asci = new SafetyCriteriaModel("Acute spinal cord injury", "Neuro");
    SafetyCriteriaModel.AddToListSc(asci);
    SafetyCriteriaModel subaracheamorrhage = new SafetyCriteriaModel("Subarachnoid haemorrhage with unclipped aneurysm", "Neuro");
    SafetyCriteriaModel.AddToListSc(subaracheamorrhage);
    SafetyCriteriaModel vasospasm = new SafetyCriteriaModel("Vasospasm post-aneurysmal clipping", "Neuro");
    SafetyCriteriaModel.AddToListSc(vasospasm);
    SafetyCriteriaModel seizures = new SafetyCriteriaModel("Uncontrolled seizures", "Neuro");
    SafetyCriteriaModel.AddToListSc(seizures);
    // others
    SafetyCriteriaModel icuaw = new SafetyCriteriaModel("ICUAW", "Other");
    SafetyCriteriaModel.AddToListSc(icuaw);
    SafetyCriteriaModel renalreptherapy = new SafetyCriteriaModel("Renal Replacement Therapy", "Other");
    SafetyCriteriaModel.AddToListSc(renalreptherapy);
    SafetyCriteriaModel femroalcath = new SafetyCriteriaModel("Venous and arterial femoral catheters", "Other");
    SafetyCriteriaModel.AddToListSc(femroalcath);
    SafetyCriteriaModel remoralsheaths = new SafetyCriteriaModel("Femoral Sheats", "Other");
    SafetyCriteriaModel.AddToListSc(remoralsheaths);
    SafetyCriteriaModel otherdrains = new SafetyCriteriaModel("Other drains and attachements", "Other");
    SafetyCriteriaModel.AddToListSc(otherdrains);
    SafetyCriteriaModel uncontrolledbleeding = new SafetyCriteriaModel("Known uncontrolled active bleedeing", "Other");
    SafetyCriteriaModel.AddToListSc(uncontrolledbleeding);
    SafetyCriteriaModel suspbleeding = new SafetyCriteriaModel("Suspicion of active bleeding or increasedbleeding risk", "Other");
    SafetyCriteriaModel.AddToListSc(suspbleeding);
    SafetyCriteriaModel febrilewtemp = new SafetyCriteriaModel("Patient is febrile with a temperature exceedingacceptable maximum despite active physicalor pharmacological cooling mangagement", "Other");
    SafetyCriteriaModel.AddToListSc(febrilewtemp);
    SafetyCriteriaModel acticehypomanagement = new SafetyCriteriaModel("Active hypothermia management", "Other");
    SafetyCriteriaModel.AddToListSc(acticehypomanagement);
    SafetyCriteriaModel unstable = new SafetyCriteriaModel("Unstable/unstabilized major fracture (Pelvic, spinal, lower limp long bone)", "Other");
    SafetyCriteriaModel.AddToListSc(unstable);
    SafetyCriteriaModel openwound = new SafetyCriteriaModel("Large open wound (Chest/Sternum, abdomen)", "Other");
    SafetyCriteriaModel.AddToListSc(openwound);     
}

}