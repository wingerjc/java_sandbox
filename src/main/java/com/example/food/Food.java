package com.example.food;

import java.util.NoSuchElementException;

/** An edible object that can be bought at a store. */
public interface Food {

  /** The number of bites left in
   *
   * @return Bites left in this food.
   */
  int bitesLeft();

  /** The total number of bites this food had when created.
   *
   * @return Total bites this food had at creation.
   */
  int totalBites();

  /** Take one bite of the food.
   * If there are no bites left, throw
   *
   * @return The number of bites left in the food.
   * @throws NoSuchElementException when there are no bites left.
   */
  int bite() throws NoSuchElementException;

  /** Take a specified number of bites from this food.
   * If the food has
   *
   * @param numBites The number of bites of food to take.
   * @return The number of bites left in the food.
   * @throws IndexOutOfBoundsException and does not take any bites when
   *         numBites is greater than the number of bites left in the food.
   */
  int bite(int numBites) throws IndexOutOfBoundsException;

  /** Eat the rest of the food. No exceptions are thrown when
   *  the food is already completely eaten.
   */
  void eatAll();

  /** The weight of the food in grams.
   *
   * @return Weight in grams
   */
  int getWeight();

  /** The name of the food.
   *
   * @return Food name.
   */
  String name();

  /** The price of the food in dollars.
   *
   * @return A formatted price string in US dollars.
   */
  String priceInDollars();
}
