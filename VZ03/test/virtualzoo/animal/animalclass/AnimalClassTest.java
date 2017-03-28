/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualzoo.animal.animalclass;

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
public class AnimalClassTest {
    
    public AnimalClassTest() {
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
     * Test of GetDeskripsi method, of class AnimalClass.
     */
    @Test
    public void testGetDeskripsi() {
        System.out.print("GetDeskripsi");
        AnimalClass instance = new AnimalClassImpl();
        String expResult = "";
        String result = instance.GetDeskripsi();
        assertEquals(expResult, result);
        System.out.print("berhasil");
    }

    /**
     * Test of GetClassName method, of class AnimalClass.
     */
    @Test
    public void testGetClassName() {
        System.out.print("GetClassName");
        AnimalClass instance = new AnimalClassImpl();
        String expResult = "";
        String result = instance.GetClassName();
        assertEquals(expResult, result);
        System.out.print("berhasil");
    }

    public class AnimalClassImpl implements AnimalClass {

        public String GetDeskripsi() {
            return "";
        }

        public String GetClassName() {
            return "";
        }
    }
    
}
