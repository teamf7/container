/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Айнур
 */
class ContainerSpec {
    private String name;
    private Map properties;

    public ContainerSpec(Map properties) {
        if (properties == null) {
            this.properties = new HashMap();
        } else {
            this.properties = new HashMap(properties);
        }
    }

    public Object getProperty(String propertyName) {
        return properties.get(propertyName);
    }

    public Map getProperties() {
        return properties;
    }

}
