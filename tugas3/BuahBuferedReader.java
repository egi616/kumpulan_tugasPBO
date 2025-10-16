/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 *
 * @author ACER
 */
public class BuahBuferedReader {
    
    int mangga, jambu_pertetangga, tetangga, mangga_busuk,jambu;
    int total_jambu, total_buah;
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
            
    void buah() throws IOException{
        System.out.print("Masukan jumlah buah mangga\t\t:");
        mangga = Integer.parseInt(br.readLine());
        System.out.print("Masukan jumlah buah jambu pertetangga\t:");
        int jambuPertetangga= Integer.parseInt(br.readLine());
        System.out.print("Masukan jumlah tetangga\t\t\t:");
        tetangga = Integer.parseInt(br.readLine());
        System.out.print("Masukan jumlah buah mangga yang busuk\t:");
        mangga_busuk = Integer.parseInt(br.readLine());
        
        total_jambu = jambu * tetangga;
        total_buah = (mangga-mangga_busuk)+ total_jambu;
        
        System.out.println("Total buah: " + total_buah);
    }
}
    
