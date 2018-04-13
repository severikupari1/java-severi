/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testi;

import JunitSeveri.Suorakaide;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author s704383
 */
public class SuorakaideTest {
    
    public SuorakaideTest() {
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
     * Test of getAla method, of class Suorakaide.
     */
    @Test
    public void testGetAla() {
        System.out.println("getAla");
        Suorakaide instance = new Suorakaide();
        instance.setKorkeus(3);
        instance.setLeveys(5);
        int expResult = 15;
        int result = instance.getAla();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getKehanPituus method, of class Suorakaide.
     */
    @Test
    public void testGetKehanPituus() {
        System.out.println("getKehanPituus");
        Suorakaide instance = new Suorakaide();
        instance.setKorkeus(3);
        instance.setLeveys(5);
        int expResult = 16;
        int result = instance.getKehanPituus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLeveys method, of class Suorakaide.
     */
    @Test
    public void testGetLeveys() {
        System.out.println("getLeveys");
        Suorakaide instance = new Suorakaide();
        instance.setLeveys(10);
        int expResult = 10;
        int result = instance.getLeveys();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLeveys method, of class Suorakaide.
     */
    @Test
    public void testSetLeveys() {
        System.out.println("setLeveys");
        int leveys = 2;
        Suorakaide instance = new Suorakaide();
        instance.setLeveys(leveys);
        assertEquals(instance.getLeveys(), leveys);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getKorkeus method, of class Suorakaide.
     */
    @Test
    public void testGetKorkeus() {
        System.out.println("getKorkeus");
        Suorakaide instance = new Suorakaide();
        instance.setKorkeus(9);
        int expResult = 9;
        int result = instance.getKorkeus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setKorkeus method, of class Suorakaide.
     */
    @Test
    public void testSetKorkeus() {
        System.out.println("setKorkeus");
        int korkeus = 99;
        Suorakaide instance = new Suorakaide();
        instance.setKorkeus(korkeus);
        assertEquals(instance.getKorkeus(), korkeus);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
