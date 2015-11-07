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
public class Stack extends Container{
    private final int size;
    private int top=-1;
    public Stack(String name, int size) {
        super(name, 0.0f);
        this.size=size-1;
        setType("Плоский");
    }

   public int getTop(){
       return top;
   }
    public void add(Things item){
        if (!"Плоский".equals(item.getType())) {
            throw new ArrayStoreException("Предмет не возможно положить, не подходит тип" + item.getType());
        }
        if (top < size) {
            try {
                top++;
                super.add(item);
            } catch (ArrayStoreException e) {top--;
                throw new ArrayStoreException();
            } catch (UnsupportedOperationException e) {top--;
                throw new UnsupportedOperationException();
            } catch (ClassCastException e) {top--;
                throw new ClassCastException();
            } 
        } else {
            throw new ArrayIndexOutOfBoundsException("Выход индекса за пределы границ массива");
        }
    }
    @Override
   //получить предмет
    public Things get() {
        Things item;
        try {
            top--;
            item = get(top + 1);
        } catch (NoSuchElementException e) {
            top++;
            throw new NoSuchElementException();
        }
        return item;
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
   
}
