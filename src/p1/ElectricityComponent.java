package p1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author melnikov
 */
public abstract class  ElectricityComponent {
    public abstract double getOhm();
    public double getVolt(double amper){
        return getOhm()*amper;
    }
}
