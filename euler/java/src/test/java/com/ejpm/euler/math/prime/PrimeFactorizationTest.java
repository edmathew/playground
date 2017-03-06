package com.ejpm.euler.math.prime;

import org.junit.Test;
import static org.junit.Assert.*;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 *
 * @author edgar.mateus
 */
public class PrimeFactorizationTest {

    @Test
    public void factorizationOfOneIsEmpty() {
        final int[] factors = PrimeNumber.primeFactorization(1);
        assertThat(factors.length, is(equalTo(0)));
    }

    @Test
    public void factorizationOfTwoIsTwo() {
        final int[] factors = PrimeNumber.primeFactorization(2);
        assertThat(factors.length, is(equalTo(1)));
        assertThat(factors[0], is(equalTo(2)));

    }

    @Test
    public void factorizationOf13195() {
        final int[] factors = PrimeNumber.primeFactorization(13195);
        assertThat(factors.length, is(equalTo(4)));
        assertThat(factors[0], is(equalTo(5)));
        assertThat(factors[3], is(equalTo(29)));
    }

    @Test
    public void factorizationOf600851475143() {
        final int[] factors = PrimeNumber.primeFactorization(600851475143L);
        assertThat(factors.length, is(equalTo(4)));
        assertThat(factors[factors.length - 1], is(equalTo(6857)));
    }
    
}
