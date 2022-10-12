package com.example.productsapi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class ProductObjectManagerTests {

  @Test
  public void shouldAnswerNotNull() throws Exception {
    String args[] = new String[4];
    args[0] = "Apple";
    args[1] = "10";
    args[2] = "Sparta";
    args[3] = "save";
    Products testPd = Products.getInstance();
    testPd.setName(args[0]);
    testPd.setQuantity(args[1]);
    testPd.setDescription(args[2]);
    String result = testPd.getName();
    assertEquals("Apple", result);
  }

  @Test
  public void shouldAnswerTrue() throws Exception {
    String args[] = new String[4];
    args[0] = "Apple";
    args[1] = "10";
    args[2] = "Sparta";
    args[3] = "save";
    Products testPd = Products.getInstance();
    testPd.setName(args[0]);
    testPd.setQuantity(args[1]);
    testPd.setDescription(args[2]);
    String result = testPd.getName();
    assertEquals("Apple", result);
  }
}
