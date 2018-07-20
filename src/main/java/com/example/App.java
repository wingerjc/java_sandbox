package com.example;

import com.example.food.Food;
import com.example.food.FoodMetric;
import com.example.food.PriceFinder;

public class App {

  public static void main(String[] args) {
    FoodMetric m = new FoodMetric()
        .setGramWeight(250)
        .setDensity(0.95);
    PriceFinder p = new PriceFinder();
    // Food f = new Fruit("Banana", m, p);
    // eatFood(f);
  }

  public static void eatFood(Food f) {
    System.out.println(String.format("I have a %s, with %d bites.", f.name(), f.bitesLeft()));
    System.out.println(String.format("My %s cost me %s", f.name(), f.priceInDollars()));
    System.out.println();
    System.out.println("I will take a bite.");
    f.bite();
    System.out.println(String.format("Now I have %d bites left.", f.bitesLeft()));
    System.out.println();
    System.out.println("Lets eat the rest of this fruit!");
    f.eatAll();
    System.out.println(String.format("Now I have %d bites left.", f.bitesLeft()));
    System.out.println(String.format("Boy that was a tasty %s", f.name()));
  }
}
