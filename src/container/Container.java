/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Мешок
 */
public abstract class Container extends Things implements ContainerImpl{

    private final List<Things> items = new ArrayList<>();


    public Container(String name, float weight) {
        setName(name);
        setWeight(weight);
        setSelected(false);
    }

    //добавить предмет
    @Override
    public void add(Things item) throws RuntimeException {
        if (item.isSelected()) {
            throw new ArrayStoreException();
        } else if (this instanceof Container && this.isSelected()) {
            throw new UnsupportedOperationException();
        }else if(this.equals(item)){
            throw new ClassCastException();      
        } else {
            item.setSelected(true);
            items.add(item);
        }
    }
    
    //получить предмет по номеру 
    public Things get(int i) {
        if (items.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (Things) items.get(i);
    }

    //удалить предмет предмет

    public void remove(Things item) {
        item.setSelected(false);
        items.remove(item);
    }

    //получить вес контейнера

    @Override
    public float getWeight() {
        float weight = super.getWeight();
        for (Things item : items) {
            weight += item.getWeight();
        }
        return weight;
    }

    //получить размер списка
    public int size() {
        return items.size();
    }

    //очистить размер списка
    public void clear() {
        for (int i = 0; i < items.size(); i++) {
            ((Item) items.get(i)).setSelected(false);
            items.remove(i);
        }
    }
   
    @Override
    public String toString() {
        return "Контейнер: " + getName() + " Вес с предметами: " + getWeight() + " Тип предмета: " + getType();
    }
}
