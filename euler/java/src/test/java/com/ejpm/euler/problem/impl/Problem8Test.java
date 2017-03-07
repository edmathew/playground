package com.ejpm.euler.problem.impl;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 *
 * @author edgar.mateus
 */
public class Problem8Test {

    private Problem8 problem;

    @Before
    public void setUp() {
        problem = new Problem8();
    }

    @Test
    public void calcGreatestAdjcentProductWithAdjacent4() {
        assertThat(problem.calcGreatestAdjcentProduct(4), is(equalTo(5832L)));
    }

     @Test
    public void calcGreatestAdjcentProductWithAdjacent13() {
        assertThat(problem.calcGreatestAdjcentProduct(13), is(equalTo(5832L)));
    }
}
