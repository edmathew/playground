package com.ejpm.euler.problem.impl;

import com.ejpm.euler.problem.Problem;
 
public class Problem25 implements Problem {

    private final static boolean EXEC = false;

    @Override
    public void execute() {
        if(!EXEC){
           System.out.println("Problem 25 skipped. Needs performance mprov");
           return;
        }
		long count = 0;
		boolean continues = true;
		
		while(continues){
			long aux =  fibonnaci(count);
			String s = ""+aux;
			if(s.length() == 1000)
				continues = false;
			
			count ++;
		}
		
		System.out.println("Problem25: "+count);
    }
    
      private static long fibonnaci(long mes) {
         if (mes == 0) {
             return 0;
         } else if (mes == 1) {
             return 1;
         } else {
             return fibonnaci(mes - 1) + fibonnaci(mes - 2);
         }
     }

}
