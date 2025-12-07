package org.example;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        //context.setStrategy(new StrategyImpl1());
        //context.setStrategy(new StrategyImpl2());
        context.setStrategy(new StrategyImpl3());

        context.effectuerOperation();
    }
}