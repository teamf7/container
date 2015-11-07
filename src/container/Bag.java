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
public class Bag extends Container {
    private float maxWeight = 0;
    /**
     * Мешок
     * @param name - название мешка
     * @param maxWeight - предельный вес контейнера
     * @param weight - вес контейнера
     */
    public Bag(String name, float maxWeight, float weight) {
        super(name, weight);
        this.maxWeight = maxWeight;
    }

    @Override
    public void add(Things item) {
        if (!isHaveWeight(item)) {
           throw new ArrayIndexOutOfBoundsException();
        }
        super.add(item);
    }

    @Override
    public Things get() {
        int random = (int) (Math.random() * size());
        Things item = (Things) get(random);
        remove(item);
        return item;
    }

  
    public boolean isHaveWeight(Things item){
        return (maxWeight-getWeight())>item.getWeight();
    }
    /**
     * @param maxWeight the maxWeight to set
     */
    public void setMaxWeight(float maxWeight) {
        this.maxWeight = maxWeight;
    }
}
