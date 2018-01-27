/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author melnikov
 */
public abstract class PolyCircuit extends ElectricityComponent{
    protected List<ElectricityComponent> components = new ArrayList<>();
    
    public void add(ElectricityComponent r) {
        this.components.add(r);
    }
}
