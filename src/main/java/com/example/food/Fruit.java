package com.example.food;

import java.util.NoSuchElementException;

/** A subclass of food that can be a fruit.
 *
 * <p><b>Notes:</b>
 * <ul>
 *   <li>3 cm^3 is a single bite of food, any food left over counts as one bite.</li>
 *   <li>PriceFinder returns prices in $USD/kg.</li>
 * </ul>
 */
public class Fruit implements Food {

  int totalBites;

  PriceFinder priceFinder;

  String name;

  public Fruit(FoodMetric metric, PriceFinder priceFinder, String name) {
    int weight = metric.getGramWeight();
    double density = metric.getDensity();
    totalBites = (int)Math.ceil(weight / density / 3);

    this.priceFinder = priceFinder;
    this.name = name;
  }

  @Override
  public int bitesLeft() {
    return totalBites;
  }

  @Override
  public int totalBites() {
    return -1;
  }

  @Override
  public int bite() throws NoSuchElementException {
    if (totalBites <= 0) {
      throw new NoSuchElementException();
    }
    totalBites -= 1;
    return totalBites;
  }

  @Override
  public int bite(int numBites) throws IndexOutOfBoundsException {
    return -1;
  }

  @Override
  public void eatAll() {
  }

  @Override
  public int getWeight() {
    return -1;
  }

  @Override
  public String name() {
    System.out.println(this.process(name.length()));
    return name;
  }

  @Override
  public String priceInDollars() {
    double pricePerKg = priceFinder.getPrice(name);

    return String.format("$%.2f", pricePerKg);
  }

  protected int process(int i) {
    return i + 7;
  }
}
