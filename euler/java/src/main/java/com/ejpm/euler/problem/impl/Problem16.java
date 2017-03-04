package com.ejpm.euler.problem.impl;

import com.ejpm.euler.problem.Problem;
import java.math.BigInteger;
 
 
public class Problem16 implements Problem {

    @Override
    public void execute() {
		long ini = System.currentTimeMillis();  
		BigInteger potencia = BigInteger.valueOf(2).pow(1000);

		System.out.println(potencia);

		String aux = ""+potencia;
		int soma = 0;

		for(int i = 0; i< aux.length(); i++){
			soma += Double.parseDouble(aux.charAt(i)+"");
		}

		System.out.println("Soma: "+soma);
		long fim = System.currentTimeMillis();  
		System.out.println("Problem16 TEMPO: " + (fim - ini));      }

 

}
