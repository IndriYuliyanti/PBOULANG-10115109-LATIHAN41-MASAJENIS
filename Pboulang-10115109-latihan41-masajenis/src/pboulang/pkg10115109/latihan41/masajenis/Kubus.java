/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihan41.masajenis;

/**
 *
 * @author nama : indri yuliyanti
 *          nim ; 10115109
 *          kelas : pbo ulng
 *          tugas pbo pert 4 kubbus
 */
public class Kubus {
    private int sisi;
    private int masa;
    
    public Kubus() {
        
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }
    
    public int hitungVolume( int sisi){
        int volume;
        volume = sisi*sisi*sisi;
        return volume;
    }
    public int hitungMasaJenis(int masa, int volume){
        int masajenis;
        masajenis = masa/volume;
        return masajenis;
    }
       
   

    

   
    
    
}
