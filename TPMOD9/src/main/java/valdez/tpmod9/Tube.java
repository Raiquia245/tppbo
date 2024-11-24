/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package valdez.tpmod9;

/**
 *
 * @author valde
 */
public class Tube extends Circle implements HasVolume{
    private double height;
    
    public Tube(double radius, double height){
        super(radius);
        this.height = height;
    }
    
    @Override
    public double getArea(){
       return 2 * Math.PI * radius * (radius + height);
    }
    @Override
    public double getVolume(){
        return Math.PI * radius * radius * height;
    }
}
