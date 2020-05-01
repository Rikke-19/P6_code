package dk.aau.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dk.aau.TestPerson;
import dk.aau.controller.WarningsCtrl;
import dk.aau.model.person.HealthcarePersonelModel;
import dk.aau.view.WarningsView;

public class SafetyCriteriaModelTest {
    //TestPerson testPerson = new TestPerson("quanti");
    TestPerson testPerson = new TestPerson("quali");
    HealthcarePersonelModel hModel = new HealthcarePersonelModel();
    SafetyCriteriaModel sModel = new SafetyCriteriaModel();
    WarningsView wView = new WarningsView();
    WarningsCtrl wCtrl = new WarningsCtrl(hModel, wView, sModel);
    
    @BeforeClass
    public static void setup() {
        System.out.println("Test begun");
    }
    
    @Before
    public void Before(){
        System.out.println("Component test begun");
    }

    @Test
    public void testMissingTickedQualitative() {
        sModel.checkMissingTickedQualitativeSC(SafetyCriteriaModel.getSC());
        assertFalse(sModel.isMissingTickedQualitativeSC());
    }

    /*
    @Test
    public void testAssesUnrealisticQuantitiveResults(){
        sModel.assessUnrealisticResultsForQuantitativeSC();
        boolean result = sModel.isUnrealistivQuantitativeValue();
        assertFalse(result);
    }*/

    /*
    @Test
    public void testCatchMissingQuantitative() {
        System.out.println("Test missing quantitative");
        sModel.checkMissingResultsForQuantitativeSC(SafetyCriteriaModel.getSC());
        boolean result = sModel.isMissingQuantitativeResult();
        assertTrue(result);
    }
    
    @Test
    public void testMissingMap(){
        boolean result = sModel.checkMissingMAP();
        assertFalse(result);
    }*/
    /*
    @Test
    public void testMissingMapInterval(){
        boolean result = sModel.checkMissingMAPInterval();
        assertFalse(result);
    }*/
    /*
    @Test
    public void testAssesUnrealisticMapInterval(){
        boolean result = sModel.assessUnrealisticMAPInterval();
        assertFalse(result);
    }*/
    /*
    @Test
    public void testFormat_OnlyNumbers() {
        String input = "1234abcd";
        boolean result = input(input, true, false);;
        assertTrue(result);
    }

    @Test
    public void testFormat_OnlyNumbersTrue() {
        String input = "1234";
        boolean result = input(input, true, true);;
        assertTrue(result);
    }
    
    @Test
    public void testFormat_OnlyChar() {
        String input = "aBcD";
        boolean result = input(input, false, false);
        assertTrue(result);
    }
    
    @Test
    public void testFormat_OnlyCharTrue() {
        String input = "yes";
        boolean result = input(input, false, true);
        assertTrue(result);
    }

    @Test
    public void testFormat_OnlySigns() {
        String input = "!?#¤%&.,-_";
        boolean result = input(input, false, false);
        assertTrue(result);
    }
    
    @Test
    public void testFormat_Mixed() {
        String input = "ab12!?";
        boolean result = input(input, false, false);
        assertTrue(result);
    }*/
    
    
    @After
    public void After(){
        System.out.println("Component test completed");
    }
    
    
    @AfterClass
    public static void AfterClass(){
        System.out.println("Full test completed");
    }
        
    
    private boolean input(String iString, boolean isNumber, Boolean expResult) {
        // setup for failure
        boolean succes;
        if (expResult) {
            succes = !expResult;
        } else{
            succes = !expResult;
        }
        
        // test for exp number
        if (iString.equals("Exit") || iString.equals("exit") && isNumber) {
            succes = true;
        } else if (isNumber) {
            boolean var;
            try {
                var = Double.isNaN(Double.parseDouble(iString));
                System.out.println(var);
                succes = true;
            } catch (Exception e) {
                succes = false;
            }
        }
        
        // test for NaN
        if (iString.equals("exit") || iString.equals("Exit") && !isNumber) {
            succes = true;
        } else if (iString.equals("yes") || iString.equals("Yes") && !isNumber) {
            succes = true;
        } else if (iString.equals("no") || iString.equals("No") && !isNumber) {
            succes = true;
        } else if (!isNumber) {
            succes = false;
        }
        
        // succes criteria based on the assertTrue in the test
        if (expResult) {
            return succes;
        } else
            return !succes;
            
        
    }
    
}