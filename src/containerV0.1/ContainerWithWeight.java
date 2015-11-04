/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container1;

import java.util.ArrayList;

/**
 *
 */
public abstract class ContainerWithWeight extends Container {

    private final ArrayList items = getItems();

    private float weight;

    ContainerWithWeight(String name, float weight, float size) {
        setName(name);
        setSize(size);
        setWeight(weight);
    }

    @Override
    public void add(Item item) {
        if (item.isSelected()) {
            System.err.println(item.getName() + "Уже где-то лежит");
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

    @Override
    public void pull() {
        if (!isEmpty()) {
            int random = (int) (Math.random() * items.size());
            System.out.println("Мы взяли предмет: ");
            System.out.println(((Item) items.get(random)).toString());
            ((Item) items.get(random)).setSelected(false);
            items.remove(random);

        }
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public boolean isFull() {

        return getMaxSize() > getWeight();
    }

    @Override
    public void error() {
        System.err.println("Ошибка: У мешка есть предельный вес внутри, больше которого добавлять нельзя");
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }
}
