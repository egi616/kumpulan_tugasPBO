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
public class GajiB {
    
    double gajiPokok, tunjanganAnak, tunjanganPasangan, nik, gajiBersih, jumlahAnak;
    int golongan;
    String nama, status;
    Scanner in = new Scanner(System.in);
    
    void gajiB(){
        System.out.print("Masukan nik: ");
        nik=in.nextDouble();
        in.nextLine();
        System.out.print("Masukan nama: ");
        nama=in.nextLine();
        System.out.print("Masukan kode golongan (1-4): ");
        golongan = in.nextInt();
        in.nextLine();
        System.out.print("Masukan status pernikahan (menikah, menikah dan punya anak, belum menikah, cerai): ");
        status = in.nextLine();
        System.out.print("Masukan jumlah anak: ");
        jumlahAnak = in.nextDouble();
       
        if (golongan == 1 && !status.equalsIgnoreCase("menikah")) {
            System.out.println("Golongan 1 hanya boleh untuk status 'Menikah dan tidak punya anak'");
            return;
        } 
        else if (golongan == 2 && !status.equalsIgnoreCase("belum menikah")) {
            System.out.println("Golongan 2 hanya boleh untuk status 'Belum Menikah'!");
            return;
        } 
        else if (golongan == 3 && !status.equalsIgnoreCase("cerai")) {
            System.out.println("Golongan 3 hanya boleh untuk status 'Cerai'!");
            return;
        } 
        else if (golongan == 4 && !status.equalsIgnoreCase("menikah dan punya anak")) {
            System.out.println("Golongan 4 hanya boleh untuk status 'Menikah dan punya anak'!");
            return;
        }
        
        switch(golongan){
            case 1:
                gajiPokok= 1200000;
                break;
            case 2:
                gajiPokok= 1500000;
                break;
            case 3:
                gajiPokok= 1750000;
                break;
            case 4:
                gajiPokok= 2000000;
                break;
            default:
                System.out.println("invalid");
                break;
        }
        if (status.equalsIgnoreCase("menikah")) {
            tunjanganPasangan = 0.10 * gajiPokok;
        } else if (status.equalsIgnoreCase("menikah dan punya anak")) {
            tunjanganPasangan = 0.10 * gajiPokok;
            tunjanganAnak = 0.05 * gajiPokok * jumlahAnak;
        } else {
            tunjanganPasangan = 0;
            tunjanganAnak = 0;
        }

        gajiBersih = gajiPokok + tunjanganPasangan + tunjanganAnak;
        
        System.out.println("Total tunjangan pasangan: "+tunjanganPasangan);
        System.out.println("total tunjangan anak: "+tunjanganAnak);
        System.out.println("Total gaji bersih adalah: "+gajiBersih);
    }
}
