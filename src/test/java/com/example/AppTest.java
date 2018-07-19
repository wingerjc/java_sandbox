package com.example;

import com.example.food.Food;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class AppTest {
  @Test
  public void dummy_test() {
    App.main(null);
  }

  @Test
  public void create_app() {
    App a = new App();
  }

  @Test
  public void eat_food() {
    Food f = Mockito.mock(Food.class);

    when(f.name())
        .thenReturn("apple");
    when(f.bitesLeft())
        .thenReturn(3, 0);
    when(f.bite())
        .thenReturn(2);
    when(f.priceInDollars())
        .thenReturn("$5.50");
    doNothing()
        .when(f).eatAll();
    App.eatFood(f);
  }
}
