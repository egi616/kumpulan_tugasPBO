/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

import java.util.Scanner;



/**
 *
 * @author ACER
 */
public class Percetakan {
Scanner in = new Scanner(System.in);
    
    void waktu(){
        int hari, jam, menit, detik,total_halaman=0;
        
        System.out.print("Masukan jumlah buku\t\t\t: ");
        int buku = in.nextInt();
        
        for(int i=1; i <= buku; i++){
            System.out.print("Masukan jumlah halaman buku ke-"+i+"\t: ");
            int halaman= in.nextInt();
            total_halaman += halaman;
        }
        
        //kecepatan 1 lembar satu detik
        int total_detik = total_halaman;
        
        //detik ke hari jam menit detik
        hari = total_detik/86400;
        int sisa = total_detik % 86400;
        
        jam= sisa/3600;
        sisa%= 3600;
        
        menit=sisa/60;
        detik=sisa%60;
        
        System.out.print("Total jumlah halama yang dicetak\t: "+total_halaman);
        System.out.print("\nWaktu yang dibutuhkan: "+ hari +" hari "+jam+" jam "+menit+" menit "+detik+" detik ");
    }
    
}
