package com.ejpm.euler.problem.impl;

import com.ejpm.euler.problem.Problem;

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
        System.out.println("The sum of all the multiples of 3 or 5 below 1000 is " + sumAllNaturals());
    }

    public int sumAllNaturals() {
        int soma = 0;
        int count = 1;

        do {
            if (count % 3 == 0 || count % 5 == 0) {
                soma = soma + count;
            }

            count++;
        } while (count < 1000);
        
        return soma;
    }

}
