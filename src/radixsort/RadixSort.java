/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radixsort;

import common.AbstractSort;
import common.Sortable;

/**
 *
 * @author castudillo
 */
public class RadixSort extends AbstractSort implements Sortable {

    @Override
    public void sort(int[] A) {
        int B[]=new int[A.length];
        int lsd[]=new int[A.length];
        int power=10;
        double sum=1;//sontehing different than zero
                
        //copy original array
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        
        }
        //print(A);
        
        while(sum!=0) {
            
            // Take the least significant digit (or group of bits, both being examples of radices) of each key.
            sum=0;
            for (int j = 0; j < lsd.length; j++){
                
                int dato = B[j];
                int remainder=dato%power; //least significant digit
                int root=dato/power;
                sum+=root;//
                B[j]=root;//store what is left of the number
                lsd[j]=remainder; //store least significant digits
            }
            //System.out.print("B:");
            //print(B);
            power=power*10;
            
           //Group the keys based on that digit, but otherwise keep the original order of keys. (This is what makes the LSD radix sort a stable sort.)
            int i,j;
            for (i = 0; i < lsd.length; i++) {//slight modification of insertion sort (stable)
                j=i;
                while(j>0 && lsd[j-1]>lsd[j]){
                    swap(lsd,j,j-1);
                    swap(A,j,j-1); //this is the modification, we update lsd, A and B
                    swap(B,j,j-1); //this is the modification, we update lsd, A and B
                    j--;
                }
            }
            
            //print(A);
            //print(lsd);            
            
            
           //Repeat the grouping process with each more significant digit.
        }
        
    }

    private void swap(int[] A, int i, int j) {
       int aux=A[i];
            A[i]=A[j];
            A[j]=aux;
    }
    
}
