/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author ACER
 */
public class Empat {
    public void empat(){
        int banyak_angka, ganjil=1,total=0;
        
        System.out.print("Masukan banyak angka: ");
        banyak_angka = In.SCANNER.nextInt();
        for(int i = 1; i <= banyak_angka; i++){
            System.out.print( ganjil+ " ");
            total+=ganjil;
            ganjil += 2;
        }
        System.out.println("\nTotal penjumlahan: "+total);
    }
}
