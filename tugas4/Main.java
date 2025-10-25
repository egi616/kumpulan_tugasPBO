/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        
        //tugas pertemuan 4
        //no 1 ganjil genap modulus
        Ganjil_genap gg = new Ganjil_genap();
        gg.cek_jilnap();
        System.out.println();
        
        //soal 2 hari
        Hari h = new Hari();
        h.cekHari();
        System.out.println();
        
        //soal 3 gaji bersih
        GajiB gb = new GajiB();
        gb.gajiB();
        System.out.println();
        
        //no 4 tahun kabisat
        Kabisat k = new Kabisat();
        k.kabisat();
        System.out.println();

        //soal no 5 sales
        Sales s = new Sales();
        s.komisi();
        System.out.println();
        
        //soal 6 kasir sederhana if else
        Kasir ka = new Kasir();
        ka.kasir();
        System.out.println();
        
        //soal 7 hitung luas dengan switch case
        HitungLuas hl = new HitungLuas();
        hl.Menu();
        
    }
}
