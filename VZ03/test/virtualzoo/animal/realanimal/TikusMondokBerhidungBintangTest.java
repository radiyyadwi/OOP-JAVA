/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualzoo.animal.realanimal;

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
public class TikusMondokBerhidungBintangTest {
    
    public TikusMondokBerhidungBintangTest() {
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
     * Test of Interact method, of class TikusMondokBerhidungBintang.
     */
    @Test
    public void testInteract() {
        System.out.print("Interact");
        TikusMondokBerhidungBintang instance = new TikusMondokBerhidungBintang();
        instance.Interact();
        System.out.println(" berhasil");
    }

    /**
     * Test of GetFoodType method, of class TikusMondokBerhidungBintang.
     */
    @Test
    public void testGetFoodType() {
        System.out.print("GetFoodType");
        TikusMondokBerhidungBintang instance = new TikusMondokBerhidungBintang();
        String expResult = "Carnivore";
        String result = instance.GetFoodType();
        assertEquals(expResult, result);
        System.out.println(" berhasil");
    }

    /**
     * Test of GetClassName method, of class TikusMondokBerhidungBintang.
     */
    @Test
    public void testGetClassName() {
        System.out.print("GetClassName");
        TikusMondokBerhidungBintang instance = new TikusMondokBerhidungBintang();
        String expResult = "Mammal";
        String result = instance.GetClassName();
        assertEquals(expResult, result);
        System.out.println(" berhasil");
    }

    /**
     * Test of GetDeskripsi method, of class TikusMondokBerhidungBintang.
     */
    @Test
    public void testGetDeskripsi() {
        System.out.print("GetDeskripsi");
        TikusMondokBerhidungBintang instance = new TikusMondokBerhidungBintang();
        String expResult = "";
        if(instance.GetClassName().equals("Aves")) {
            expResult = "Aves merupakan kelas kelompok hewan " + 
                        "vertebrata yang memiliki bulu dan sayap";
        } 
        else if(instance.GetClassName().equals("Mammal")) {
            expResult = "Mammal merupakan kelas hewan vertebrata " +
            "yang ciri utama nya memiliki kelenjar susu";
        }
        else if(instance.GetClassName().equals("Chondrichtyes")) {
            expResult = "Chondrichthyes merupakan ikan dengan tulang rawan";
        }
        else if(instance.GetClassName().equals("Insect")) {
            expResult = "Insect merupakan hewan avertebrata yang " + 
            "terdiri dari 3 bagian tubuh, dan bernafas dengan trakea";
        }
        else if(instance.GetClassName().equals("Actinopterygii")) {
            expResult = "Actinopterygii adalah ikan yang memiliki sirip kipas";
        }
        String result = instance.GetDeskripsi();
        assertEquals(expResult, result);
        System.out.println(" berhasil");
    }

    /**
     * Test of Deskripsi method, of class TikusMondokBerhidungBintang.
     */
    @Test
    public void testDeskripsi() {
        System.out.print("Deskripsi");
        TikusMondokBerhidungBintang instance = new TikusMondokBerhidungBintang();
        instance.Deskripsi();
        System.out.println(" berhasil");
    }
    
}
