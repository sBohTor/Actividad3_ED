/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package sample;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sbohtor073
 */
public class VectorsTest {
    
    public VectorsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of equal method, of class Vectors.
     */
    @Test
    public void testEqual() {
 System.out.println("* VectorsJUnit3Test: testEqual()");
 assertTrue(Vectors.equal(new int[] {}, new int[] {}));
 assertTrue(Vectors.equal(new int[] {0}, new int[] {0}));
 assertTrue(Vectors.equal(new int[] {0, 0}, new int[] {0, 0}));
 assertTrue(Vectors.equal(new int[] {0, 0, 0}, new int[] {0, 0, 0}));
 assertTrue(Vectors.equal(new int[] {5, 6, 7}, new int[] {5, 6, 7}));
 assertFalse(Vectors.equal(new int[] {}, new int[] {0}));
 assertFalse(Vectors.equal(new int[] {0}, new int[] {0, 0}));
 assertFalse(Vectors.equal(new int[] {0, 0}, new int[] {0, 0, 0}));
 assertFalse(Vectors.equal(new int[] {0, 0, 0}, new int[] {0, 0}));
 assertFalse(Vectors.equal(new int[] {0, 0}, new int[] {0}));
 assertFalse(Vectors.equal(new int[] {0}, new int[] {}));
 assertFalse(Vectors.equal(new int[] {0, 0, 0}, new int[] {0, 0, 1}));
 assertFalse(Vectors.equal(new int[] {0, 0, 0}, new int[] {0, 1, 0}));
 assertFalse(Vectors.equal(new int[] {0, 0, 0}, new int[] {1, 0, 0}));
 assertFalse(Vectors.equal(new int[] {0, 0, 1}, new int[] {0, 0, 3}));
}

    /**
     * Test of scalarMultiplication method, of class Vectors.
     */
    @Test
    public void testScalarMultiplication() {
 System.out.println("* VectorsJUnit3Test: testScalarMultiplication()");
assertEquals(0,Vectors.scalarMultiplication(new int[] { 0, 0}, new int[] { 0, 0}));
assertEquals( 39, Vectors.scalarMultiplication(new int[] { 3, 4}, new int[] { 5, 6}));
 assertEquals(-39, Vectors.scalarMultiplication(new int[] {-3, 4}, new int[] { 5,-6}));
 assertEquals( 0, Vectors.scalarMultiplication(new int[] { 5, 9}, new int[] {-9, 5}));
 assertEquals(100, Vectors.scalarMultiplication(new int[] { 6, 8}, new int[] { 6, 8}));
}
    
}
