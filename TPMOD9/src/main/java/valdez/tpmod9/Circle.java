/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package valdez.tpmod9;

/**
 *
 * @author valde
 */
public class Circle extends Shape {
    protected double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
    
    
}
