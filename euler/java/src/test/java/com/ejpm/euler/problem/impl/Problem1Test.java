package com.ejpm.euler.problem.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 *
 * @author edgar.mateus
 */
public class Problem1Test {

    private Problem1 problem;

    @Before
    public void setUp() {
        problem = new Problem1();
    }

    @Test
    public void theSumOfAll3and5MultipliesUnder10Is23() {
        assertThat(problem.sumAllMultiplesOf3Or5BellowN(10), is(equalTo(23L)));
    }

    @Test
    public void theSumOfAll3and5MultipliesUnder1000Is233168() {
        assertThat(problem.sumAllMultiplesOf3Or5BellowN(1000), is(equalTo(233168L)));
    }

}
