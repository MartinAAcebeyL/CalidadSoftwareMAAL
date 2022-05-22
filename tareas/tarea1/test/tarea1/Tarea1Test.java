/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package tarea1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author martin1
 */
public class Tarea1Test {
    
    public Tarea1Test() {
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
     * Test of fibonacci method, of class Tarea1.
     */
    @Test
    public void testFibonacci_3() {
        System.out.println("fibonacci de 3");
        int n = 3;
        int expResult = 2;
        int result = Tarea1.fibonacci(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFibonacci_5() {
        System.out.println("fibonacci de 5");
        int n = 5;
        int expResult = 5;
        int result = Tarea1.fibonacci(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFibonacci_7() {
        System.out.println("fibonacci de 7");
        int n = 7;
        int expResult = 13;
        int result = Tarea1.fibonacci(n);
        assertEquals(expResult, result);
    } 
}
