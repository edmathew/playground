
package com.ejpm.euler.math.sequences;

/**
 * A triangular number is obtained by adding the natural numbers. So the 7th
 * triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28.
 * It also represents the area of a triangle of base n and hight n+1.
 *
 * @author edgar.mateus
 */
public class TriangularNumberSequence {
    
    public int getElement(int n){
        return n*(n+1) / 2;
    }

}
