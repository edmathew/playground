package com.ejpm.euler.problem.impl;

import com.ejpm.euler.math.PalindromeUtils;
import com.ejpm.euler.problem.Problem;

/**
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99. Find the largest
 * palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 implements Problem {

    @Override
    public void execute() {
        System.out.println("Problem 4:\t The largest\n"
                + " * palindrome made from the product of two 3-digit number " + calcLargestProductPalindrome(3));

    }

    public int calcLargestProductPalindrome(int nDigits) {
        final int bottom = (int) (Math.pow(10, nDigits - 1));
        final int top = (int) (Math.pow(10, nDigits));

        int result = 0;

        for (int i = top - 1; i >= bottom; i--) {
            for (int j = top - 1; j >= i; j--) {
                final int product = i * j;
                if (product > result) {
                    if (PalindromeUtils.isPalindrome(product)) {
                        result = product;
                    }
                }
            }
        }

        return result;
    }

}
