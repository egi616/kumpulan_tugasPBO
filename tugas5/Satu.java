/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author Jarkom-1
 */
public class Satu {
    public void satu(){
        int angka[]=new int[10];
        int terbesar = angka[0], terkecil=angka[0];
        
        for(int i = 0; i < 10;i++){
            System.out.print("Masukan bilangan ke-"+(i+1)+ " :");
            angka[i]= In.SCANNER.nextInt();
        }
        for(int i=1; i< 10;i++){
            if(angka[i]>terbesar)terbesar=angka[i];
            if(angka[i]<terkecil)terkecil=angka[i];
        }
        System.out.println("angka terbesar: "+terbesar);
        System.out.println("angka terkecil: "+terkecil);
    }
}
