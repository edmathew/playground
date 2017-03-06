package com.ejpm.euler.math.prime;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edgar.mateus
 */
public class PrimeNumber {

    public static boolean isPrime(final int number){
        if((number != 2 && number % 2 == 0) || number == 1)
            return false;
        
        int divider = number;
        
        do{
            if(number % divider == 0 && divider != number)
                return false;
            divider = divider - 2;
        }while(divider > 1);
        
        return true;
     }
    
    public static int[] primeFactorization(final long number){
        final List<Integer> factors = new ArrayList<>();
        final PrimeSequence sequence = new PrimeSequence();
        
        long n = number;
        
        while(n > 1){
            int prime = sequence.getNext();
            
            if(n % prime == 0){
                factors.add(prime);
                while(n % prime == 0){
                    n = n / prime;
                }
            }
        }
        
        return factors.stream().mapToInt(i-> i).toArray();
    }
 
    
}
