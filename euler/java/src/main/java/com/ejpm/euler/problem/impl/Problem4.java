package com.ejpm.euler.problem.impl;

import com.ejpm.euler.problem.Problem;
 
	/**
	 * A palindromic number reads the same both ways.
	 *  The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
	 *  Find the largest palindrome made from the product of two 3-digit numbers.
	 */
public class Problem4 implements Problem {

    @Override
    public void execute() {
		int Lproduct = 0;

		for(int i = 100; i < 1000;i++){
			for(int j = 100; j < 1000; j++){
				int result = i * j;
				String aux = ""+result;
				if(isPalindrome(aux)&& result > Lproduct){
					Lproduct = result;
				}
			}
		}

		System.out.println("Largest Palindrome: "+Lproduct);
    }

	public static boolean isPalindrome(String a){
		if(a.length() != 6)
			return false;
		else{
			String aux1 = a.substring(0, 3);
			String aux2 = a.substring(3);
			String inv = "";
			for(int i = aux2.length()-1; i>=0; i -- ){
				inv += aux2.charAt(i);
			}
			return aux1.equals(inv);
		}
	}

}
