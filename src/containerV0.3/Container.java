/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Айнур
 */
public abstract class Container extends Item implements Display {

    private final ArrayList items = new ArrayList();
   
    public Container() {
        setSelected(false);
        setName("Name isn't");
        setWeight(0.0f);
    }
    
    public void add(Item item) {
        if (item.isSelected()) {
            System.out.println("   Ошибка: "+item.getName() + "Уже где-то лежит");
        } else if (items.isEmpty() || !isFull()) {
            item.setSelected(true);
            items.add(item);
        } else {
            error();
        }
    }
    
    public void found(String name) {
        for (int i = 0; i < items.size(); i++) {
            if (((Item) items.get(i)).getName().equals(name)) {
                System.out.println("Найдет предмет ");
                System.out.println(((Item) items.get(i)));
            }
        }
    }
    
    public void pull() {
        if (!isEmpty()) {
            int random = (int) (Math.random() * items.size());
            System.out.println("Мы взяли предмет: ");
            System.out.println(((Item) items.get(random)).toString());
            ((Item) items.get(random)).setSelected(false);
            items.remove(random);

        }
    }
    
    public boolean isEmpty() {
        return items.isEmpty();
    }
    
    public boolean isFull() {
        return 6> getWeight();
    }
    
    public void error() {
        System.out.println("  Ошибка: У мешка есть предельный вес внутри, больше которого добавлять нельзя");
    }
    
    public ArrayList getItems(){
        return items;
    }
    
    @Override
    public float getWeight() {
        float maxSize = getWeight();
        for (Object item : items) {
            if (item instanceof Container) {
                maxSize += ((Container) item).getWeight();
            } else {
                maxSize += ((Item) item).getWeight();
            }
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
        return  getName() + " вес с предметами: " + getWeight() + " Тип предмета: " + getTypeItem();
    }
}
