/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author ACER
 */
public class Operasi_mtk {

    double x;
    double y;
    double hasil;
    
    public Operasi_mtk(double x,double y) {
        this.x=x;
        this.y=y;
    }
    
    void penjumlahan(){
        hasil = x + y;
        System.out.println("Hasil penjumlahan dari "+x+" dan "+ y+" :"+hasil);  
    }
    void pengurangan(){
        hasil = x - y;
        System.out.println("Hasil pengurangan dari "+x+" dan "+ y+" :"+hasil);  
    }
    void perkalian(){
        hasil = x * y;
        System.out.println("Hasil perkalian dari "+x+" dan "+ y+" :"+hasil);  
    }
    void pembagian(){
        hasil = x / y;
        System.out.println("Hasil pembagian dari "+x+" dan "+ y+" :"+hasil);  
    }
}
