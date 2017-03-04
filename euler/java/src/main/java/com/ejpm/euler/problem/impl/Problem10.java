package com.ejpm.euler.problem.impl;

import com.ejpm.euler.problem.Problem;
 
	/**
	 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
	 * Find the sum of all the primes below two million.
	 */
public class Problem10 implements Problem {
    
 
    
    private final static boolean EXEC = false;

    @Override
    public void execute() {
        if(!EXEC){
           System.out.println("Problem 10 skipped. Needs performance mprov");
           return;
        }
		long soma = 0;
		
		for(long count = 1; count < 2000000l;count ++){
			if(ePrimo(count))
				soma += count;
		}
		
		System.out.println("Problem10 Resultado: "+soma);
    }

	 
	public static boolean ePrimo(long num){
		int contador = 0;
		long divisor = num;
		
		do{
			if(num % divisor == 0)
				contador ++;
			
			divisor --;
		}while(divisor > 0);
		
		return contador == 2;
	}
  	}  