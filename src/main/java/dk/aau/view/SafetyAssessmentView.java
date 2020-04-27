package dk.aau.view;

public class SafetyAssessmentView {
    private static String EMCategorizationIB;
    private static String EMCategorizationOB;

    // Getters and setters
    public static String getEMCategorizationIB() {
        return EMCategorizationIB;
    }

    public static void setEMCategorizationIB(String eMCategorizationIB) {
        SafetyAssessmentView.EMCategorizationIB = eMCategorizationIB;
    }

    public static String getEMCategorizationOB() {
        return EMCategorizationOB;
    }

    public static void setEMCategorizationOB(String eMCategorizationOB) {
        SafetyAssessmentView.EMCategorizationOB = eMCategorizationOB;
    }

}