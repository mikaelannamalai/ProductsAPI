package ca.vanier;

import java.util.*;

public class Products {
  private String name;
  private String quantity;
  private String description;

  ArrayList<Products> productsList = new ArrayList<Products>();

  Products() {}

  public Products(String name, String quantity, String description) {
    setName(name);
    setQuantity(quantity);
    setDescription(description);
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

  @Override
  public String toString() {
    return (
      "Products [name=" +
      name +
      ", quantity=" +
      quantity +
      ", description=" +
      description +
      "]"
    );
  }
}
