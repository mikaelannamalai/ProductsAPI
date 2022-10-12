package com.example.productsapi;

import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductObjectManager {

  public static void main(String[] args) throws Exception {
    SpringApplication.run(ProductObjectManager.class, args);
    final Products prod = Products.getInstance();
    try {
      ArrayList<Products> productsList = new ArrayList<Products>();
      String name = args[0];
      String quantity = args[1];
      String description = args[2];
      String save = args[3];
      prod.setName(name);
      prod.setQuantity(quantity);
      prod.setDescription(description);
      if (save == "save") {
        productsList.add(prod);
        System.out.println(
          prod.getName() +
          " , " +
          prod.getQuantity() +
          " , " +
          prod.getDescription()
        );
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
