package com.ejpm.euler.problem.impl;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author edgar.mateus
 */
@RunWith(Parameterized.class)
public class Problem4Test {

     @Parameterized.Parameters
    public static Collection<Object[]> data() {
         return Arrays.asList(new Object[][]{
            {1, 9}, {2, 9009}, {3, 906609}
        });
    }
    
    private final Problem4 problem;
    private final int nDigits;
    private final int largestPalindrome;

    public Problem4Test(final int nDigits, final int largestPalindrome){
        problem = new Problem4();
        this.nDigits = nDigits;
        this.largestPalindrome = largestPalindrome;
    }
            
    
    @Test
    public void testLargestPalimdrome() {
        assertThat(problem.calcLargestProductPalindrome(nDigits) , is(equalTo(largestPalindrome)));
    }
 

}
