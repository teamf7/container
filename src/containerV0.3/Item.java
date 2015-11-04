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
public abstract class Item{

    private String name;//имя
    private float size;//размер
    private float weight;//вес
    private boolean selected;
    private String type=new String("N ");
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
         return "Имя предмета: "+getName()+" Вес предмета: "+getWeight()+" Тип предмета: "+getTypeItem();
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
     * @return the weight
     */
   public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
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
