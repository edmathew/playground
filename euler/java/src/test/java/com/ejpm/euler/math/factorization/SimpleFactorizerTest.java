package com.ejpm.euler.math.factorization;

import java.math.BigInteger;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;

public class SimpleFactorizerTest {
    
    private SimpleFactorizer factorizer;
    
    @Before
    public void setUp(){
        factorizer = new SimpleFactorizer();
    }
    
    
    @Test
    public void oneHasOnlyItSelfAsFactor() {
        List<Integer> factors = factorizer.getFactors(1);
      // assertThat(factors, hasSize is(equalTo(new BigInteger("1"))));

    }

}
