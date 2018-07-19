package com.example.food;

import java.util.HashMap;
import java.util.Map;

/** A service for finding the price of a food. */
public class PriceFinder {
  private final Map<String, Double> prices = new HashMap<>();

  /** Create the default PriceFinder */
  public PriceFinder() {
    prices.put("Banana", 1.15);
  }

  /** Get the price of a given food.
   *
   * @param itemName The name of the food to fetch.
   * @return The price of the food in $USD/kg.
   */
  public double getPrice(String itemName) {
    return prices.get(itemName);
  }
}
