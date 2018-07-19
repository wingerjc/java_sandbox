package com.example.food;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.Matchers.greaterThan;

public class PriceFinderTest {

  @Test
  public void price_finder_has_bananas() {
    PriceFinder p = new PriceFinder();

    Assert.assertThat(
        p.getPrice("Banana"),
        is(greaterThan(0.0))
    );
  }
}
