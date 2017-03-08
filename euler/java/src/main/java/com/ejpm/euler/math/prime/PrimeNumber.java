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
        
        if(number != 3 && number % 3 == 0)
            return false;
        
        double r = Math.floor(Math.sqrt(number));
        
        int f = 5;
        
        while(f <= r){
            if(number % f == 0)
                return false;
            if(number % (f +2) == 0)
                return false;
            f += 6;
        }
        
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
