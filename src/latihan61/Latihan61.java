/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan61;

/**
 *
 * @author lutfi
 * NAMA : LUTFI RAMADHAN
 * NIM  : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan61{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola b = new Bola();
        b.setJarijari(7);
        System.out.println("Volume Bola Basket : "+b.hitungVolume());
        Tabung t = new Tabung();
        t.setJarijari(10);
        t.setTinggi(21);
        System.out.println("Volume Tabung : "+t.hitungVolume());
        Kerucut k = new Kerucut();
        k.setJarijari(14);
        k.setTinggi(9);
        System.out.println("Volume Kerucut : "+k.hitungVolume());
    }

}
