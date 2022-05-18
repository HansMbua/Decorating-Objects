package com.Love.ToCode;

public class Main {

    public static void main(String[] args) {
	Beverage beverage = new Espresso();

       beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription()+" $"+ beverage.cost());
        System.out.println();

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription()+" $"+ beverage1.cost());
    }
}
