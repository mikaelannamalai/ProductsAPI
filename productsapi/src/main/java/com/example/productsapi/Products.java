package com.example.productsapi;

public class Products {
  private String name;
  private int quantity;
  private String description;

  //   Products(String name, int quantity, String description) {
  //     this.name = name;
  //     this.quantity = quantity;
  //     this.description = description;
  //   }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = name;
  }
}
