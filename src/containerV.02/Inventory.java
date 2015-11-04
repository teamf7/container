/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container2;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Айнур
 */
public class Inventory {

    private List inventory;

    Inventory() {
        inventory = new LinkedList();
    }

    public void addContainer(String nameContainer, double weightContainer, ContainerSpec spec) {
        Container container = new Container(nameContainer, weightContainer, spec);
        inventory.add(container);
    }
    public List getInventory(){
        return inventory;
    }
}
