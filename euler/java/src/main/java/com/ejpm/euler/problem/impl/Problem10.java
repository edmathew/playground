package com.ejpm.euler.problem.impl;

import com.ejpm.euler.math.SequencesSum;
import com.ejpm.euler.problem.Problem;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17. Find the sum of all the
 * primes below two million.
 */
public class Problem10 implements Problem {

    @Override
    public void execute() {
        System.out.println("Problem 10:\t The sum of all the primes bellow 2 Million is " + SequencesSum.sumAllPrimeNumbersUnder(2000000));
    }
}
