/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Ainur
 */
public class ContainerBagTest {

    Container bag;
    Item item1;
    Item item2;
    Item item3;
    public ContainerBagTest() {
        item1 = new Item("Плитка1", "Плоский", 2);
        item2 = new Item("Плитка2", "Плоский", 2);
        item3 = new Item("Плитка3", "Плоский", 2);
        bag = new Bag("коробка", 15, 0.2f);
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("  Тест для Пакета");
    }

    @After
    public void tearDown() {
        bag.clear();
    }
    
    @Test
    public void testAllContainer() {
        Item item4 = new Item("Тетрадка1","Плоский",2);
        Item item5 = new Item("Тетрадка2","Плоский",2);
        Item item6 = new Item("Тетрадка3","Плоский",2);
        Item item7 = new Item("Блокнот","Плоский",2);
        Item item8 = new Item("Листок","Плоский",2);
        Box box = new Box("Коробка1",100,1);
        Stack stack = new Stack("Придмет",5);
        bag.add(item1);
        bag.add(item2);
        bag.add(item3);
        bag.add(box);
        
        box.add(item4);
        box.add(stack);
        stack.add(item5);
        stack.add(item6);
        stack.add(item7);
        //stack.add(item8);
        float expResult = 15.2F;
        float result = bag.getWeight();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testGet_0args() {
        System.out.println("Test: get");
        bag.add(item1);
        bag.add(item2);
        Item expResult = item1;
        Item result = bag.get();
        assertEquals(expResult, result);

    }
     @Test
    public void testGetWeight() {
        System.out.println("Test: getWeight");
        bag.add(item1);
        bag.add(item2);
        bag.add(item3);
        float expResult = 6.2F;
        float result = bag.getWeight();
        assertEquals(expResult, result, 0.0);
    }

       @Test
    public void testGet_int() {
        System.out.println("Test: get");
        int i = 0;
        bag.add(item1);
        bag.add(item2);
        Item expResult = item1;
        Item result = bag.get(i);
        assertEquals(expResult, result);
    }
    
      @Test
    public void testSize() {
        System.out.println("Test: size");
        int expResult = 0;
        int result = bag.size();
        assertEquals(expResult, result);

    }
    @Test
    public void testIsHaveWeight() {
        System.out.println("Test: isFull");
        boolean expResult = true;
        boolean result = bag.isHaveWeight();
        assertEquals(expResult, result);
    } 

    
    @Test(expected = ArrayStoreException.class)
    public void testCorrectAddItem() {
        System.out.println("Test: testCorrectAddItem()");
        bag.add(item1);
        bag.add(item2);
        bag.add(item3);
        Container bag1 = new Bag("Мешок2",14,1.2f);
        bag.add(bag1);
        bag1.add(item1);
        bag.add(item1);
    }

    @Test
    public void testCorrectWeight() {
        System.out.println("Test: testCorrectWeight()");
        bag.add(item1);
        bag.add(item2);
        bag.add(item3);
        Container bag1 = new Bag("Мешок2", 12, 1f);
        bag.add(bag1);
        Item item5 = new Item("Плитка5", "Плоская", 2);
        bag1.add(item5);
        assertTrue(bag.getWeight() == 9.2f);
    }
@Test (expected = ArrayIndexOutOfBoundsException.class)
    public void testErrorWeight() {
        System.out.println("Test: testErrorWeight()");
        bag.add(item1);
        bag.add(item2);
        bag.add(item3);
        Container bag1 = new Bag("Мешок2", 12, 2f);
        bag.add(bag1);
        Item item5 = new Item("Плитка5", "Плоская", 2);
        Item item6 = new Item("Плитка6", "Плоская", 2);
        Item item7 = new Item("Плитка7", "Плоская", 2);
        Item item8 = new Item("Плитка8", "Плоская", 2);
        Item item9 = new Item("Плитка9", "Плоская", 2);
        bag1.add(item5);
        bag1.add(item6);
        bag1.add(item7);
        bag1.add(item8);
        bag1.add(item9);
       
    }
}
