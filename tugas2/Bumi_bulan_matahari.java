/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author ACER
 */
public class Bumi_bulan_matahari {
    double jarak_bulan,jarak_matahari, kecepatan;
    
    public Bumi_bulan_matahari(double jarak_bulan,double jarak_matahari, double kecepatan) {
        this.jarak_bulan=jarak_bulan;
        this.jarak_matahari=jarak_matahari;
        this.kecepatan=kecepatan;
    }
    
    void waktu_tempuh(){
        double waktu_bulan= jarak_bulan/kecepatan;
        double waktu_matahari=jarak_matahari/kecepatan;
        System.out.println("Waktu tempuh dari bumi ke bulan: "+waktu_bulan);
        System.out.println("Waktu tempuh dari bumi ke matahari: "+waktu_matahari);
    }
}

