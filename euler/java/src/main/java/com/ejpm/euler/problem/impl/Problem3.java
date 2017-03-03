package com.ejpm.euler.problem.impl;

import com.ejpm.euler.problem.Problem;
 
/**
 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime
 * factor of the number 600851475143 ?
 *   @author edgar.mateus
 */
public class Problem3 implements Problem {

    @Override
    public void execute() {
		int maior = 0;
		long num = 600851475143L;
		int count = 1;
		
		do{
			if(num % count == 0 && ePrimo(count)){
				num = num / count;
				maior = count;
			}
			count ++;
			
		}while(num != 1);
		
		System.out.print("Largest Prime Factor: "+maior);
    }

	public static boolean ePrimo(int num){
		int contador = 0;
		int divisor = num;
		
		do{
			if(num % divisor == 0)
				contador ++;
			
			divisor --;
		}while(divisor >= 1);
		
		return contador == 2;
		
	}

}
