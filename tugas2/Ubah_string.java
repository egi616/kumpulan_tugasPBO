/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author ACER
 */
public class Ubah_string {
    String a,b;

    public Ubah_string(String a,String b) {
        this.a=a;
        this.b=b;
    }
    
    void tampil_hasil(){
        System.out.println("Teks asli: "+a);
        System.out.println("Hasil lowercase: "+a.toLowerCase()); //build in methode jsvs
        System.out.println("Teks asli: "+b);
        System.out.println("Hasil lowercase: "+a.toUpperCase());       
    }
    
    
}
