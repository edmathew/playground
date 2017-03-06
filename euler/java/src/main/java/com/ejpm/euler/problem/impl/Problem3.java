package com.ejpm.euler.problem.impl;

import com.ejpm.euler.math.prime.PrimeNumber;
import com.ejpm.euler.problem.Problem;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime
 * factor of the number 600851475143 ?
 *
 * @author edgar.mateus
 */
public class Problem3 implements Problem {

    @Override
    public void execute() {
        final int [] factors = PrimeNumber.primeFactorization(600851475143L);
        System.out.println("Problem 3:\t The largest prime factor of the number 600851475143 is " + factors[factors.length - 1]);
    }

}
