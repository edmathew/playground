package com.ejpm.euler.problem.impl;

import com.ejpm.euler.problem.Problem;
import static com.ejpm.euler.math.SequencesSum.sumAllDivisibleBy;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * @author edgar.mateus
 */
public class Problem1 implements Problem {

    @Override
    public void execute() {
        System.out.println("Problem 1:\t The sum of all the multiples of 3 or 5 below 1000 is " + sumAllMultiplesOf3Or5BellowN(1000));
    }

    public int sumAllMultiplesOf3Or5BellowN(final int n){
        return sumAllDivisibleBy(3, n) + sumAllDivisibleBy(5, n) - sumAllDivisibleBy(15, n);
    }

}
