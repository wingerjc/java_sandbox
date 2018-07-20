package com.example.food;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.NoSuchElementException;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

public class FruitTest {

  @Mock
  FoodMetric metric;

  @Mock
  PriceFinder priceFinder;

  String name = "Watermelon";

  @Before
  public void setup() {
    MockitoAnnotations.initMocks(this);
    //metric = Mockito.mock(FoodMetric.class);
  }

  @Test
  public void take_one_bite_succeeds_when_a_lot_of_food() {
    doReturn(15).when(metric).getGramWeight();
    doReturn(1.0).when(metric).getDensity();
    Fruit f = new Fruit(metric, priceFinder, name);

    int bitesLeft = f.bite();

    assertThat(bitesLeft, is(equalTo(4)));
  }

  @Test
  public void take_one_bite_throws_exception_when_none_left() {
    doReturn(0).when(metric).getGramWeight();
    doReturn(1.0).when(metric).getDensity();
    Fruit f = new Fruit(metric, priceFinder, name);

    try {
      f.bite();
      fail();
    } catch (NoSuchElementException nse) {}

  }

  @Test
  public void bites_left_is_accurate_when_nothing_has_been_eaten() {
    doReturn(15).when(metric).getGramWeight();
    doReturn(1.0).when(metric).getDensity();

    Fruit f = new Fruit(metric, priceFinder, name);

    int bitesLeft = f.bitesLeft();

    assertThat(bitesLeft, is(equalTo(5)));
  }

  @Test
  public void price_in_dollars_returns_string_value_when_set() {
    doReturn(15).when(metric).getGramWeight();
    doReturn(1.0).when(metric).getDensity();
    doReturn(10.0).when(priceFinder).getPrice(any());

    Fruit f = new Fruit(metric, priceFinder, name);

    String price = f.priceInDollars();

    assertThat(price, is(equalTo("$10.00")));
  }


  @Test
  public void show_spies() {
    doReturn(15).when(metric).getGramWeight();
    doReturn(1.0).when(metric).getDensity();
    doReturn(10.0).when(priceFinder).getPrice(any());

    Fruit f = Mockito.spy(new Fruit(metric, priceFinder, name));

    doReturn(4).when(f).process(anyInt());

    f.name();
  }
}
