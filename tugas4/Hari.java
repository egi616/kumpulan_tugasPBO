/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Hari {
    
    public void cekHari(){
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("masukan angka hari: ");
        int hari = input.nextInt();
        
        switch(hari){       //switch hanya bisa dipakai untuk tipe data byte, short, char, int, string, enumarasi
            case 1:
                System.out.println("Hari ini senin");
                break;
            case 2:
                System.out.println("Hari ini selasa");
                break;
            case 3:
                System.out.println("Hari ini rabu");
                break;
            case 4:
               System.out.println("Hari ini kamis");
                break;
            case 5:
                System.out.println("Hari ini jumat");
                break;
            case 6:
                System.out.println("Hari ini sabtu");
                break;
            case 7:
                System.out.println("Hari ini minggu");
                break;
           default:
                System.out.println("invalid");
                break;
            }
    }
}
