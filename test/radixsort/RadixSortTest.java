/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radixsort;

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
public class RadixSortTest {
    
    public RadixSortTest() {
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
     * Test of sort method, of class RadixSort.
     */
    @Test
    public void testSort() {
        System.out.println("RadixSort");
        
        RadixSort instance = new RadixSort();
        boolean result;
        
        int[] A = {9,8,7,6,5,4,3,2,1};
        result=instance.isSorted(A);
        assertFalse(result);
        instance.sort(A);
        result=instance.isSorted(A);
        assertTrue(result);

        int[] B = {19,18,17,16,15,14,13,12,11};
        result=instance.isSorted(B);
        assertFalse(result);
        instance.sort(B);
        result=instance.isSorted(B);
        assertTrue(result);
        
        int[] C = {19,18,17,16,27,15,14,37,13,12,11,47};
        result=instance.isSorted(C);
        assertFalse(result);
        instance.sort(C);
        result=instance.isSorted(C);
        assertTrue(result);

        int[] D = {19,18,27,26,15,24,13,22,11};
        result=instance.isSorted(D);
        assertFalse(result);
        instance.sort(D);
        result=instance.isSorted(D);
        assertTrue(result);
        
        int[] E = {170, 45, 75, 90, 802, 2, 24, 66};
        result=instance.isSorted(E);
        assertFalse(result);
        instance.sort(E);
        result=instance.isSorted(E);
        assertTrue(result);

        
        
    }
    
}
