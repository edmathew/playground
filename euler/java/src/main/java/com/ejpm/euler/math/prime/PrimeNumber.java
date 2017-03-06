package com.ejpm.euler.math;

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
    
 
    
}
