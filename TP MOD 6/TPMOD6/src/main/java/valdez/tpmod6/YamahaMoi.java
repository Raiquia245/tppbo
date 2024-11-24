/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package valdez.tpmod6;


/**
 *
 * @author valde
 */
public class YamahaMoi extends SepedaMotor{

    public YamahaMoi(String warna){
        super(warna);
        this.ukuranTangki = 5;
    }
    
    @Override
    public boolean jalan() {
        
        if (!super.jalan()) {
            return false; 
        } else {
            System.out.println("Bensin akan habis pada " + cekKapanHabis() ); 
            return true; 
        }
    }
}
