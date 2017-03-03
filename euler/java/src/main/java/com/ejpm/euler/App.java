package com.ejpm.euler;

import com.ejpm.euler.problem.impl.Problem1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    @SuppressWarnings("unused")
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        new App().proceed();
    }

    public void proceed() {
        System.out.println("Hello World!");
        new Problem1().execute();
    }
}
