package com.example.productsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductObjectManager {

  public static void main(String[] args) throws Exception {
    SpringApplication.run(ProductObjectManager.class, args);
    Products prod = Products.getInstance();
    try {
      String name = args[0];
      String quantity = args[1];
      String description = args[2];
      String save = args[3];
      prod.setName(name);
      prod.setQuantity(quantity);
      prod.setDescription(description);
      System.out.println(prod.save(prod));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
