
package com.ejpm.euler.math.prime;

/**
 *
 * @author edgar.mateus
 */
public class PrimeSequence {

    private int lastPrime;
    
    public PrimeSequence(){
        lastPrime = 1;
    }
    
    public int getNext(){
        int primeCandidate = lastPrime + 1;
        while(!PrimeNumber.isPrime(primeCandidate)){
             primeCandidate ++;
        }
        
        lastPrime = primeCandidate;
        
        return primeCandidate;
    }
    
}
