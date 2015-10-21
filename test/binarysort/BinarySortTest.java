/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysort;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author castudillo
 */
public class BinarySortTest {
    
    public BinarySortTest() {
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
     * Test of sort method, of class BinarySort.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        int[] A = {0,1,1,1,1,1,1,0};
        
        BinarySort instance = new BinarySort();
        assertFalse(instance.isSorted(A));//ARRAY IS NOT SORTED
        instance.sort(A); //SORT ARRAY
        assertNotNull(A);//ARRAY CONTAINS SOMETHING
        boolean outcome=instance.isSorted(A);//TEST IF ARRAY IS SORTED
        assertTrue(outcome);//ARRAY IS SUPPOSED TO BE SORTED
    }

    /**
     * Test of isBinary method, of class BinarySort. This method check if a given array contains only zeroes and ones.
     */
    @Test
    public void testIsBinary() {
        System.out.println("isBinary");

        int[] A = {0,1,1,1,1,1,1,0};
        BinarySort instance = new BinarySort();
        boolean expResult = true;
        boolean result = instance.isBinary(A);
        assertEquals(expResult, result);
 
        int[] B = {0,1,1,1,0};
        instance = new BinarySort();
        expResult = true;
        result = instance.isBinary(B);
        assertEquals(expResult, result);
 
        int[] C = {0,4,1,1,0};
        instance = new BinarySort();
        expResult = false;
        result = instance.isBinary(C);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isSorted method, of class BinarySort. this method returns true if the contents of the array is sorted
     */
    @Test
    public void testIsSorted() {
        System.out.println("isSorted");
        
        int[] A = {0,0,0,0,0,1,1,1,1,1};
        BinarySort instance = new BinarySort();
        boolean expResult = true;
        boolean result = instance.isSorted(A);
        assertEquals(expResult, result);
        
        
        int[] B = {0,1,0,0,0,1,1,1,1,1};
        instance = new BinarySort();
        expResult = false;
        result = instance.isSorted(B);
        assertEquals(expResult, result);
        
        int[] C = {0,1};
        instance = new BinarySort();
        expResult = true;
        result = instance.isSorted(C);
        assertEquals(expResult, result);

        int[] D = {1,0};
        instance = new BinarySort();
        expResult = false;
        result = instance.isSorted(D);
        assertEquals(expResult, result);
        
    }
    
}
