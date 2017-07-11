package com.ejpm.euler.math.prime;

import java.util.List;
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
        final List<PrimeFactor> factors = PrimeNumber.primeFactorization(1);
        assertThat(factors.size(), is(equalTo(0)));
    }

    @Test
    public void factorizationOfTwoIsTwo() {
        final List<PrimeFactor> factors = PrimeNumber.primeFactorization(2);
        assertThat(factors.size(), is(equalTo(1)));
        validateFactor(factors.get(0), 2, 1);
    }

    @Test
    public void factorizationOfFourIsTwoWithExponentTwo() {
        final List<PrimeFactor> factors = PrimeNumber.primeFactorization(4);
        assertThat(factors.size(), is(equalTo(1)));
        validateFactor(factors.get(0), 2, 2);
    }
    @Test
    public void factorizationOf13195() {
        final List<PrimeFactor> factors = PrimeNumber.primeFactorization(13195);
        assertThat(factors.size(), is(equalTo(4)));
        validateFactor(factors.get(0), 5, 1);
        validateFactor(factors.get(3), 29, 1);
    }

    @Test
    public void factorizationOf600851475143() {
        final List<PrimeFactor> factors = PrimeNumber.primeFactorization(600851475143L);
        assertThat(factors.size(), is(equalTo(4)));
        validateFactor(factors.get(factors.size() - 1), 6857, 1);
    }

    private void validateFactor(final PrimeFactor factor, final int expectedFactor, final int expectedExponent) {
        assertThat(factor.getPrimeNumber(), is(equalTo(expectedFactor)));
        assertThat(factor.getPrimeExponent(), is(equalTo(expectedExponent)));
    }

}
