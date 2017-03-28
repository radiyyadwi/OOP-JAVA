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
public class IkanCupangTest {
    
    public IkanCupangTest() {
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
     * Test of Interact method, of class IkanCupang.
     */
    @Test
    public void testInteract() {
        System.out.print("Interact");
        IkanCupang instance = new IkanCupang();
        instance.interact();
        System.out.println(" berhasil");
    }

    /**
     * Test of GetFoodType method, of class IkanCupang.
     */
    @Test
    public void testGetFoodType() {
        System.out.print("GetFoodType");
        IkanCupang instance = new IkanCupang();
        String expResult = "Carnivore";
        String result = instance.getFoodType();
        assertEquals(expResult, result);
        System.out.println(" berhasil");
    }

    /**
     * Test of GetClassName method, of class IkanCupang.
     */
    @Test
    public void testGetClassName() {
        System.out.print("GetClassName");
        IkanCupang instance = new IkanCupang();
        String expResult = "Actinopterygii";
        String result = instance.getClassName();
        assertEquals(expResult, result);
        System.out.println(" berhasil");
    }

    /**
     * Test of GetDeskripsi method, of class IkanCupang.
     */
    @Test
    public void testGetDeskripsi() {
        System.out.print("GetDeskripsi");
        IkanCupang instance = new IkanCupang();
        String expResult = "";
        if(instance.getClassName().equals("Aves")) {
            expResult = "Aves merupakan kelas kelompok hewan " + 
                        "vertebrata yang memiliki bulu dan sayap";
        } 
        else if(instance.getClassName().equals("Mammal")) {
            expResult = "Mammal merupakan kelas hewan vertebrata " +
            "yang ciri utama nya memiliki kelenjar susu";
        }
        else if(instance.getClassName().equals("Chondrichtyes")) {
            expResult = "Chondrichthyes merupakan ikan dengan tulang rawan";
        }
        else if(instance.getClassName().equals("Insect")) {
            expResult = "Insect merupakan hewan avertebrata yang " + 
            "terdiri dari 3 bagian tubuh, dan bernafas dengan trakea";
        }
        else if(instance.getClassName().equals("Actinopterygii")) {
            expResult = "Actinopterygii adalah ikan yang memiliki sirip kipas";
        }
        String result = instance.getDeskripsi();
        assertEquals(expResult, result);
        System.out.println(" berhasil");
    }

    /**
     * Test of Deskripsi method, of class IkanCupang.
     */
    @Test
    public void testDeskripsi() {
        System.out.print("Deskripsi");
        IkanCupang instance = new IkanCupang();
        instance.deskripsi();
        System.out.println(" berhasil");
    }
    
}
