/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualzoo.cell.facility;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class FacilityTest {
    
    public FacilityTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of GetFacHabType method, of class Facility.
     */
    @Test
    public void testGetFacHabType() {
        System.out.print("GetFacHabType");
        Facility instance = new FacilityImpl();
        String expResult = "The Facility";
        String result = instance.getFacHabType();
        assertEquals(expResult, result);
        System.out.print("berhasil");
    }

    /**
     * Test of GetFacilityName method, of class Facility.
     */
    @Test
    public void testGetFacilityName() {
        System.out.print("GetFacilityName");
        Facility instance = new FacilityImpl();
        String expResult = "The Facility";
        String result = instance.getFacilityName();
        assertEquals(expResult, result);
        System.out.print("berhasil");
    }

    /**
     * Test of Render method, of class Facility.
     */
    @Test
    public void testRender_boolean() {
        System.out.print("Render");
        boolean oncage = false;
        Facility instance = new FacilityImpl();
        instance.render(oncage);
        System.out.print("berhasil");
    }

    /**
     * Test of Render method, of class Facility.
     */
    @Test
    public void testRender_0args() {
        System.out.print("Render");
        Facility instance = new FacilityImpl();
        instance.render();
        System.out.print("berhasil");
    }

    public class FacilityImpl extends Facility {

        @Override
        public void enter() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
