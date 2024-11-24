/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package valdez.tpmod6;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author valde
 */
public class TPMOD6 {

    public static void main(String[] args) {
        SepedaMotor sp = new SepedaMotor("Hitam");
        HandoBaet hb = new HandoBaet("Biru");
        YamahaMoi ym = new YamahaMoi("Merah");
        
        System.out.println("Status Awal Sepeda Motor:");
        System.out.println(sp.jalan() );
        System.out.println("Status Awal HandoBaet:");
        System.out.println(hb.jalan() );
        System.out.println("Status Awal YamahaMoi:");
        System.out.println(ym.jalan() );
        
        //ini biar si jam nya sesuai format, soalnya jika tidak malah aneh
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("--------------------------------");
        
        System.out.println("Status Terbaru Sepeda Motor:");
        System.out.println("Waktu Saat ini: "+ LocalDateTime.now().format(formatter));
        sp.isiTangkiFull();
        sp.jalan();
        System.out.println(sp.cekKapanHabis());
        
        System.out.println("Status Terbaru HandoBaet:");
        System.out.println("Waktu Saat ini: "+ LocalDateTime.now().format(formatter));
        hb.isiTangkiFull();
        hb.jalan();
        
        System.out.println("Status Terbaru YamahaMoi:");
        System.out.println("Waktu Saat ini: "+ LocalDateTime.now().format(formatter));
        ym.isiTangkiFull();
        ym.jalan();
    }
}
