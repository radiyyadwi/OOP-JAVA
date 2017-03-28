/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualzoo.renderable;

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
public class RenderableTest {
    
    public RenderableTest() {
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
     * Test of Render method, of class Renderable.
     */
    @Test
    public void testRender() {
        System.out.print("Render");
        Renderable instance = new RenderableImpl();
        instance.Render();
        System.out.print("berhasil");
    }

    public class RenderableImpl implements Renderable {

        public void Render() {
        }
    }
    
}
