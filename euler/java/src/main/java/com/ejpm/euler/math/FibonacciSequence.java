package com.ejpm.euler.math;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Calculate Fibonacci sequence elements with dynamic programming approach
 *
 * @author edgar.mateus
 */
public class FibonacciSequence {

    private final Map<Integer, BigInteger> fiboStorage = new HashMap<>();

    public FibonacciSequence() {
        fiboStorage.put(0, BigInteger.ZERO);
        fiboStorage.put(1, BigInteger.ONE);
    }

    public BigInteger getElement(int n) {
        if (fiboStorage.get(n) == null) {
            final BigInteger nMinus1 = getElement(n - 1);
            final BigInteger nMinus2 = getElement(n - 2);

            fiboStorage.put(n, nMinus1.add(nMinus2));
        }

        return fiboStorage.get(n);
    }
}
