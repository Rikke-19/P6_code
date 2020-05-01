package dk.aau.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
    TestPerson testPerson = new TestPerson("quanti");
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
        
    /*
        @param result returns true is there is missing quantitative values
    */
    @Test
    public void testCatchMissingQuantitative() {
        System.out.println("Test missing quantitative");
        sModel.checkMissingResultsForQuantitativeSC(SafetyCriteriaModel.getSC());
        boolean result = sModel.isMissingQuantitativeResult();
        assertTrue(result);
    }

    /*
        @param result is true if there is a missing value
    */
    @Test
    public void testMissingMap(){
        boolean result = sModel.checkMissingMAP();
        assertFalse(result);
    }
    /*
        @param result is true if there is a missing value
    */
    @Test
    public void testMissingMapInterval(){
        boolean result = sModel.checkMissingMAPInterval();
        assertFalse(result);
    }
    /*
        @param result is true if there is a missing value
    */
    @Test
    public void testAssesUnrealisticMapInterval(){
        boolean result = sModel.assessUnrealisticMAPInterval();
        assertFalse(result);
    }


    @After
    public void After(){
        System.out.println("Component test completed");
    }


    @AfterClass
    public static void AfterClass(){
        System.out.println("Full test completed");
    }
}
    


// int counter = 0;
        // while (wCtrl.CheckValues()) {
        //     if (counter >= 3) {
        //         fail();
        //         break;
        //     }
        //     counter++;
        // }