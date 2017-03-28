/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualzoo.animal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import virtualzoo.util.point.Point;
import virtualzoo.animal.realanimal.*;


/**
 *
 * @author David
 */
public class AnimalTest {
    
    public AnimalTest() {
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
     * Test of GetPosition method, of class Animal.
     */
    @Test
    public void testGetPosition() {
        System.out.print("GetPosition");
        Platypus instance = new Platypus();
        Point expResult = new Point(-1,-1);
        Point result = instance.getPosition();
        assertEquals(expResult.getX(), result.getX());
        assertEquals(expResult.getY(), result.getY());
        System.out.println(" berhasil");

    }

    /**
     * Test of GetSpeciesName method, of class Animal.
     */
    @Test
    public void testGetSpeciesName() {
        System.out.print("GetSpeciesName");
        Platypus instance = new Platypus();
        String expResult = "Platypus";
        String result = instance.getSpeciesName();
        assertEquals(expResult, result);
        System.out.println(" berhasil");

    }

    /**
     * Test of GetFoodNum method, of class Animal.
     */
    @Test
    public void testGetFoodNum() {
        System.out.print("GetFoodNum");
        Animal instance = new AnimalImpl();
        double expResult = 0.0;
        double result = instance.getFoodNum();
        assertEquals(expResult, result, 0.0);
        System.out.println(" berhasil");        
    }

    /**
     * Test of SetPosition method, of class Animal.
     */
    @Test
    public void testSetPosition() {
        System.out.print("SetPosition");
        Point p = new Point(-1,-1);
        Animal instance = new AnimalImpl();
        instance.setPosition(p);
        System.out.println(" berhasil");        
    }

    /**
     * Test of Interact method, of class Animal.
     */
    @Test
    public void testInteract() {
        System.out.print("Interact");
        Animal instance = new AnimalImpl();
        instance.interact();
        System.out.println(" berhasil");
    }

    /**
     * Test of Deskripsi method, of class Animal.
     */
    @Test
    public void testDeskripsi() {
        System.out.print("Deskripsi");
        Animal instance = new AnimalImpl();
        instance.deskripsi();
        System.out.println(" berhasil");
    }

    /**
     * Test of IsTamed method, of class Animal.
     */
    @Test
    public void testIsTamed() {
        System.out.print("IsTamed");
        Animal instance = new AnimalImpl();
        boolean expResult = true;
        boolean result = instance.isTamed();
        assertEquals(expResult, result);
        System.out.println(" berhasil");
    }

    /**
     * Test of IsEnemy method, of class Animal.
     */
    @Test
    public void testIsEnemy() {
        System.out.print("IsEnemy");
        String animal = "";
        Animal instance = new AnimalImpl();
        boolean expResult = false;
        boolean result = instance.isEnemy(animal);
        assertEquals(expResult, result);
        System.out.println(" berhasil");
    }

    /**
     * Test of AddEnemy method, of class Animal.
     */
    @Test
    public void testAddEnemy() {
        System.out.print("AddEnemy");
        String animal_name = "";
        Animal instance = new AnimalImpl();
        instance.addEnemy(animal_name);
        System.out.println(" berhasil");
    }

    /**
     * Test of AddAnimalType method, of class Animal.
     */
    @Test
    public void testAddAnimalType() {
        System.out.print("AddAnimalType");
        String type = "";
        Animal instance = new AnimalImpl();
        instance.addAnimalType(type);
        System.out.println(" berhasil");
    }

    /**
     * Test of IsTypeThere method, of class Animal.
     */
    @Test
    public void testIsTypeThere() {
        System.out.print("IsTypeThere");
        String type = "Flying";
        Animal instance = new AnimalImpl();
        boolean expResult = false;
        boolean result = instance.isTypeThere(type);
        assertEquals(expResult, result);
        System.out.println(" berhasil");
    }

    /**
     * Test of GetFoodType method, of class Animal.
     */
    @Test
    public void testGetFoodType() {
        System.out.print("GetFoodType");
        Animal instance = new AnimalImpl();
        String expResult = "";
        String result = instance.getFoodType();
        assertEquals(expResult, result);
        System.out.println(" berhasil");
    }

    /**
     * Test of Render method, of class Animal.
     */
    @Test
    public void testRender() {
        System.out.print("Render");
        Animal instance = new AnimalImpl();
        instance.render();
        System.out.println(" berhasil");
    }

    public class AnimalImpl extends Animal {

        public void interact() {
        }

        public void deskripsi() {
        }

        public String getFoodType() {
            return "";
        }
    }
    
}
