package dk.aau;

import dk.aau.model.SafetyCriteriaModel;

public class Init {
    
    public static void InitSafetyCriteria() {
    //Sikkerhedskriterier instantieres
    
    // ------Kvantitative----------

    SafetyCriteriaModel laktat = new SafetyCriteriaModel("Laktat", "Cardiovascular", true);
    SafetyCriteriaModel.AddToListSC(laktat);
    SafetyCriteriaModel fiO2 = new SafetyCriteriaModel("FiO2", "Respiratory", true);
    SafetyCriteriaModel.AddToListSC(fiO2);
    SafetyCriteriaModel peep = new SafetyCriteriaModel("PEEP", "Respiratory", true);
    SafetyCriteriaModel.AddToListSC(peep);
    SafetyCriteriaModel rass = new SafetyCriteriaModel("RASS", "Neuro", true);
    SafetyCriteriaModel.AddToListSC(rass);
    SafetyCriteriaModel respRate = new SafetyCriteriaModel("Respiratory rate", "Respiratory", true);
    SafetyCriteriaModel.AddToListSC(respRate);
    SafetyCriteriaModel saO2 = new SafetyCriteriaModel("SaO2", "Respiratory", true);
    SafetyCriteriaModel.AddToListSC(saO2);
    SafetyCriteriaModel ventriRate = new SafetyCriteriaModel("Ventricular rate", "Cardiovascular", true);
    SafetyCriteriaModel.AddToListSC(ventriRate);
    
    // -------Kvalitative--------------
    
    // Respiratory

    SafetyCriteriaModel endotrachealTube = new SafetyCriteriaModel("Endotracheal Tube", "Respiratory");
    SafetyCriteriaModel.AddToListSC(endotrachealTube);
    SafetyCriteriaModel tracheostomytube = new SafetyCriteriaModel("Tracheostomy Tube", "Respiratory");
    SafetyCriteriaModel.AddToListSC(tracheostomytube);
    SafetyCriteriaModel modeHFOV = new SafetyCriteriaModel("Mode HFOV", "Respiratory");
    SafetyCriteriaModel.AddToListSC(modeHFOV);
    SafetyCriteriaModel ventilatorDysynchrony = new SafetyCriteriaModel("Ventilator Dysynchrony", "Respiratory");
    SafetyCriteriaModel.AddToListSC(ventilatorDysynchrony);
    SafetyCriteriaModel nitricOxide = new SafetyCriteriaModel("Nitric Oxide", "Respiratory");
    SafetyCriteriaModel.AddToListSC(nitricOxide);
    SafetyCriteriaModel prostacyclin = new SafetyCriteriaModel("Prostacyclin", "Respiratory");
    SafetyCriteriaModel.AddToListSC(prostacyclin);
    SafetyCriteriaModel pronePositioning = new SafetyCriteriaModel("Prone Positioning", "Respiratory");
    SafetyCriteriaModel.AddToListSC(pronePositioning);

    // Cardiovascular

    SafetyCriteriaModel map = new SafetyCriteriaModel("MAP", "Cardiovascular", true);
    SafetyCriteriaModel.AddToListSC(map);
    SafetyCriteriaModel intravenousAntihypotensive = new SafetyCriteriaModel(
            "Intravenous antihypotensive therapy for hypotensive emergency", "Cardiovascular");
    SafetyCriteriaModel.AddToListSC(intravenousAntihypotensive);
    SafetyCriteriaModel severepulmonaryHypertension = new SafetyCriteriaModel(
            "Known or suspected severepulmonary hypertension", "Cardiovascular");
    SafetyCriteriaModel.AddToListSC(severepulmonaryHypertension);
    SafetyCriteriaModel bradycardiaReq = new SafetyCriteriaModel(
            "Requiring pharmacological treatment (e.g. isoprenaline) or awaiting emergency pacemaker insertion",
            "Cardiovascular");
    SafetyCriteriaModel.AddToListSC(bradycardiaReq);
    SafetyCriteriaModel bradycardiaNotReq = new SafetyCriteriaModel(
            "Not requiring pharmacological treatment and not awaiting emergency pacemaker insertion", "Cardiovascular");
    SafetyCriteriaModel.AddToListSC(bradycardiaNotReq);
    SafetyCriteriaModel dependentRhythm = new SafetyCriteriaModel("Dependent Rhythm", "Cardiovascular");
    SafetyCriteriaModel.AddToListSC(dependentRhythm);
    SafetyCriteriaModel stableUnderlyingRhythm = new SafetyCriteriaModel("Stable Underlying Rhythm", "Cardiovascular");
    SafetyCriteriaModel.AddToListSC(stableUnderlyingRhythm);
    SafetyCriteriaModel femoralIABP = new SafetyCriteriaModel("Femoral IABP", "Cardiovascular");
    SafetyCriteriaModel.AddToListSC(femoralIABP);
    SafetyCriteriaModel ecmoFemoralSubclavian = new SafetyCriteriaModel(
            "Femoral or subclavian (not single bicaval dual lumen cannulae)", "Cardiovascular");
    SafetyCriteriaModel.AddToListSC(ecmoFemoralSubclavian);
    SafetyCriteriaModel ecmoSingleBicavalDualLumen = new SafetyCriteriaModel(
            "Single bicaval dual lumen cannulae insertedinto a central vein", "Cardiovascular");
    SafetyCriteriaModel.AddToListSC(ecmoSingleBicavalDualLumen);
    SafetyCriteriaModel ventricularAssist = new SafetyCriteriaModel("Ventricular Assist Device", "Cardiovascular");
    SafetyCriteriaModel.AddToListSC(ventricularAssist);
    SafetyCriteriaModel pulmonaryArteryCatheter = new SafetyCriteriaModel(
            "Pulmonary Artery Catheter or other continuous cardiac output monitoring device", "Cardiovascular");
    SafetyCriteriaModel.AddToListSC(pulmonaryArteryCatheter);
    SafetyCriteriaModel acuteDVT = new SafetyCriteriaModel("Known or suspected acute DVT/PE", "Cardiovascular");
    SafetyCriteriaModel.AddToListSC(acuteDVT);
    SafetyCriteriaModel severeAorticStenosis = new SafetyCriteriaModel("Known or suspected severe aortic stenosis",
            "Cardiovascular");
    SafetyCriteriaModel.AddToListSC(severeAorticStenosis);
    SafetyCriteriaModel cardiacischemia = new SafetyCriteriaModel(
            "Cardiac ischemia (defined as ongoing chest pain and/or dynamic EKG changes)", "Cardiovascular");
    SafetyCriteriaModel.AddToListSC(cardiacischemia);
    
    // Neurological

    SafetyCriteriaModel deltool = new SafetyCriteriaModel("Delirum tool -ve", "Neuro");
    SafetyCriteriaModel.AddToListSC(deltool);
    SafetyCriteriaModel deltoolcommands = new SafetyCriteriaModel(
            "Delirium tool +ve and able to follow simple commmands", "Neuro");
    SafetyCriteriaModel.AddToListSC(deltoolcommands);
    SafetyCriteriaModel deltoolnocommands = new SafetyCriteriaModel(
            "Delirium tool +ve and not able to follow simple commmands", "Neuro");
    SafetyCriteriaModel.AddToListSC(deltoolnocommands);
    SafetyCriteriaModel intercranialhypotenstion = new SafetyCriteriaModel(
            "Active management of intracranial hypertension, with ICP not in desired range", "Neuro");
    SafetyCriteriaModel.AddToListSC(intercranialhypotenstion);
    SafetyCriteriaModel intercranialpressure = new SafetyCriteriaModel(
            "Intracranial pressure monitoring without activemanagement of intracranial hypertension", "Neuro");
    SafetyCriteriaModel.AddToListSC(intercranialpressure);
    SafetyCriteriaModel craniectomy = new SafetyCriteriaModel("Craniectomy", "Neuro");
    SafetyCriteriaModel.AddToListSC(craniectomy);
    SafetyCriteriaModel openlumbar = new SafetyCriteriaModel("Open lumbar drain (not clamped)", "Neuro");
    SafetyCriteriaModel.AddToListSC(openlumbar);
    SafetyCriteriaModel subgalealdrain = new SafetyCriteriaModel("Subgaleal drain", "Neuro");
    SafetyCriteriaModel.AddToListSC(subgalealdrain);
    SafetyCriteriaModel spinalprecautions = new SafetyCriteriaModel("Spinal precautions (pre-clearence or fixation)",
            "Neuro");
    SafetyCriteriaModel.AddToListSC(spinalprecautions);
    SafetyCriteriaModel asci = new SafetyCriteriaModel("Acute spinal cord injury", "Neuro");
    SafetyCriteriaModel.AddToListSC(asci);
    SafetyCriteriaModel subaracheamorrhage = new SafetyCriteriaModel("Subarachnoid haemorrhage with unclipped aneurysm",
            "Neuro");
    SafetyCriteriaModel.AddToListSC(subaracheamorrhage);
    SafetyCriteriaModel vasospasm = new SafetyCriteriaModel("Vasospasm post-aneurysmal clipping", "Neuro");
    SafetyCriteriaModel.AddToListSC(vasospasm);
    SafetyCriteriaModel seizures = new SafetyCriteriaModel("Uncontrolled seizures", "Neuro");
    SafetyCriteriaModel.AddToListSC(seizures);
    // others
    SafetyCriteriaModel icuaw = new SafetyCriteriaModel("ICUAW", "Other");
    SafetyCriteriaModel.AddToListSC(icuaw);
    SafetyCriteriaModel renalreptherapy = new SafetyCriteriaModel("Renal Replacement Therapy", "Other");
    SafetyCriteriaModel.AddToListSC(renalreptherapy);
    SafetyCriteriaModel femroalcath = new SafetyCriteriaModel("Venous and arterial femoral catheters", "Other");
    SafetyCriteriaModel.AddToListSC(femroalcath);
    SafetyCriteriaModel remoralsheaths = new SafetyCriteriaModel("Femoral Sheats", "Other");
    SafetyCriteriaModel.AddToListSC(remoralsheaths);
    SafetyCriteriaModel otherdrains = new SafetyCriteriaModel("Other drains and attachements", "Other");
    SafetyCriteriaModel.AddToListSC(otherdrains);
    SafetyCriteriaModel uncontrolledbleeding = new SafetyCriteriaModel("Known uncontrolled active bleedeing", "Other");
    SafetyCriteriaModel.AddToListSC(uncontrolledbleeding);
    SafetyCriteriaModel suspbleeding = new SafetyCriteriaModel("Suspicion of active bleeding or increasedbleeding risk",
            "Other");
    SafetyCriteriaModel.AddToListSC(suspbleeding);
    SafetyCriteriaModel febrilewtemp = new SafetyCriteriaModel(
            "Patient is febrile with a temperature exceedingacceptable maximum despite active physicalor pharmacological cooling mangagement",
            "Other");
    SafetyCriteriaModel.AddToListSC(febrilewtemp);
    SafetyCriteriaModel acticehypomanagement = new SafetyCriteriaModel("Active hypothermia management", "Other");
    SafetyCriteriaModel.AddToListSC(acticehypomanagement);
    SafetyCriteriaModel unstable = new SafetyCriteriaModel(
            "Unstable/unstabilized major fracture (Pelvic, spinal, lower limp long bone)", "Other");
    SafetyCriteriaModel.AddToListSC(unstable);
    SafetyCriteriaModel openwound = new SafetyCriteriaModel("Large open wound (Chest/Sternum, abdomen)", "Other");
    SafetyCriteriaModel.AddToListSC(openwound);
}

}