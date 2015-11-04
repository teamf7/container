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
public class Bag extends Container{

    /**
     *  Мешок
     * @param name - название мешка
     * @param maxWeight - предельный вес контейнера
     * @param weight - вес контейнера
     */
    public Bag(String name, float maxWeight, float weight) {
        super(name,maxWeight,weight);
        
    }
    
}
