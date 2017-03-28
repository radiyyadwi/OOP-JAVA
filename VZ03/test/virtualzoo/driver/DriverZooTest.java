/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualzoo.driver;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import virtualzoo.util.point.Point;

/**
 *
 * @author David
 */
public class DriverZooTest {
    
    public DriverZooTest() {
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
     * Test of DisplayVirtualZoo method, of class DriverZoo.
     */
    @Test
    public void testDisplayVirtualZoo_0args() {
        System.out.print("DisplayVirtualZoo");
        DriverZoo instance = new DriverZoo();
        instance.DisplayVirtualZoo();
        System.out.print("berhasil");
    }

    /**
     * Test of DisplayVirtualZoo method, of class DriverZoo.
     */
    @Test
    public void testDisplayVirtualZoo_Point_Point() {
        System.out.print("DisplayVirtualZoo");
        Point upleft = new Point(1,1);
        Point downright = new Point(2,2);
        DriverZoo instance = new DriverZoo();
        instance.DisplayVirtualZoo(upleft, downright);
        System.out.print("berhasil");
    }

    /**
     * Test of HitungMakanan method, of class DriverZoo.
     */
    @Test
    public void testHitungMakanan() {
        System.out.print("HitungMakanan");
        DriverZoo instance = new DriverZoo();
        instance.HitungMakanan();
        System.out.print("berhasil");
    }

    /**
     * Test of MoveAnimal method, of class DriverZoo.
     */
    @Test
    public void testMoveAnimal() {
        System.out.print("MoveAnimal");
        DriverZoo instance = new DriverZoo();
        instance.MoveAnimal();
        System.out.print("berhasil");
    }

    /**
     * Test of PrintTitle method, of class DriverZoo.
     */
    @Test
    public void testPrintTitle() {
        System.out.print("PrintTitle");
        DriverZoo instance = new DriverZoo();
        instance.PrintTitle();
        System.out.print("berhasil");
    }

    /**
     * Test of TourVirtualZoo method, of class DriverZoo.
     */
    @Test
    public void testTourVirtualZoo() {
        System.out.print("TourVirtualZoo");
        DriverZoo instance = new DriverZoo();
    }

    /**
     * Test of PrintAllAnimal method, of class DriverZoo.
     */
    @Test
    public void testPrintAllAnimal() {
        System.out.print("PrintAllAnimal");
        DriverZoo instance = new DriverZoo();
        instance.PrintAllAnimal();
        System.out.print("berhasil");
    }
    
}
