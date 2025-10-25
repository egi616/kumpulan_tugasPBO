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
public class Kasir {
    
    String member = "ya";
    double totalBelanjaan, diskon, uangDibayarkan,kembalian;
    Scanner input = new Scanner(System.in);
    
    public void kasir(){
        
        System.out.print("Apakah anda memiliki kartu member: ");
        member =input.nextLine() .trim();
        System.out.print("Masukan total belanjaan: ");
        totalBelanjaan = input.nextDouble();
        
        if (member.equals("ya")) {
            if (totalBelanjaan > 500000) {
                diskon = 50000;
            } else if (totalBelanjaan > 100000) {
                diskon = 15000;
            } else {
                System.out.println("syarat untuk diskon member tidak terpenuhi");
            }
        } else {
            if (totalBelanjaan > 100000) {
                diskon = 10000;
            } else {
                System.out.println("Anda tidak mendapat diskon");
            }
        }
        
        double totalBayar= totalBelanjaan - diskon;
        
        System.out.println("Total Belanja Rp. "+totalBelanjaan);
        System.out.println("Diskon Rp. "+diskon);
        System.out.println("Total yang harus dibayar Rp. "+totalBayar);
        System.out.print("Masukan uang yang akan dibayarkan: ");
        uangDibayarkan=input.nextDouble();
        
        kembalian = uangDibayarkan - totalBayar;
        System.out.println("Kembalian Rp. "+kembalian);
    }
}
