package com.example.productsapi;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductObjectManagerTests {

  @Test
  public void shouldAnswerWithTrue() throws Exception {
    String args[] = new String[1];
    args[0] = "Apple";
    args[1] = "10";
    args[2] = "Sparta";
    args[3] = "save";
    Products testPd = Products.getInstance();
    testPd.setName(args[0]);
    testPd.setQuantity(args[1]);
    testPd.setDescription(args[2]);
    String result = testPd.getName();
    assertNotNull("Apple", result);
  }
}
