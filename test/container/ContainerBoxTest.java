/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Ainur
 */
public class ContainerBoxTest {
    
    public ContainerBoxTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("  Тест для Коробки");
    }
    
  @Test
  public void testAddInOpenBox(){
       System.out.println("Test: testAddInOpenBox()");
      String type = "Плоский";
      Item item1 = new Item("Тетрадка", type, 0.2f);
      Item item2 = new Item("Тетрадка", type, 0.2f);
      Item item3 = new Item("Тетрадка", type, 0.2f);
      Item item4 = new Item("Тетрадка", type, 0.2f);
      Box box1 = new Box("Тетрадка",5,0.1f);
      box1.add(item1);
      box1.openBox(false);
      try {
          box1.add(item4);
      } catch (UnsupportedOperationException e) {
      }
      assertTrue(item1.equals(box1.get()));
      
  }

      @Test
    public void testAddCorrect(){
        System.out.println("Test: addCorrect()");
        String type = "Плоский";
        Item item1 = new Item("Тетрадка",type,0.2f);
        Item item2 = new Item("Тетрадка",type,0.2f);
        Item item3 = new Item("Тетрадка",type,0.2f);
        Item item4 = new Item("Тетрадка",type,0.2f);
        //ox(String name, float maxWeight, float weight
        Box box1 = new Box("Тетрадка",5,0.1f);
        box1.add(item1);
        Stack stack1 = new Stack("Стопка тетрадей",2);
        stack1.add(item2);
        stack1.add(item3);
        box1.add(item4);
        box1.add(stack1);
        assertTrue(stack1.isSelected());
    }
    @Test(expected = ArrayStoreException.class)
    public void testAddInCorrect() {
        System.out.println("Test: testAddInCorrect()");
        String type = "Плоский";
        Item item1 = new Item("Тетрадка",type,0.2f);
        Box box1 = new Box("Тетрадка",5,0.1f);
        box1.add(item1);
        box1.add(item1);
    }
    
    
}
