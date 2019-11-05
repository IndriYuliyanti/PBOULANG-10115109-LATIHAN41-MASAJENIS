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
 *          tugas pbo pert 4 masa jenis
 */
public class Pboulang10115109Latihan41Masajenis {
private static int volume;
private static  int masajenis;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Kubus kubus1 = new Kubus();
       
       kubus1.setSisi(5);
       kubus1.setMasa(250);
       
        System.out.println("---- MASA JENIS KUBUS ----");
        System.out.println("sisi :"+kubus1.getSisi());
        System.out.println("masa :"+kubus1.getMasa()+"\n");
        
        System.out.println("====== Hasil Perhitungan ======");
        volume =  kubus1.hitungVolume(kubus1.getSisi());
        System.out.println("volume :"+volume);
        
        
        
        masajenis = kubus1.hitungMasaJenis(kubus1.getMasa(),volume);
        System.out.println("masa  jenis :"+masajenis+"\n\n");
        
        
    }
    
}
