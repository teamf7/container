/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Ainur
 */
public class ContainerItem {
     @BeforeClass
    public static void setUpClass() {
        System.out.println("  Тест для Предмета");
    }
      @Test
    public void testCorrectDataInput() {
        Item item1 = new Item("Плитка1", "Плоский", 2);
        Item item2 = new Item("Плитка2", "Плоский", 2);
        Item item3 = new Item("Плитка3", "Плоский", 2);
        System.out.println("Test: testCorrectDataInput()");
        assertEquals(item1.getName(), "Плитка1");
        assertEquals(item2.getType(), "Плоский");
        float weight = item3.getWeight();
        assertTrue(weight == 2f);
    }
}
