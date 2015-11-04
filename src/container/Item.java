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
public class Item extends Things{

    public Item(String name, String type, float weight) {
        setName(name);
        setWeight(weight);
        setType(type);
    }
    
}
