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
public class Main {

    public static void main(String[] args) {
         Item item2 = new ContainerItem("аккумулятор","Плоский",2);
        Item item3 = new ContainerItem("плитка 2","Плоский", 2);
        Item item4 = new ContainerItem("плитка","Плоский", 2);
        Container bag = new ContainerBag("мешок 1", 5, 0.1f);
        Container box = new ContainerBox("коробка1", 10, 0.5f);
        Container stack = new ContainerStack();
        stack.add(item3);
        System.out.println(stack.toString());
        bag.add(stack);
        stack.add(item2);
        System.out.println(stack.toString());
        System.out.println(bag.toString());
    }
        /*Item a = new ContainerItem("Кирпич1","Плоский", 2);
        Item b = new ContainerItem("Кирпич2","Плоский", 2);
        Item c = new ContainerItem("Кирпич3","Плоский", 2);
        Container d = new ContainerBag("мешок 1", 5, 0.1f);
        Container e = new ContainerBox("коробка1", 10, 0.5f);
          
        d.add(a);
        d.add(b);
        
        d.print();
        e.add(c);
        e.add(d);//ошибка, т.к предельный вес больше
        e.print();
        e.pull();
        Container f = new ContainerStack();
        f.add(e);
        f.add(c);
        f.add(d);//ошибка
        f.print();
*/
    }

