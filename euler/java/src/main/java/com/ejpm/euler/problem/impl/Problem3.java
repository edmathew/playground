package com.ejpm.euler.problem.impl;

import com.ejpm.euler.math.prime.PrimeFactor;
import com.ejpm.euler.math.prime.PrimeNumber;
import com.ejpm.euler.problem.Problem;
import java.util.List;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime
 * factor of the number 600851475143 ?
 *
 * @author edgar.mateus
 */
public class Problem3 implements Problem {

    @Override
    public void execute() {
        final List<PrimeFactor> factors = PrimeNumber.primeFactorization(600851475143L);
        System.out.println("Problem 3:\t The largest prime factor of the number 600851475143 is " + factors.get(factors.size() - 1).getPrimeNumber());
    }

}
