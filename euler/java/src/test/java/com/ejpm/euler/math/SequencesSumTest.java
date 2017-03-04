package com.ejpm.euler.math;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author edgar.mateus
 */
public class SequencesSumTest {

    @Test
    public void theSumOfAllDivisibleOf3Under1000Is() {
        assertThat(SequencesSum.sumAllDivisibleBy(3, 1000), is(equalTo(166833)));
    }
    
    @Test
    public void theSumOfAllDivisibleOf5Under1000Is() {
        assertThat(SequencesSum.sumAllDivisibleBy(5, 1000), is(equalTo(99500)));
    }
    
    @Test
    public void theSumOfAllDivisibleOf15Under1000Is() {
        assertThat(SequencesSum.sumAllDivisibleBy(15, 1000), is(equalTo(33165)));
    }
} //233168