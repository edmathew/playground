/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejpm.euler.math;

import com.ejpm.euler.math.prime.PrimeNumber;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 *
 * @author edgar.mateus
 */
public class PrimeFactorizationTest {

    public PrimeFactorizationTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void factorizationOfOneIsOne() {
        final int [] factors = PrimeNumber.primeFactorization(1);
        assertThat(factors.length, is(equalTo(1)));
        assertThat(factors[1], is(equalTo(1)));
    }
}
