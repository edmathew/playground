package com.ejpm.euler.math.prime;

import com.ejpm.euler.math.prime.PrimeNumber;
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
public class PrimeNumberTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {1, false}, {2, true}, {3, true}, {4, false}, {5, true}, {6, false},
            {37, true}, {49, false}, {199, true}, {7919, true}, {15487039, true}, {15486725, false}
            
        });
    }

    private final int number;
    private final boolean isPrime;

    public PrimeNumberTest(final int number, final boolean isPrime) {
        this.number = number;
        this.isPrime = isPrime;
    }

    @Test
    public void checkIfPrime() {
        assertThat(PrimeNumber.isPrime(number), is(equalTo(isPrime)));
    }

}
