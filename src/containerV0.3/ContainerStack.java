/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container3;

import java.util.ArrayList;

/**
 * Стопка
 */
public class ContainerStack extends Container {

    private int amount;
    private int number;
    private ArrayList items = getItems();

    ContainerStack() {
        setName("Стопка");
        setWeight(0.0f);
        setWeight(0f);
        amount = 0;
        number = 7;
    }

    @Override
    public void add(Item item) {
        if (item.isSelected()) {
            System.out.println("  Ошибка: "+item.getName() + " Уже где-то лежит");
        } else if (isEmpty() || !isFull()) {
            if ("Плоский".equals(item.getTypeItem())) {
                item.setSelected(true);
                items.add(item);
                amount++;
            } else {
                System.out.println("  Ошибка: Не подходит тип");
            }
        } else {
            error();
        }
    }

    @Override
    public void pull() {
        if (!isEmpty()) {
            System.out.println("Мы взяли предмет: ");
            System.out.println(((Item) items.get(amount)).toString());
            ((Item) items.get(amount)).setSelected(false);
            items.remove(amount);
            
        }
    }
    
    @Override
    public void found(String name) {
        System.out.println("  Ошибка: В стопке нельзя искать файлы");
    }
    @Override
    public boolean isFull() {
        return amount == number;
    }

    @Override
    public boolean isEmpty() {
        return amount == -1;
    }

    @Override
    public String getTypeItem() {
        return "Плоский";
    }

    public void error() {
        System.out.println("  Ошибка: Превышено максимальное кол-во предметов");
    }
}
