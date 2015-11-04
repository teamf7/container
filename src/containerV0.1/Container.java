/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Айнур
 */
public abstract class Container extends Item implements Functionality {

    private final ArrayList items = new ArrayList();

    public Container() {
        setSelected(false);
        setName("Name isn't");
        setSize(0.0f);

    }

    public ArrayList getItems() {
        return items;
    }

    public float getMaxSize() {
        float maxSize = getSize();
        for (Object item : items) {
            maxSize += ((Item) item).getSize();
        }
        return maxSize;
    }

    @Override
    public void print() {
        System.out.println(getName() + " содержит: ");
        Iterator iterator = items.iterator();
        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            System.out.println("   " + item.toString());
        }

    }

    @Override
    public String toString() {
        return "Контейнер: " + getName() + " Вес с предметами: " + getMaxSize() + " Тип предмета: " + getTypeItem();
    }

}
