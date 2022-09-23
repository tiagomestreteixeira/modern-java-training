package com.designpatterns.decorator;


interface Burger {
    void makeBurger();
}

class PlainBurger implements Burger {
    @Override
    public void makeBurger() {
        System.out.println("Plain Burger is ready.");
    }
}

abstract class BurgerDecorator extends PlainBurger {
    protected Burger burger;

    public BurgerDecorator(Burger burger) {
        this.burger = burger;
    }

    @Override
    public void makeBurger() {
        super.makeBurger();
    }
}

class CheeseBurgerDecorator extends BurgerDecorator {
    public CheeseBurgerDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public void makeBurger() {
        burger.makeBurger();
        System.out.println(", cheese added.");
    }
}

class BarbecueBurgerDecorator extends BurgerDecorator {
    public BarbecueBurgerDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public void makeBurger() {
        burger.makeBurger();
        System.out.println(", vegetables and cheese added.");
    }
}

public class DecoratorDesignPattern {
    public static void main(String[] args) {
        Burger burger = new PlainBurger();

        new CheeseBurgerDecorator(burger).makeBurger();
        new BarbecueBurgerDecorator(burger).makeBurger();

    }
}
