/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package valdez.tpmod6;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author valde
 */
public class SepedaMotor {
    private String warnaMotor;
    protected int ukuranTangki;
    private LocalDateTime waktuIsiBensin;
    
    

    public SepedaMotor(String warna){
        warnaMotor = warna;
        ukuranTangki = 3;
        waktuIsiBensin = null;
    }

    public void isiTangkiFull(){
        
        waktuIsiBensin = LocalDateTime.now();
    }

    public String cekKapanHabis(){
        //ini biar si jam nya sesuai format, soalnya jika tidak malah aneh
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return waktuIsiBensin.plusHours(ukuranTangki).format(formatter);
    }

    public boolean jalan(){
        if (waktuIsiBensin == null) {
            System.out.println("Bensin Habis, sepeda motor tidak dapat berjalan");
            return false;
        } else {
            System.out.println("Sepeda motor sedang berjalan");
            return true;
        }
    }
}
