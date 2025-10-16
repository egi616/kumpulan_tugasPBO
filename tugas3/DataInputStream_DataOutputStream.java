/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author ACER
 */
public class DataInputStream_DataOutputStream {
    
    String nama;
    double total_belanja,diskon,total,bayar,kembalian,potongan;
    
    Scanner in = new Scanner(System.in);
    
    void IOstream() throws FileNotFoundException, IOException{
        System.out.print("Masukan Nama\t\t:");
        nama = in.nextLine();
        System.out.print("Masukan Total belanja\t:");
        total_belanja = in.nextDouble();
        System.out.print("Masukan diskon (%)\t:");
        diskon = in.nextDouble();
        System.out.print("Masukan bayar\t\t:");
        bayar = in.nextDouble();
        
        potongan =(diskon/100)*total_belanja; 
        total = total_belanja-potongan;
        kembalian= bayar - total;
        
        //data output stream -> menyimpan file 
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("dataBelanja.dat"));
        dos.writeUTF(nama);
        dos.writeDouble(total_belanja);
        dos.writeDouble(diskon);
        dos.writeDouble(total);
        dos.writeDouble(bayar);
        dos.writeDouble(kembalian);
        dos.close();
        System.out.println("Data berhasil disimpan");
        
        //data output stream membaca file nya
        DataInputStream dis = new DataInputStream(new FileInputStream("dataBelanja.dat"));
        nama = dis.readUTF();
        total_belanja = dis.readDouble();
        diskon = dis.readDouble();
        total = dis.readDouble();
        bayar = dis.readDouble();
        kembalian = dis.readDouble();
        dis.close();
        
        System.out.println("Nama\t\t: "+nama);
        System.out.println("Total belanja\t: "+total_belanja);
        System.out.println("Diskon (%)\t: " + diskon);
        System.out.println("Total\t\t: " + total);
        System.out.println("Bayar\t\t: " + bayar);
        System.out.println("Kembalian\t: " + kembalian);
        

    
    
    }   
}
