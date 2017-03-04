package com.ejpm.euler.problem.impl;

import com.ejpm.euler.problem.Problem;
 
	/**
	 * 2520 is the smallest number that can be divided by each of the numbers
	 *  from 1 to 10 without any remainder.
	 *  
	 *  What is the smallest number that is evenly divisible
	 *   by all of the numbers from 1 to 20?
	 */
public class Problem5 implements Problem {

    @Override
    public void execute() {
		int maior = 0;
		int count = 1;
		
		do{
			if(divisivel(count))
				maior = count;
			
			count ++;
		}while(maior == 0);
		
		System.out.println("Resultado: "+maior);
    }

	public static boolean divisivel(long a){
		for(int i = 1; i <= 20; i++){
			if(a % i != 0)
				return false;
		}
		
		
		return true;
	}
	
}
