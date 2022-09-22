package com.designpatterns.strategy;

public class StrategyDesignPattern {
    public static void main(String[] args) {
        Context c = new Context();
        c.setCompressionStrategy(new CompressToRar());
        c.generateFile("Abc.text");
    }
}
