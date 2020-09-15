package com.ejpm.data.structures;

import static org.junit.Assert.assertEquals;
 import org.junit.Test;


public class TreeTest {

  @Test
  public void secondLowestIsFour() {
    Tree t = new Tree(4);
    t.insert(3);
    t.insert(7);
    t.insert(9);
    assertEquals(3, t.getLowest());
    assertEquals(4, t.getSecondLowest());
  }

  @Test
  public void secondLowestIsSeven() {
    Tree t = new Tree(4);
    t.insert(7);
    t.insert(9);
    assertEquals(4, t.getLowest());
    assertEquals(7, t.getSecondLowest());
  }

  @Test
  public void secondLowestIsFive() {
    Tree t = new Tree(4);
    t.insert(7);
    t.insert(5);
    t.insert(9);
    t.insert(8);
    assertEquals(4, t.getLowest());
    assertEquals(5, t.getSecondLowest());
  }
}
