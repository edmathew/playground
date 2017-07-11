package com.ejpm.euler.math.factorization;

import java.util.Arrays;
import java.util.Collection;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * @author edgar.mateus
 */
@RunWith(Parameterized.class)
public class SimpleFactorizerTest {
    
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {24, 8}, {48, 10}
        });
    }
    
    private final int n;
    private final int result;
    
    public SimpleFactorizerTest(final int n, final int result){
        this.n = n;
        this.result = result;
    }
    
    @Test
    public void checkIfPrime() {
        assertThat(new SimpleFactorizer().getFactorsQuantity(n), is(equalTo(result)));
    }
}

 