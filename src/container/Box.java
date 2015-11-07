/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

/**
 *
 * @author Ainur
 * запретить класть предм в контейнеры, кот-ые уже где-то лежат
 * огр по весу в сумке
 * огр по кол-ву в стопке
 * и по типу2
 * тип мап
 * в стeк не добавлять при ошибки
 */
public class Box extends Bag {
    private boolean open=true;
    public Box(String name, float maxWeight, float weight) {
        super(name,maxWeight, weight);
        setType("Плоский");
    }

    @Override
    public void add(Things item) {
        if(open==true){
        super.add(item);
        }else{
            throw new UnsupportedOperationException();
        }
    }
    public void openBox(boolean pick){
        this.open=pick;
    }
    public boolean isOpen(){
        return open;
    }
}
