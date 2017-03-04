package com.ejpm.euler.problem.impl;

import com.ejpm.euler.problem.Problem;
 
	/**
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
	 * we can see that the 6^(th) prime is 13.
	 * What is the 10001^(st) prime number?
	 */
	
public class Problem7 implements Problem {
    
    private final static boolean EXEC = false;

    @Override
    public void execute() {
        if(!EXEC){
           System.out.println("Problem 7 skipped. Needs performance mprov");
           return;
        }
		long contador_primos = 0;
		long count = 1;
		long primo_obj = 0;
		
		do{
			if(ePrimo(count))
				contador_primos ++;
			
			if(contador_primos == OBJECTIVO)
				primo_obj = count;
			
			count ++;
		}while(contador_primos < OBJECTIVO );
		
		System.out.println("Problem7: "+primo_obj);
    }

	public static final long OBJECTIVO = 10001;
	
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