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
public abstract class Item {

    private String name;
    private float size;
    private boolean selected;
    private String type=new String("No type");
    /**
     * @return the type
     */
    public String getTypeItem(){
        return type;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    @Override
    public String toString(){
         return "Имя предмета: "+getName()+" Вес предмета: "+getSize()+" Тип предмета: "+getTypeItem();
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @param type the name to set
     */
    public void setType(String type) {
        this.type = type;
    }
    /**
     * @return the size
     */
    public float getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(float size) {
        this.size = size;
    }

     /**
     * @return the selected
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * @param selected the selected to set
     */
    public void setSelected(boolean selected) {
        this.selected = selected;
    }
   
}
