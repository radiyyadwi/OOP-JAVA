/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualzoo.cell.facility.restaurant;

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
public class RestaurantTest {
    
    public RestaurantTest() {
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
     * Test of IncreaseJumlahPengunjung method, of class Restaurant.
     */
    @Test
    public void testIncreaseJumlahPengunjung() {
        System.out.print("IncreaseJumlahPengunjung");
        int x = 0;
        Restaurant instance = new Restaurant();
        instance.IncreaseJumlahPengunjung(x);
        System.out.print("berhasil");
    }

    /**
     * Test of DecreaseJumlahPengunjung method, of class Restaurant.
     */
    @Test
    public void testDecreaseJumlahPengunjung() {
        System.out.print("DecreaseJumlahPengunjung");
        int x = 0;
        Restaurant instance = new Restaurant();
        instance.DecreaseJumlahPengunjung(x);
        System.out.print("berhasil");
    }

    /**
     * Test of AddMenu method, of class Restaurant.
     */
    @Test
    public void testAddMenu() {
        System.out.print("AddMenu");
        String _menu = "";
        Restaurant instance = new Restaurant();
        instance.AddMenu(_menu);
        System.out.print("berhasil");
    }

    /**
     * Test of DelMenu method, of class Restaurant.
     */
    @Test
    public void testDelMenu() {
        System.out.print("DelMenu");
        String _menu = "";
        Restaurant instance = new Restaurant();
        instance.DelMenu(_menu);
        System.out.print("berhasil");
    }

    /**
     * Test of GetJumlahPengunjung method, of class Restaurant.
     */
    @Test
    public void testGetJumlahPengunjung() {
        System.out.print("GetJumlahPengunjung");
        Restaurant instance = new Restaurant();
        int expResult = 0;
        int result = instance.GetJumlahPengunjung();
        assertEquals(expResult, result);
        System.out.print("berhasil");
    }

    /**
     * Test of Enter method, of class Restaurant.
     */
    @Test
    public void testEnter() {
        System.out.print("Enter");
        Restaurant instance = new Restaurant();
    }
    
}
