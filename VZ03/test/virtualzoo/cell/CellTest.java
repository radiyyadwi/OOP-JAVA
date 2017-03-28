/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualzoo.cell;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import virtualzoo.cell.facility.Facility;
import virtualzoo.cell.facility.restaurant.Restaurant;

/**
 *
 * @author David
 */
public class CellTest {
    
    public CellTest() {
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
     * Test of GetCellType method, of class Cell.
     */
    @Test
    public void testGetCellType() {
        System.out.print("GetCellType");
        Cell instance = new Restaurant();
        String expResult = "Facility";
        String result = instance.GetCellType();
        assertEquals(expResult, result);
        System.out.print("berhasil");
    }

    /**
     * Test of GetFacHabType method, of class Cell.
     */
    @Test
    public void testGetFacHabType() {
        System.out.print("GetFacHabType");
        Cell instance = new CellImpl();
        String expResult = "";
        String result = instance.GetFacHabType();
        assertEquals(expResult, result);
        System.out.print("berhasil");
    }

    /**
     * Test of SetCellType method, of class Cell.
     */
    @Test
    public void testSetCellType() {
        System.out.print("SetCellType");
        String tipe = "";
        Cell instance = new CellImpl();
        instance.SetCellType(tipe);
        System.out.print("berhasil");
    }

    /**
     * Test of Render method, of class Cell.
     */
    @Test
    public void testRender_boolean() {
        System.out.print("Render");
        boolean oncage = false;
        Cell instance = new CellImpl();
        instance.Render(oncage);
        System.out.print("berhasil");
    }

    /**
     * Test of Render method, of class Cell.
     */
    @Test
    public void testRender_0args() {
        System.out.print("Render");
        Cell instance = new CellImpl();
        instance.Render();
        System.out.print("berhasil");
    }

    /**
     * Test of Enter method, of class Cell.
     */
    @Test
    public void testEnter() {
        System.out.print("Enter");
        Cell instance = new CellImpl();
        instance.Enter();
        System.out.print("berhasil");
    }

    public class CellImpl extends Cell {

        public String GetFacHabType() {
            return "";
        }

        public void Render(boolean oncage) {
        }

        public void Render() {
        }

        public void Enter() {
        }
    }
    
}
