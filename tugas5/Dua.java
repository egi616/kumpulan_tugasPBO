/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;


/**
 *
 * @author ACER
 */
public class Dua {
    
    public void dua(){
        
        int i = 0;
        int berhenti, total = 0, angka;
        double rata_rata;
        
        System.out.print("Masukan batas perulangan untuk berhent: ");
        berhenti = In.SCANNER.nextInt();
        while(i != berhenti){
            System.out.print("Masukan angka: ");
            angka = In.SCANNER.nextInt();
            i++;
        };
        
        total = berhenti;
        rata_rata = total / berhenti;
        System.out.println("Total jumlah bilangan: "+total);
        System.out.println("Rata-rata: " + rata_rata);
        
    }
}
