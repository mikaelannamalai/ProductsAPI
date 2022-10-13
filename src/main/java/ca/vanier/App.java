package ca.vanier;

/**
 * Hello world!
 *
 */
public class App {

  public static void main(String[] args) {
    try {
      ProductsObjectManager ProdManager = new ProductsObjectManager();
      String name = args[0];
      String quantity = args[1];
      String description = args[2];
      String save = args[3];
      System.out.println("test");
      System.out.println(ProdManager.create(name, quantity, description));
      ProdManager.save();
      //   if (args[3] == "save") {
      //     ProdManager.save();
      //   } else System.out.println("...not saving....");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
