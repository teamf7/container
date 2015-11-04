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
public abstract class Container extends Things {

    private final List items = new ArrayList<>();
    private float maxWeight = 0;

    public Container(String name, float maxWeight, float weight) {
        setName(name);
        setWeight(weight);
        this.maxWeight = maxWeight;
        setSelected(false);
    }

    //добавить предмет
    public void add(Things item) throws RuntimeException {
        if (item.isSelected()) {
            throw new ArrayStoreException("Предмет не возможно положить, он лежит в другом контейнере");
        } else if (items.isEmpty() || isHaveWeight()) {
            item.setSelected(true);
            if(item instanceof Container){
                ((Container)item).setMaxWeight(maxWeight-getWeight()-item.getWeight());
            }
            items.add(item);
        } else {
            throw new ArrayIndexOutOfBoundsException("Выход индекса за пределы границ массива");
        }

    }

    //получить предмет
    public Item get() {
        if (items.isEmpty()) {
            throw new NoSuchElementException();
        }
        int random = (int) (Math.random() * items.size());
        Item item = (Item) items.get(random);
        item.setSelected(false);
        items.remove(item);
        return item;
    }

    //получить предмет
    public Item get(int i) {
        return (Item) items.get(i);
    }

    //получить вес контейнера
    @Override
    public float getWeight() {
        float weight = super.getWeight();
        for (Object item : items) {
            if (item instanceof Container) {
                weight += ((Container) item).getWeight();
            } else {
                weight += ((Item) item).getWeight();
            }
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

    public boolean isHaveWeight() {
        return maxWeight >= getWeight();
    }

    /**
     * @param maxWeight the maxWeight to set
     */
    public void setMaxWeight(float maxWeight) {
        this.maxWeight = maxWeight;
    }

}
