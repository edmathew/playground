package com.ejpm.euler.math;

import java.math.BigInteger;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author edgar.mateus
 */
public class FibonacciSequenceTest {

    private FibonacciSequence fibo;

    @Before
    public void setUp() {
        fibo = new FibonacciSequence();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void fiboOf1IsOne() {
        assertThat(fibo.getElement(1), is(equalTo(new BigInteger("1"))));
    }
    
    @Test
    public void fiboOf2IsOne() {
        assertThat(fibo.getElement(2), is(equalTo(new BigInteger("1"))));
    }
  
    @Test
    public void fiboOf3IsTwo() {
        assertThat(fibo.getElement(2), is(equalTo(new BigInteger("1"))));
    }    
 
}
