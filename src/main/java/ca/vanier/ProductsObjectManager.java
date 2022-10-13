package ca.vanier;

import java.util.ArrayList;

public class ProductsObjectManager {
  Products product;
  ArrayList<Products> List = new ArrayList<>();

  public ProductsObjectManager() {}

  public String create(String name, String quantity, String description) {
    List.add(new Products(name, quantity, description));
    return "Added to Products:" + name + " " + quantity + " " + description;
  }

  public void save() {
    System.out.print("....saving...........");
    System.out.println(List.toString());
  }
}
