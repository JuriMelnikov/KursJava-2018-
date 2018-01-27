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
public class LineCircuit extends PolyCircuit{

    
    @Override
    public double getOhm() {
        return components.stream().mapToDouble(c -> c.getOhm()).sum();
    }
    
}
