package com.ejpm.euler.problem.impl;

import com.ejpm.euler.math.prime.PrimeSequence;
import com.ejpm.euler.problem.Problem;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6^(th) prime is 13. What is the 10001^(st) prime number?
 */
public class Problem7 implements Problem {

    @Override
    public void execute() {
        final PrimeSequence sequence = new PrimeSequence();
        for(int i = 0; i < 10000; i ++){
            sequence.getNext();
        }
        System.out.println("Problem 7:\t The 10001 prime number is " + sequence.getNext());
      }
}
