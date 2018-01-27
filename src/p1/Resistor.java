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
public class Resistor extends ElectricityComponent{
    protected double r;
    public Resistor(double r){
        if(r<0){
            throw new RuntimeException("negative resistance");
        }
        this.r=r;
    }
    public double getOhm(){
        return r;
    }
}
