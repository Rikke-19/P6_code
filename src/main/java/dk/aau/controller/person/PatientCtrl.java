package dk.aau.controller.person;

import dk.aau.model.person.PatientModel;
import dk.aau.view.person.PatientView;

public class PatientCtrl {
    PatientModel pModel;
    PatientView pView;

    public PatientCtrl(PatientModel pModel, PatientView pView)
    {
        this.pModel = pModel;
        this.pView = pView;
    }

    //Metoder
    private long getCPRNumber() {
        return 0;
    }
}