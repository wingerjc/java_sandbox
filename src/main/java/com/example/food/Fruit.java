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
  @Override
  public int bitesLeft() {
    return 0;
  }

  @Override
  public int totalBites() {
    return 0;
  }

  @Override
  public int bite() throws NoSuchElementException {
    return 0;
  }

  @Override
  public int bite(int numBites) throws IndexOutOfBoundsException {
    return 0;
  }

  @Override
  public void eatAll() {
  }

  @Override
  public int getWeight() {
    return 0;
  }

  @Override
  public String name() {
    return "";
  }

  @Override
  public String priceInDollars() {
    return "";
  }
}
