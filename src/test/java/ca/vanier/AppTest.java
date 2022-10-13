package ca.vanier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

  /**
   * Rigorous Test :-)
   */
  @Test
  public void shouldAnswerWithTrue() {
    assertTrue(true);
  }

  @Test
  public void shouldAnswerNotNull() throws Exception {
    String args[] = new String[4];
    args[0] = "Apple";
    args[1] = "10";
    args[2] = "Sparta";
    args[3] = "save";
    ProductsObjectManager testPd = new ProductsObjectManager();
    String result = testPd.create(args[0], args[1], args[2]);

    assertNotNull("Apple", result);
  }

  @Test
  public void shouldAnswerTrue() throws Exception {
    String args[] = new String[4];
    args[0] = "Apple";
    args[1] = "10";
    args[2] = "Sparta";
    args[3] = "save";
    ProductsObjectManager testPd = new ProductsObjectManager();
    testPd.create(args[0], args[1], args[2]);
    String result = testPd.List.get(0).getName();
    assertEquals("Apple", result);
  }
}
