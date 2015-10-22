/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

/**
 *
 * @author castudillo
 */
public abstract class AbstractSort {

    /**
     * @param A the array to be tested.
     * @return true if array is sorted, false otherwise.
     */
    
    public boolean isSorted(int[] A) {
        if (A.length==0) return false;
        if (A.length==1) return true;
        for(int i=0;i<A.length-1;i++)
            if(A[i]>A[i+1]) //contigous elements must preserve the less-than relationship.
                return false;
        if (A[A.length-1]<A[A.length-2]) //check two last elements
            return false;
        return true;
    }
    
    
    /**
     * print the content of the array
     * @param A the array
     */
     public void print(int[] A) {
        for(int i=0;i<A.length;i++)
            System.out.print(A[i]+" ");
        System.out.println();
    }
    
}
