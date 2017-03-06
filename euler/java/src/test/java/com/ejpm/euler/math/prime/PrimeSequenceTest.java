/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejpm.euler.math.prime;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author edgar.mateus
 */
public class PrimeSequenceTest {


    @Test
    public void testSequence() {
        final PrimeSequence sequence = new PrimeSequence();
        assertThat(sequence.getNext(), is(equalTo(2)));
        assertThat(sequence.getNext(), is(equalTo(3)));
        assertThat(sequence.getNext(), is(equalTo(5)));
        assertThat(sequence.getNext(), is(equalTo(7)));
        assertThat(sequence.getNext(), is(equalTo(11)));

    }
}
