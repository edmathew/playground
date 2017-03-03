
package com.ejpm.euler.math;

/**
 *
 * @author edgar.mateus
 */
public class SequencesSum {
    
    /**
     * Returns the sum of (1*n) + (2*n) 
     * @param divisible
     * @param top
     * @return 
     */
    public static int sumAllDivisibleBy(final int divisible, final int top){
        final int qtd = (top - 1)/divisible;
        
        return divisible * (qtd * (qtd + 1)) / 2;
    }

}
