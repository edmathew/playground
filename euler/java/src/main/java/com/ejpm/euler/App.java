package com.ejpm.euler;

import com.ejpm.euler.problem.impl.Problem1;
import com.ejpm.euler.problem.impl.Problem2;
import com.ejpm.euler.problem.impl.Problem3;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    @SuppressWarnings("unused")
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        new App().proceed();
    }

    public void proceed() {
        System.out.println("Project Euler Solutions");
        //final Reflection
        
        new Problem1().execute();
        new Problem2().execute();
        new Problem3().execute();
    }
}
