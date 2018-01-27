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
public class ParallelCircuit extends PolyCircuit{
    @Override
    public double getOhm() {
//       double res = 0;
//        for (int i = 0; i < components.size(); i++) {
//            res += 1/components.get(i).getOhm();
//        }
//        for(ElectricityComponent e: components){
//            res += 1/e.getOhm();
//        }
        return 1/components.stream().mapToDouble(c -> 1/c.getOhm()).sum();
        
//        return 1/res;
    
    }
    
}
