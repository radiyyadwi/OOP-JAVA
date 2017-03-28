/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualzoo.cell.facility.park;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
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
public class ParkTest {
    
    public ParkTest() {
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
     * Test of GetJumlahPengunjung method, of class Park.
     */
    @Test
    public void testGetJumlahPengunjung() {
        System.out.print("GetJumlahPengunjung");
        Park instance = new Park();
        int expResult = 0;
        int result = instance.GetJumlahPengunjung();
        assertEquals(expResult, result);
        System.out.print("berhasil");
    }

    /**
     * Test of IncreaseJumlahPengunjung method, of class Park.
     */
    @Test
    public void testIncreaseJumlahPengunjung() {
        System.out.print("IncreaseJumlahPengunjung");
        int x = 0;
        Park instance = new Park();
        instance.IncreaseJumlahPengunjung(x);
        System.out.print("berhasil");
    }

    /**
     * Test of DecreaseJumlahPengunjung method, of class Park.
     */
    @Test
    public void testDecreaseJumlahPengunjung() {
        System.out.print("DecreaseJumlahPengunjung");
        int x = 0;
        Park instance = new Park();
        instance.DecreaseJumlahPengunjung(x);
        System.out.print("berhasil");
    }

    /**
     * Test of AddWahana method, of class Park.
     */
    @Test
    public void testAddWahana() {
        System.out.print("AddWahana");
        String whn = "";
        Park instance = new Park();
        instance.AddWahana(whn);
        System.out.print("berhasil");
    }

    /**
     * Test of DelWahana method, of class Park.
     */
    @Test
    public void testDelWahana() {
        System.out.print("DelWahana");
        String whn = "";
        Park instance = new Park();
        instance.DelWahana(whn);
        System.out.print("berhasil");
    }

    /**
     * Test of Enter method, of class Park.
     */
    @Test
    public void testEnter() {
        System.out.print("Enter");
        Park instance = new Park();
    }
    
}
