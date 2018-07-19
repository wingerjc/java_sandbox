package com.example.food;

import lombok.Value;

@Value
/** Measurements about a food. */
public class FoodMetric {

  /** The weight in grams of a food. */
  private int gramWeight;

  /** The density in g/cm^3 of a food. */
  private double density;
}
