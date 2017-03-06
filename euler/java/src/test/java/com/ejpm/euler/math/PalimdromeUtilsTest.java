package com.ejpm.euler.math;

import java.util.Arrays;
import java.util.Collection;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


/**
 *
 * @author edgar.mateus
 */
@RunWith(Parameterized.class)
public class PalimdromeUtilsTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {1, true}, {9, true}, {10, false}, {11, true},  
            {15487039, false}, {15486725, false},
            {156651, true}
            
        });
    }

    private final int number;
    private final boolean isPalimdrome;

    public PalimdromeUtilsTest(final int number, final boolean isPalimdrome) {
        this.number = number;
        this.isPalimdrome = isPalimdrome;
    }

    @Test
    public void checkIfPalimdrome() {
        assertThat(PalindromeUtils.isPalindrome(number), is(equalTo(isPalimdrome)));
    }

}
