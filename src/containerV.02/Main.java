/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Айнур
 */
public class Main {
    /*public static void main(String[] args){
        main start = new main();
        Inventory inventory = new Inventory();
        
        start.initialization(inventory);
        inventory.getInventory();
        start.print(inventory);
    }
    */
    public void print(Inventory inventory){
        for(Iterator i=inventory.getInventory().iterator();i.hasNext();){
        Container container =(Container)i.next();
        System.out.println(container.getNameContainer());
        }
    }
    public Inventory  initialization(Inventory inventory){
        Map properties = new HashMap();
        properties.put("кирпич 1", 3);
        properties.put("кирпич 2", 1);
        properties.put("кирпич 3", 3);
        inventory.addContainer("Стопка", 22, new ContainerSpec(properties));
        return inventory;
        
    }
}
