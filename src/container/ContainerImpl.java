package container;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ainur
 */
public interface ContainerImpl {
        //получить предмет
    public abstract Things get();
    public abstract void add(Things item);
    
}
