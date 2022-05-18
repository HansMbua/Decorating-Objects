package com.Love.ToCode;

import java.text.DecimalFormat;

public class Decaf extends Beverage{


    public Decaf(){
        description = "Decaf";

    }
    @Override
    public double cost() {
        return 1.99;
    }
}
