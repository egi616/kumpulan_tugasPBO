/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author ACER
 */
public class Tiga {
   public void lima(){
        int baris, angka=1;
        
        System.out.print("Masukan banyak baris: ");
        baris = In.SCANNER.nextInt();
        for(int i=1;i<=baris;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(angka +" ");
                angka++;
            }
            System.out.println();
        }    
   }
}
