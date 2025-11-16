/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;

import java.util.Arrays;

/**
 *
 * @author ACER
 */
public class Tiga {
    public static void main(String[] args) {
        
        System.out.print("Masukan jumlah elemen pada array: ");
        int n = In.SCANNER.nextInt();
        
        int[] data =new int [n];
        for(int i=0 ;i < n;i++){
            System.out.print("Masukan nilai array ke-"+i+": ");
            data[i]=In.SCANNER.nextInt();
        }
        
        int indexMax=0, indexMin=0;
        for(int i=0 ;i < n;i++){
            if(data[i]>data[indexMax]){
                indexMax=i;
            }else if(data[i] < data[indexMin]){
                indexMin=i;
            }
        }
        
        System.out.println("Nilai terbesar adalah "+data[indexMax]);
        System.out.println("Nilai terkecil adalah "+data[indexMin]);
        
        double total=0, rata_rata;
        for(int j : data){
            total += j;
        }
        rata_rata=total/n;
        System.out.println("Jumlah semua elemen: "+total);
        System.out.println("Rata rata nya: "+rata_rata);
        
        int jumlah_genap = 0;
        for(int i =0;i < n; i++){
            if(data[i]%2==0){
            jumlah_genap += data[i];   
            }
        }
        System.out.print("Jumlah elemen genap: "+jumlah_genap);
        if(jumlah_genap % 2 == 0){
            System.out.print("(genap)\n");
        }else{
            System.out.println("(ganjil)\n");
        }
        
        Arrays.sort(data);
        System.out.print("Array setelah diurutkan: "+ Arrays.toString(data));
        System.out.println();
    }
}
