/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package pricedisplay;

import org.junit.Test;
import static org.junit.Assert.*;

public class PriceDisplayTest {
    @Test public void getPriceLabel() {
        PriceDisplay pricedisplay = new PriceDisplay();
        assertEquals("coffee machine is 15.99",
         String.valueOf("The price for the item Coffee Machine is 15.99 \n"), 
         pricedisplay.getPriceLabel("Coffee Machine",15.99));
    }
}
