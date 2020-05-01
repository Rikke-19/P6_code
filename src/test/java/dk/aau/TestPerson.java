package dk.aau;

import dk.aau.model.SafetyCriteriaModel;

public class TestPerson {
    
    public TestPerson(String s)
    {
        if (s.equals("quali")) {
            InitQualitativeSafetyCriteria();
        } else if (s.equals("quanti")) {
            InitQuantitativeSafetyCriteria();
            GiveValuesQuantitative();
        } else if (s.equals("all")) {
            InitQualitativeSafetyCriteria();
            InitQuantitativeSafetyCriteria();
            GiveValuesQuantitative();
        }        
    }

    private void GiveValuesQuantitative()
    {
        for (SafetyCriteriaModel s : SafetyCriteriaModel.getSC()){
            if (s.getName().equals("Laktat")) {
                s.setRecievedValue(true);
                s.setQuantitativeSCValue(2);
            } else if (s.getName().equals("FiO2")) {
                s.setRecievedValue(true);
                s.setQuantitativeSCValue(0.8);
            } else if (s.getName().equals("PEEP")) {
                s.setRecievedValue(false);
                s.setQuantitativeSCValue(0);
            } else if (s.getName().equals("RASS")) {
                s.setRecievedValue(true);
                s.setQuantitativeSCValue(2);
            } else if (s.getName().equals("Respiratory rate")) {
                s.setRecievedValue(true);
                s.setQuantitativeSCValue(30);
            } else if (s.getName().equals("SaO2")) {
                s.setRecievedValue(true);
                s.setQuantitativeSCValue(87);
            } else if (s.getName().equals("Ventricular rate")) {
                s.setRecievedValue(false);
                s.setStableTachy(false);
                s.setQuantitativeSCValue(0);
            } else if (s.getName().equals("MAP")) {
                s.setRecievedValue(true);
                s.setMAPCausingSymptoms(false);
                s.setMAPIntervalMin(80);
                s.setMAPIntervalMax(120);
                s.setLevelOfMAPSupport("none");
                s.setQuantitativeSCValue(97);
            } 
        }
    }


    
    private void InitQuantitativeSafetyCriteria()
    {
        SafetyCriteriaModel a = new SafetyCriteriaModel("Laktat", "", true);
        SafetyCriteriaModel.AddToListSC(a);
        SafetyCriteriaModel b = new SafetyCriteriaModel("FiO2", "", true);
        SafetyCriteriaModel.AddToListSC(b);
        SafetyCriteriaModel c = new SafetyCriteriaModel("PEEP", "", true);
        SafetyCriteriaModel.AddToListSC(c);
        SafetyCriteriaModel d = new SafetyCriteriaModel("RASS", "", true);
        SafetyCriteriaModel.AddToListSC(d);
        SafetyCriteriaModel e = new SafetyCriteriaModel("Respiratory rate", "", true);
        SafetyCriteriaModel.AddToListSC(e);
        SafetyCriteriaModel f = new SafetyCriteriaModel("SaO2", "", true);
        SafetyCriteriaModel.AddToListSC(f);
        SafetyCriteriaModel g = new SafetyCriteriaModel("Ventricular rate", "", true);
        SafetyCriteriaModel.AddToListSC(g);
        SafetyCriteriaModel o = new SafetyCriteriaModel("MAP", "", true);
        SafetyCriteriaModel.AddToListSC(o);
    }
    
    private void InitQualitativeSafetyCriteria(){
        SafetyCriteriaModel h = new SafetyCriteriaModel("Endotracheal Tube", "");
        SafetyCriteriaModel.AddToListSC(h);
        SafetyCriteriaModel i = new SafetyCriteriaModel("Tracheostomy Tube", "");
        SafetyCriteriaModel.AddToListSC(i);
        SafetyCriteriaModel j = new SafetyCriteriaModel("Mode HFOV", "");
        SafetyCriteriaModel.AddToListSC(j);
        SafetyCriteriaModel k = new SafetyCriteriaModel("Ventilator Dysynchronyv", "");
        SafetyCriteriaModel.AddToListSC(k);
        SafetyCriteriaModel l = new SafetyCriteriaModel("Nitric Oxide", "");
        SafetyCriteriaModel.AddToListSC(l);
        SafetyCriteriaModel m = new SafetyCriteriaModel("Prostacyclin", "");
        SafetyCriteriaModel.AddToListSC(m);
        SafetyCriteriaModel n = new SafetyCriteriaModel("Prone Positioning", "");
        SafetyCriteriaModel.AddToListSC(n);        
        SafetyCriteriaModel p = new SafetyCriteriaModel("Intravenous antihypotensive therapy for hypotensive emergency", "");
        SafetyCriteriaModel.AddToListSC(p);
        SafetyCriteriaModel q = new SafetyCriteriaModel("Known or suspected severepulmonary hypertension", "");
        SafetyCriteriaModel.AddToListSC(q);
        SafetyCriteriaModel r = new SafetyCriteriaModel("Requiring pharmacological treatment (e.g. isoprenaline) or awaiting emergency pacemaker insertion", "");
        SafetyCriteriaModel.AddToListSC(r);
        SafetyCriteriaModel s = new SafetyCriteriaModel("Not requiring pharmacological treatment and not awaiting emergency pacemaker insertion", "");
        SafetyCriteriaModel.AddToListSC(s);
        SafetyCriteriaModel t = new SafetyCriteriaModel("Dependent Rhythm", "");
        SafetyCriteriaModel.AddToListSC(t);
        SafetyCriteriaModel u = new SafetyCriteriaModel("Stable Underlying Rhythm", "");
        SafetyCriteriaModel.AddToListSC(u);
        SafetyCriteriaModel aa = new SafetyCriteriaModel("Femoral IABP", "");
        SafetyCriteriaModel.AddToListSC(aa);
        SafetyCriteriaModel ab = new SafetyCriteriaModel("Femoral or subclavian (not single bicaval dual lumen cannulae)", "");
        SafetyCriteriaModel.AddToListSC(ab);
        SafetyCriteriaModel ac = new SafetyCriteriaModel("Single bicaval dual lumen cannulae insertedinto a central vein", "");
        SafetyCriteriaModel.AddToListSC(ac);
        SafetyCriteriaModel ad = new SafetyCriteriaModel("Ventricular Assist Device", "");
        SafetyCriteriaModel.AddToListSC(ad);
        SafetyCriteriaModel ae = new SafetyCriteriaModel("Pulmonary Artery Catheter or other continuous cardiac output monitoring device", "");
        SafetyCriteriaModel.AddToListSC(ae);
        SafetyCriteriaModel af = new SafetyCriteriaModel("Known or suspected acute DVT/PE", "");
        SafetyCriteriaModel.AddToListSC(af);
        SafetyCriteriaModel ag = new SafetyCriteriaModel("Known or suspected severe aortic stenosis", "");
        SafetyCriteriaModel.AddToListSC(ag);
        SafetyCriteriaModel ah = new SafetyCriteriaModel("Cardiac ischemia (defined as ongoing chest pain and/or dynamic EKG changes)", "");
        SafetyCriteriaModel.AddToListSC(ah);
        SafetyCriteriaModel ai = new SafetyCriteriaModel("Delirum tool -ve", "");
        SafetyCriteriaModel.AddToListSC(ai);
        SafetyCriteriaModel aj = new SafetyCriteriaModel("Delirium tool +ve and able to follow simple commmands", "");
        SafetyCriteriaModel.AddToListSC(aj);
        SafetyCriteriaModel ak = new SafetyCriteriaModel("Delirium tool +ve and not able to follow simple commmands", "");
        SafetyCriteriaModel.AddToListSC(ak);
        SafetyCriteriaModel al = new SafetyCriteriaModel("Active management of intracranial hypertension, with ICP not in desired range", "");
        SafetyCriteriaModel.AddToListSC(al);
        SafetyCriteriaModel am = new SafetyCriteriaModel("Intracranial pressure monitoring without activemanagement of intracranial hypertension", "");
        SafetyCriteriaModel.AddToListSC(am);
        SafetyCriteriaModel an = new SafetyCriteriaModel("Craniectomy", "");
        SafetyCriteriaModel.AddToListSC(an);
        SafetyCriteriaModel ao = new SafetyCriteriaModel("Open lumbar drain (not clamped)", "");
        SafetyCriteriaModel.AddToListSC(ao);
        SafetyCriteriaModel ap = new SafetyCriteriaModel("Subgaleal drain", "");
        SafetyCriteriaModel.AddToListSC(ap);
        SafetyCriteriaModel aq = new SafetyCriteriaModel("Spinal precautions (pre-clearence or fixation)", "");
        SafetyCriteriaModel.AddToListSC(aq);
        SafetyCriteriaModel ar = new SafetyCriteriaModel("Acute spinal cord injury", "");
        SafetyCriteriaModel.AddToListSC(ar);
        SafetyCriteriaModel as = new SafetyCriteriaModel("Subarachnoid haemorrhage with unclipped aneurysm", "");
        SafetyCriteriaModel.AddToListSC(as);
        SafetyCriteriaModel at = new SafetyCriteriaModel("Vasospasm post-aneurysmal clipping", "");
        SafetyCriteriaModel.AddToListSC(at);
        SafetyCriteriaModel au = new SafetyCriteriaModel("Uncontrolled seizures", "");
        SafetyCriteriaModel.AddToListSC(au);
        SafetyCriteriaModel ba = new SafetyCriteriaModel("ICUAW", "");
        SafetyCriteriaModel.AddToListSC(ba);
        SafetyCriteriaModel bb = new SafetyCriteriaModel("Renal Replacement Therapy", "");
        SafetyCriteriaModel.AddToListSC(bb);
        SafetyCriteriaModel bc = new SafetyCriteriaModel("Venous and arterial femoral catheters", "");
        SafetyCriteriaModel.AddToListSC(bc);
        SafetyCriteriaModel bd = new SafetyCriteriaModel("Femoral Sheats", "");
        SafetyCriteriaModel.AddToListSC(bd);
        SafetyCriteriaModel bf = new SafetyCriteriaModel("Other drains and attachements", "");
        SafetyCriteriaModel.AddToListSC(bf);
        SafetyCriteriaModel bg = new SafetyCriteriaModel("Known uncontrolled active bleedeing", "");
        SafetyCriteriaModel.AddToListSC(bg);
        SafetyCriteriaModel bh = new SafetyCriteriaModel("Suspicion of active bleeding or increasedbleeding risk", "");
        SafetyCriteriaModel.AddToListSC(bh);
        SafetyCriteriaModel bi = new SafetyCriteriaModel("Patient is febrile with a temperature exceedingacceptable maximum despite active physicalor pharmacological cooling mangagement", "");
        SafetyCriteriaModel.AddToListSC(bi);
        SafetyCriteriaModel bj = new SafetyCriteriaModel("Active hypothermia management", "");
        SafetyCriteriaModel.AddToListSC(bj);
        SafetyCriteriaModel bk = new SafetyCriteriaModel("Unstable/unstabilized major fracture (Pelvic, spinal, lower limp long bone)", "");
        SafetyCriteriaModel.AddToListSC(bk); 
        SafetyCriteriaModel bl = new SafetyCriteriaModel("Large open wound (Chest/Sternum, abdomen)", "");
        SafetyCriteriaModel.AddToListSC(bl);
    }
    
}
