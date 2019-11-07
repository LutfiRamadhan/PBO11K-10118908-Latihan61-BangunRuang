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
public class Kerucut implements BangunRuang{
    private final double phi = (double)22/7;
    private double jarijari, tinggi;

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return (double) 1/3*phi*Math.pow(jarijari,2)*(double)tinggi;
    }
    
}
