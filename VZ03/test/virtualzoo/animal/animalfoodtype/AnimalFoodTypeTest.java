/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualzoo.animal.animalfoodtype;

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
public class AnimalFoodTypeTest {
    
    public AnimalFoodTypeTest() {
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
     * Test of GetFoodType method, of class AnimalFoodType.
     */
    @Test
    public void testGetFoodType() {
        System.out.print("GetFoodType");
        AnimalFoodType instance = new AnimalFoodTypeImpl();
        String expResult = "";
        String result = instance.getFoodType();
        assertEquals(expResult, result);
        System.out.print("berhasil");
    }

    public class AnimalFoodTypeImpl implements AnimalFoodType {

        public String getFoodType() {
            return "";
        }
    }
    
}
