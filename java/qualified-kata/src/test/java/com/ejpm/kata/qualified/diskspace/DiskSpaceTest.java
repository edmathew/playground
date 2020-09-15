package com.ejpm.kata.qualified.diskspace;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DiskSpaceTest {

  @Test
  public void test1() {
    assertTrue(DiskSpace.isWritable(1, 1, new HashSet<>()));
  }

  @Test
  public void test2() {
    assertFalse(DiskSpace.isWritable(1, 1, new HashSet<>(Arrays.asList(1))));
  }

  @Test
  public void test3() {
    assertTrue(DiskSpace.isWritable(4, 2, new HashSet<>(Arrays.asList(1, 4))));
  }

  @Test
  public void test4() {
    assertTrue(DiskSpace.isWritable(1000000, 100001, new HashSet<>(Arrays.asList(100000, 200000, 300000, 700000, 800000, 900000))));
  }

}
