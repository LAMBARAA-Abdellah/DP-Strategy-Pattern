package org.example;

public class Context {
    private Strategy strategy;

    public void effectuerOperation(){
        System.out.println("*************************");
        strategy.operationStrategy();
        System.out.println("-------------------------");
        System.out.println("=========================");
    }
}
