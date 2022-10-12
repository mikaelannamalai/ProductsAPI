package com.example.productsapi;

import java.util.ArrayList;

public class Products {
  private String name;
  private String quantity;
  private String description;
  private static Products instance;
  private String save;
  ArrayList<Products> productsList = new ArrayList<Products>();

  public static final Products getInstance() {
    if (instance == null) instance = new Products();
    return instance;
  }

  Products() {}

  Products(String name, String quantity, String description) {
    this.name = name;
    this.quantity = quantity;
    this.description = description;
  }

  public String save(Products prod) {
    productsList.add(prod);
    String result =
      prod.getName() +
      " , " +
      prod.getQuantity() +
      " , " +
      prod.getDescription();
    return result;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = name;
  }
}
