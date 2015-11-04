/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container1;

import java.util.ArrayList;

/**
 * Коробка
 */
public class ContainerBox extends ContainerWithWeight {

    private final ArrayList items = getItems();

    ContainerBox(String name, float weight, float size) {
        super(name, weight, size);
    }

    @Override
    public void add(Item item) {
        if (item.isSelected()) {
            System.err.println(item.getName() + "Уже где-то лежит");
        }else if ((items.isEmpty() || !isFull()) && "Плоский".equals(item.getTypeItem())) {
            item.setSelected(true);
            items.add(item);
        } else {
            error();
        }
    }

    @Override
    public String getTypeItem() {
        return "Плоский";
    }

}
