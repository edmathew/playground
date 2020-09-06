package com.ejpm.smoothies;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SmoothieTest {

  @Test
  public void classicSmoothie() {
    assertEquals("banana,honey,mango,peach,pineapple,strawberry",
            Smoothie.ingredients("Classic"));
  }

  @Test
  public void classicSmoothieWithoutStrawberry() {
    assertEquals("banana,honey,mango,peach,pineapple",
            Smoothie.ingredients("Classic,-strawberry"));
  }
  
    @Test
  public void classicSmoothieWithoutStrawberryAndPeanut() {
    assertEquals("banana,honey,mango,peach,pineapple",
            Smoothie.ingredients("Classic,-strawberry,-peanut"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void weDontSupportAdditionalProductYet() {
    assertEquals("banana,honey,mango,peach,pineapple",
            Smoothie.ingredients("Classic,-strawberry,banana"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void shouldThrowErrorInCaseOrderIsEmpty() {
    Smoothie.ingredients("");
  }

  @Test(expected = IllegalArgumentException.class)
  public void shouldThrowErrorInCaseOrderIsNull() {
    Smoothie.ingredients(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void shouldThrowErrorIfProductIsNotKnown() {
    Smoothie.ingredients("balele");
  }
}
