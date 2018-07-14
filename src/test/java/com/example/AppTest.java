package com.example;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

public class AppTest {
  @Test
  public void dummy_test() {
    App.main(null);
    assertTrue(true);
  }

  @Test
  public void double_name() {
    App app = new App();
    String result = app.doubleName();

    assertEquals("foo foo", result);
  }

  @Test
  public void do_mocks() {
    App a = Mockito.mock(App.class);
    doReturn("abcd").when(a).doubleName();

    App.app = a;
    App.main(null);

    verify(a).doubleName();

  }
}
