package tugas3;

import java.util.Scanner;

public class Selisih_waktu {
    int jam1, menit1, detik1,total_detik1;
    int jam2, menit2, detik2,total_detik2;
    int hasil_jam, hasil_menit, hasil_detik;
    int selisih_detik;
    
    Scanner in = new Scanner(System.in);
    
    void hitungSW(){
        System.out.print("Masukan jam pertama: ");
        jam1 = in.nextInt();
        System.out.print("Masukan menit pertama: ");
        menit1 = in.nextInt();
        System.out.print("Masukan detik pertama: ");
        detik1 = in.nextInt();
        System.out.println();
        
        System.out.print("Masukan jam kedua: ");
        jam2 = in.nextInt();
        System.out.print("Masukan menit kedua: ");
        menit2 = in.nextInt();
        System.out.print("Masukan detik kedua: ");
        detik2 = in.nextInt();
        System.out.println();
        
        //konversi ke detik biar ga 
        total_detik1 = jam1 * 3600 + menit1 * 60 + detik1;
        total_detik2 = jam2 * 3600 + menit2 * 60 + detik2;
        
        selisih_detik =Math.abs(total_detik1-total_detik2);
        
        //kembalikan konversian
        hasil_jam = selisih_detik/3600;
        hasil_menit = (selisih_detik%3600)/60;
        hasil_detik = selisih_detik % 60;
        
        System.out.println("Selisih waktu : "+ hasil_jam + " jam "+hasil_menit+" menit "+hasil_detik+ " detik");
        
    }

       
}