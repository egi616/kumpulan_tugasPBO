package tugas3;

import java.util.Scanner;

public class Paycheck {
    double nik, gaji_pokok, tunjangan_jabatan, tunjangan_istri, tunjangan_anak;
    String nama, alamat, jabatan;
    double total_gaji, pajak_gaji, gaji_bersih;
    Scanner in = new Scanner(System.in);
    
    void paycheck(){
        
        System.out.print("Nomor induk karyawan\t: ");
        nik = in.nextDouble();
        in.nextLine(); //getline
        System.out.print("Nama karyawan\t\t: ");
        nama = in.nextLine();
        System.out.print("Alamat\t\t\t: ");
        alamat=in.nextLine();
        System.out.print("Gaji pokok\t\t: ");
        gaji_pokok= in.nextDouble();
        System.out.print("Tunjangan jabatan\t: ");
        tunjangan_jabatan= in.nextDouble();
        System.out.print("Tunjangan istri\t\t: ");
        tunjangan_istri= in.nextDouble();
        System.out.print("Tunjangan anak\t\t: ");
        tunjangan_anak= in.nextDouble();
        
    }
    
    double totalGaji(){
        total_gaji = gaji_pokok+tunjangan_jabatan+tunjangan_istri+tunjangan_anak;
        System.out.println("Total gaji\t\t: "+total_gaji);
        return total_gaji;
    }
    double pajakGaji(){
        pajak_gaji = 0.1 * (gaji_pokok+tunjangan_jabatan+tunjangan_anak);
        System.out.println("Pajak penghasilan\t: "+pajak_gaji);
        return pajak_gaji;
    }
    double gajiBersih(){
        gaji_bersih = total_gaji - pajak_gaji;
        System.out.println("Gaji bersih\t\t: "+gaji_bersih);
        return gaji_bersih;
    }
}