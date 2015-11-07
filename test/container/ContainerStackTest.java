/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

import java.util.NoSuchElementException;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ainur
 */
public class ContainerStackTest {
    String type="Плоский";
    public ContainerStackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("  Тест для Стопки");
    }
    
    /**
     * Test of add method, of class Stack.
     */
      @Test
    public void testAddCorrect() {
        System.out.println("Test: testAddCorrect()");
        Item item1 = new Item("Книга 1", type, 1);
        Item item2 = new Item("Книга 2", type, 1);
        Item item3 = new Item("Книга 3", type, 1);
        Item item4 = new Item("Книга 4", type, 1);
        Item item5 = new Item("Книга 5", type, 1);
        Stack stack1 = new Stack("Стопка1", 6);//стопка из 5 предметов
        stack1.add(item1);
        stack1.add(item2);
        stack1.add(item3);
        stack1.add(item4);
        stack1.add(item5);
        try {
            stack1.add(item1);
            stack1.add(stack1);
        } catch (RuntimeException e) {
            System.out.println(e.toString());
        }
        assertTrue(item5.equals(stack1.get()));
    }
    
    @Test(expected = ArrayStoreException.class)
    public void testAddAllTpeItem() {
        System.out.println("Test: testAddAllTpeItem()");
        Item item1 = new Item("", type, 1);
        Item item2 = new Item("Барби", "игрушка", 1);
        Stack stack1 = new Stack("Стопка1", 5);//стопка из 5 предметов
        stack1.add(item1);
        stack1.add(item2);
    }
    
   @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testAddInCorrect() {
        System.out.println("Test: testAddInCorrect()");
        Item item1 = new Item("",type,1);
        Item item2 = new Item("",type,1);
        Item item3 = new Item("",type,1);
        Item item4 = new Item("",type,1);
        Item item5 = new Item("",type,1);
        Item item6 = new Item("",type,1);
        Stack stack1 = new Stack("Стопка1",5);//стопка из 5 предметов
        stack1.add(item1);
        stack1.add(item2);
        stack1.add(item3);
        stack1.add(item4);
        stack1.add(item5);
        stack1.add(item6); 
        assertTrue(stack1.getTop()==-1);
    }

    /**
     * Test of get method, of class Stack.
     */
    @Test
    public void testGetCorrect() {
        System.out.println("Test: testGetCorrect()");
        Item item1 = new Item("",type,1);
        Item item2 = new Item("",type,1);
        Item item3 = new Item("",type,1);
        Item item4 = new Item("",type,1);
        Item item5 = new Item("",type,1);
        Stack stack1 = new Stack("Стопка1",5);//стопка из 5 предметов
        stack1.add(item1);
        stack1.add(item2);
        stack1.add(item3);
        stack1.add(item4);
        stack1.add(item5);
        assertTrue(item5.equals(stack1.get()));
        assertTrue(item4.equals(stack1.get()));
        assertTrue(item3.equals(stack1.get()));
        assertTrue(item2.equals(stack1.get()));
        assertTrue(item1.equals(stack1.get()));
    }

    /**
     * Test of isEmpty method, of class Stack.
     */
    @Test(expected = NoSuchElementException.class)
    public void testIsEmpty() {
        System.out.println("Test: testIsEmpty()");
        Stack stack1 = new Stack("Стопка1", 5);//стопка из 5 предметов
        stack1.get();
    }
    @Test
      public void testIsSelected() {
        System.out.println("Test: testIsSelected()");
        Stack stack1 = new Stack("Стопка1", 5);//стопка из 5 предметов
        Stack stack2 = new Stack("Стопка2", 2);//стопка из 5 предметов
        stack1.add(stack2);
        assertTrue(stack2.isSelected());
    }
}
