/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container2;

/**
 *
 * @author Айнур
 */
class Container {

    private String nameContainer;
    private double weightContainer;
    private ContainerSpec spec;

    Container(String name, double weightContainer, ContainerSpec spec) {
        this.nameContainer = nameContainer;
        this.weightContainer = weightContainer;

    }

    /**
     * @return the nameContainer
     */
    public String getNameContainer() {
        return nameContainer;
    }

    /**
     * @return the weightContainer
     */
    public double getWeightContainer() {
        return weightContainer;
    }

    /**
     * @return the spec
     */
    public ContainerSpec getSpec() {
        return spec;
    }

}
