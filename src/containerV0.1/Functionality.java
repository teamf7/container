/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container1;

/**
 *
 * @author Айнур
 */
public interface Functionality {

    public abstract void add(Item item);

    public abstract void print();

    public abstract void pull();

    public abstract boolean isFull();

    public abstract boolean isEmpty();

    public abstract void error();
}
