package com.ejpm.euler.problem.impl;

import com.ejpm.euler.problem.Problem;
 

	/**
	 * Starting in the top left corner of a 2×2 grid, there are 6 routes (without backtracking)
	 * to the bottom right corner.
	 * 
	 * How many routes are there through a 20×20 grid?
	 */
public class Problem15 implements Problem {
    

	private static int [][]matriz = new int [21][21];

	public static int calcCaminho(int i, int j){
		System.out.println("i: "+i+" j: "+j);
		if(i == matriz.length -1 && j == matriz[i].length-1)
			return 1;
		else
			if(i != matriz.length -1){
				if(j != matriz[i].length -1)
					return calcCaminho(i,j+1)+ calcCaminho(i+1,j);
				else
					return calcCaminho(i+1,j);
			}else{
				return calcCaminho(i,j+1);
			}
	}

     private final static boolean EXEC = false;

    @Override
    public void execute() {
        if(!EXEC){
           System.out.println("Problem 15 skipped. Needs performance mprov");
           return;
        }
		long count = calcCaminho(0,0);

		System.out.println("Problem15: "+count);
    }
 
}
