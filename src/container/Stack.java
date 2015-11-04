/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

import java.util.NoSuchElementException;

/**
 *
 */
public class Stack extends Box{
    private final int size;
    private int top=-1;
    public Stack(String name, int size) {
        super(name, 20*size, 0.0f);
        this.size=size-1;
        
    }

    @Override
    public void add(Item item){
        if(top<size){
        top++;
        super.add(item);
        }else{
            throw new ArrayIndexOutOfBoundsException("Выход индекса за пределы границ массива");
        }
    }
    @Override
   //получить предмет
    public Item get() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        top--;
        return get(top+1);
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
}
