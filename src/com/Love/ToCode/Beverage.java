package com.Love.ToCode;

public abstract class Beverage {

    String description = "Unknown Beverages";

    public String getDescription() {
        return description;
    }
    public abstract double cost();

}