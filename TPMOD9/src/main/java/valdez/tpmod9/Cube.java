/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package valdez.tpmod9;

/**
 *
 * @author valde
 */
public class Cube extends Square implements HasVolume {
    public Cube(double side){
        super(side);
    }
    @Override
    public double getArea(){
        return 6*super.length*super.length;
    }
    @Override
    public double getVolume(){
        return super.length*super.length*super.length;
    }
}
