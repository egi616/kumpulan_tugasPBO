/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas8;

import java.util.Arrays;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main (String[] args){
        
        //satu
        Satu s = new Satu(3);
        s.cekF();
        System.out.println();
        
        //Dua
        Dua d = new Dua(3, 2);
        d.hitungP();
        System.out.println();
        
        //Tiga
        Tiga t = new Tiga(10);
        t.angkatoB();
        System.out.println();

        //Empat
        //hanya harga
        Empat em1 = new Empat(1000);
        em1.hitungT();
        System.out.println();
        //harga dan jumlah
        Empat em2 = new Empat(1000,2);
        em2.hitungT();
        System.out.println();
        //harga jmlh diskon
        Empat em3 = new Empat(2000, 2,1000);
        em3.hitungT();
        System.out.println();
        
        //Lima
        Lima luar = new Lima(10, 8);
        Lima dalam = new Lima(5, 4);
        luar.hitungLH(dalam);
        System.out.println();
        
        //Enam
        double[] angka={10,10,10};
        Enam e = new Enam(angka);
        e.kembali();
        System.out.println();

        //Tujuh
        int[] x = new int[5];
        Tujuh.ubah(x);
        System.out.print("{");
        for(int i :x){
            System.out.print(i+ " ");
        }
        System.out.println("}");
    }
}


class Satu{
    
    int angka;
    long f=1;

    public Satu(int angka) {
        this.angka = angka;
    }
    
    void cekF(){
        if ( angka < 0 ){
            System.out.println("Hasil invalid"); 
        }else{
            for( int i = 1; i <= angka ; i++) 
            f *= i;
            System.out.println("Angka "+this.angka+" faktorialnya adalah "+f);
        }
    }

}

class Dua{
    
    int angka, pangkat;

    public Dua(int angka, int pangkat) {
        this.angka = angka;
        this.pangkat = pangkat;
    }
    
    
    int hitungP(){
        int hasil=1;
        for(int i = 1; i<= pangkat; i++){
            hasil *= angka;
        }
        System.out.println("hasil dari " + this.angka+ " pangkat "+ this.pangkat+" adalah "+hasil);
        return hasil;
    }
    
}

class Tiga{
    int angka;

    public Tiga(int angka) {
        this.angka = angka;
    }
    
    String angkatoB(){
        String biner = Integer.toBinaryString(angka);
        System.out.println(angka+" dalam biner adalah "+biner);
        return biner;
    }
}

class Empat{
    int harga_barang, jumlah_barang, diskon, total;

    public Empat(int harga_barang) {
        this.harga_barang = harga_barang;
        this.jumlah_barang = 1;
        this.diskon = 0;
    }

    public Empat(int harga_barang, int jumlah_barang) {
        this.harga_barang = harga_barang;
        this.jumlah_barang = jumlah_barang;
        this.diskon = 0;
    }

    public Empat(int harga_barang, int jumlah_barang, int diskon) {
        this.harga_barang = harga_barang;
        this.jumlah_barang = jumlah_barang;
        this.diskon = diskon;
    }
    
    void hitungT(){
        total = (harga_barang * jumlah_barang) - diskon;
        System.out.println("total bayar: "+total);
    }
       
}

class Lima{
    int panjang, lebar;

    public Lima(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    int hitungL(){
        return panjang * lebar;
    }
    
    int hitungLH(Lima dalam){
        int hasil = this.hitungL()-dalam.hitungL();
        System.out.println("Luas bidang hitam "+ hasil);
        return hasil;
    }
}

class Enam{
    
    double[] nilai;
  
    
    Enam (double[] nilai){
        this.nilai=nilai;
    }
    
    Enam kembali(){
        double total = 0;
        for(double d : nilai){
            total += d;
        }
        double rata_rata = total/nilai.length;
        System.out.println("nilai : " + Arrays.toString(this.nilai));
        System.out.println("rata-rata : "+rata_rata);
        return this;
    } 
}

class Tujuh{
    static void ubah(int[] angka){
        angka[0]=6;
        for(int i = 1; i< angka.length;i++){
            angka[i]=angka[i-1]*2;
        }
    }
}
