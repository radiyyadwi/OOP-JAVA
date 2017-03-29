/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualzoo.cell.habitat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import virtualzoo.cell.habitat.waterhabitat.WaterHabitat;

/**
 *
 * @author David
 */
public class HabitatTest {
    
    public HabitatTest() {
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
     * Test of GetFacHabType method, of class Habitat.
     */
    @Test
    public void testGetFacHabType() {
        System.out.print("GetFacHabType");
        Habitat instance = new WaterHabitat();
        String expResult = "Water";
        String result = instance.getFacHabType();
        assertEquals(expResult, result);
        System.out.print("berhasil");
    }

    /**
     * Test of Render method, of class Habitat.
     */
    @Test
    public void testRender_0args() {
        System.out.print("Render");
        Habitat instance = new WaterHabitat();
        instance.render();
        System.out.print("berhasil");
    }

    /**
     * Test of Render method, of class Habitat.
     */
    @Test
    public void testRender_boolean() {
        System.out.print("Render");
        boolean oncage = false;
        Habitat instance = new WaterHabitat();
        instance.render(oncage);
        System.out.print("berhasil");
    }

    /**
     * Test of Enter method, of class Habitat.
     */
    @Test
    public void testEnter() {
        System.out.print("Enter");
        Habitat instance = new WaterHabitat();
        instance.enter();
        System.out.print("berhasil");
    }
    
}
