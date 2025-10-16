/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;     //untuk mengecek error inputan buffered
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class ScannerN_bufferReader {
    
    Scanner inS = new Scanner(System.in);   //dalam kurung bisa langsung system in
    BufferedReader inB = new BufferedReader(new InputStreamReader(System.in)); //kalo bufferead masih butuh penyangga
    
    void contoh_scanner(){
        //bisa semua tipe data dan next.. 
        int npm;
        String nama;
        
        System.out.println("Test Scanner");
        //cara penggunaan nya dilakukan dengan panggil onjeck input yang sudah diubat inS
        System.out.print("Masukan npm: ");
        npm = inS.nextInt();    //setelah next sesuaikan dengan tipe data yang digunakan kecuali string pake line
        inS.nextLine();
        
        System.out.print("Masukan nama: ");
        nama = inS.nextLine();
        System.out.println();
    }
    
    void contoh_buffered() throws IOException{
        //hanya bisa line dan toString
        //apa apa harus dikonversi
        
        int umur;
        String nama;
        char kelas;
        
        System.out.println("Test BufferReader");
        System.out.print("Masukan nama: ");
        nama = inB.readLine();        
     
        System.out.print("Masukan umur: ");
        umur = Integer.parseInt(inB.readLine());
        
        System.out.print("Masukan kelas: ");
        kelas = inB.readLine().charAt(0); 
        
    }
    
    
    
    
}
