package com.ejpm.euler.problem.impl;

import com.ejpm.euler.problem.Problem;
 
	/**
	 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
	 * 		a^(2) + b^(2) = c^(2)
	 * 
	 * For example, 3^(2) + 4^(2) = 9 + 16 = 25 = 5^(2).
	 * 
	 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	 * Find the product abc.
	 */
public class Problem9 implements Problem {
    
 
    @Override
    public void execute() {
int c1 = 0;
		int c2 = 0;
		int h = 0;

		for(int i = 1; i < 500; i++){
			for(int j = 1; j < 500; j++){
				for(int z = 1; z < 500; z++){
					if(ePitagorico(i, j, z))
						if((i+j+z)== OBJ){
							c1 = i;
							c2 = j;
							h = z;
							break;
						}		
				}
				
				if(respEncontrada(c1, c2, h))
					break;
			}
			if(respEncontrada(c1, c2, h))
				break;
		}
		
		int product = c1*c2*h;
		
		System.out.println("Hipotenusa: "+h);
		System.out.println("Cateto 1: "+c1);
		System.out.println("Cateto 2: "+c2);
		
		System.out.println("Product abc = "+product);
    }

	 
	public static final int OBJ = 1000;

	public static boolean ePitagorico(int a, int b, int c){
		int h = (int) Math.pow(c, 2);
		int l = (int) (Math.pow(a,2) + Math.pow(b, 2));

		return h == l;
	}
	
	public static boolean respEncontrada(int a, int b, int c){
		return !(a == 0 && b == 0 && c == 0);
	}
  	}  