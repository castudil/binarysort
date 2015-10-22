/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysort;

import common.AbstractSort;
import common.Sortable;

/**
 * This class implements a sorting algorithm that assumes that the array contains binary data, i.e., it only contains zeroes and ones.
 * @author castudillo
 */
public class BinarySort extends AbstractSort implements Sortable {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        // TODO code application logic here
    }
    */
    
    
    /**
     * This method sort the array assuming that there is only zeroes and ones in it.
     * the original array is traversed once and in each step is analyzed the content of the current cell.
     * if a one is encountered, it is copied at the end of an auxiliary array and the respective index is decremented. This process is repeated until traversing the whole array.
     * Finally, the content of the auxiliary array is copied to the original one.
     * The algorithm is very simple, takes linear time, but it is not in place (requires extra array) and it is not stable. 
     * The algorithm needs space proportional to the size of the array.
     * @param A the array to be sorted
     */
    @Override
    public void sort(int A[]){
        //assertions can be disable at compile time
        //see  https://docs.oracle.com/cd/E19683-01/806-7930/6jgp65ikq/index.html
        assert(isBinary(A));//check if values are indeed binary
        
        
        int j=A.length-1;
        int B[]=new int[A.length];//this sorting algorithm uses an auxiliar array
        
        for(int i=0;i<A.length;i++){
            if(A[i]==1){
                B[j]=1;
                j--;
            }
        }

        for(int i=0;i<A.length;i++){
            A[i]=B[i];
        }
        
        
    }

    /**
     * 
     * @param A the array to be tested.
     * @return true if all values in the arrays are binary digits, otherwise it returns false.
     */
    public boolean isBinary(int[] A) {
        for(int i=0;i<A.length;i++)
            if(A[i]!=0 && A[i]!=1)
                return false;
        return true;
    }

}
