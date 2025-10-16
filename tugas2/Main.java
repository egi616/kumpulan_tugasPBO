package tugas2 ;

public class Main {
    public static void main(String[] args) {
        
        //tugas soal no 1 increment
        Increment incre = new Increment(5,5);
        
        incre.pre_increment();
        System.out.println();
        incre.post_increment();
        System.out.println();
        
        //tugas soal no 2 Persegi panjang
        Persegi_panjang prsg = new Persegi_panjang(50,45);
        prsg.hitung_luas();
        System.out.println();
        
        //tugas soal no 3 persamaan kuadrat
        Persamaan_kuadrat pr = new Persamaan_kuadrat(2, 10, 5);
        pr.hitung_perKuadrat();
        System.out.println();
                
        //tugas soal no 4 operasi mtk
        Operasi_mtk om = new Operasi_mtk(22, 33);
        om.penjumlahan();
        om.pengurangan();
        om.perkalian();
        om.pembagian();
        System.out.println();
        
        //tugas soal no 5 dan 6 Segitiga
        Segitiga sgt =new Segitiga(6, 8);
        sgt.luas_se();
        System.out.println();
        sgt.keliling();
        System.out.println();
        
        //tugas soal no 7
        Ubah_string us = new Ubah_string("Saya Belajar Java", "Saya Belajar Java");
        us.tampil_hasil();
        System.out.println();
        
        //tugas soal no 8
        Bumi_bulan_matahari bbm = new Bumi_bulan_matahari(384.400,152.1,300.000);
        bbm.waktu_tempuh();
        System.out.println();
        
        //tugas soal no 9
        Konversi_suhu ks = new Konversi_suhu(10, 15, 5);
        ks.tampilkanSemuaKonversi();
    }
}