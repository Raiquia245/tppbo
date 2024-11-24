/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package valdez.tpmod3;

/**
 *
 * @author valde
 */
public class Mahasiswa {
    String nama;
    Prodi prodi;
    
    void setNama(String nama){
        this.nama = nama;
    }
    void setProdi(Prodi prodi){
        this.prodi = prodi;
    }
    String getNama(){
        return nama;
    }
    String getProdi(){
        return prodi.getNama();
    }
    void displayMahasiswa(){
        System.out.println("Nama: " + getNama()+ ", Prodi: " + getProdi());
    }
}
