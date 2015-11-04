/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container3;

/**
 *
 * @author Айнур
 */
public class ContainerItem extends Item {

    public ContainerItem(String name, String type, float size) {
        setName(name);
        setWeight(size);
        setType(type);
        
    }

}
