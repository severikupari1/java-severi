/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testi;

import JunitSeveri.Numbers;
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
public class NumbersTest {
    
    public NumbersTest() {
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
     * Test of insert method, of class Numbers.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        double d = 1.2;
        Numbers instance = new Numbers();
        instance.insert(d);
        double expResult = 1.2;
        double result = instance.itemAt(0);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class Numbers.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Numbers instance = new Numbers();
        instance.insert(1.0);
        instance.insert(2.0);
        instance.insert(3.0);
        instance.insert(4.0);
        instance.insert(5.0);
        instance.insert(6.0);
        instance.delete(3);
        assertEquals(5.0, instance.itemAt(3), 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCount method, of class Numbers.
     */
    @Test
    public void testGetCount() {
        System.out.println("getCount");
        Numbers instance = new Numbers();
        instance.insert(1.0);
        instance.insert(2.0);
        instance.insert(3.0);
        int expResult = 3;
        int result = instance.getCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of itemAt method, of class Numbers.
     */
    @Test
    public void testItemAt() {
        System.out.println("itemAt");
        Numbers instance = new Numbers();
        instance.insert(1.0);
        instance.insert(2.0);
        instance.insert(3.0);
        double expResult = 2.0;
        double result = instance.itemAt(1);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of avg method, of class Numbers.
     */
    @Test
    public void testAvg() {
        System.out.println("avg");
        Numbers instance = new Numbers();
        instance.insert(1.0);
        instance.insert(2.0);
        instance.insert(3.0);
        instance.insert(4.0);
        instance.insert(5.0);
        instance.insert(6.0);
        double expResult = 3.5;
        double result = instance.avg();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sum method, of class Numbers.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        Numbers instance = new Numbers();
        instance.insert(1.0);
        instance.insert(2.0);
        instance.insert(3.0);
        instance.insert(4.0);
        instance.insert(5.0);
        instance.insert(6.0);
        double expResult = 21.0;
        double result = instance.sum();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
