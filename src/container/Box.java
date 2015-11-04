/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

/**
 *
 * @author Ainur
 */
public class Box extends Container {

    public Box(String name, float maxWeight, float weight) {
        super(name, maxWeight, weight);
        setType("Плоский");
    }

    public void add(Item item) {
        if ("Плоский".equals(item.getType())) {
            super.add(item);
        }else{
        throw new ArrayStoreException("Предмет не возможно положить, не подходит тип"+item.getType());
        }
    }
}
