/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas9;

public class Main3 {
    public static void main(String args[]){
        
        //no 1
        Macam m = new Macam();
        m.jenis();
        
        hKaki2 h2 = new hKaki2();
        h2.jenis();
        
        hKaki6 h6 = new hKaki6();
        h6.jenis();
        
        hKaki4 h4 = new hKaki4();
        h4.jenis();
        
        hKaki8 h8 = new hKaki8();
        h8.jenis();
        System.out.println();
        
        //no 2
        Segitiga s = new Segitiga(5,5);
        s.hitungLuas();
        System.out.println();
        
        //no 3
        HitungVkubus v = new HitungVkubus();
        v.setSisi(5);
        v.hitungV();
        System.out.println();
        
        //no 4
        Kucing k = new Kucing();
        k.nama="kucing";
        k.makan();
        System.out.println();
        
        //no 5
        Komik ko = new Komik("One Punch Man", "Murata");
        ko.getInfoProduk();
        Games ga = new Games("The Last Of Us", "Naughty Dog");
        ga.getInfoProduk();
        System.out.println();
        
        //no6
        Komik6 k6 = new Komik6(30,"One Punch Man", "Murata");
        k6.getInfoProduk();
        Games6 g6 = new Games6(60,"The Last Of Us", "Naughty Dog");
        g6.getInfoProduk();
        
    }
}

//no 1 dimulai dari sini
class Macam{
    
    void jenis(){
        System.out.println("Macam-macam hewan: ");
    }
}

class hKaki2 extends Macam{
    void jenis(){
        System.out.println("- hewan berkaki dua: kangguru, ayam, bebek, dll");
    }
}

class hKaki6 extends Macam{
    void jenis(){
        System.out.println("- hewan berkaki enam: capung, nyamuk, kupu-kupu, dll");
    }
}

class hKaki4 extends Macam{
    void jenis(){
        System.out.println("- hewan berkaki empat: kucing, anjing, kuda, dll");
    }
}

class hKaki8 extends Macam{
    void jenis(){
        System.out.println("- hewan berkaki delapan: kepiting, belalang, laba-laba, dll");
    }
}

//mulai no 2
class Segitiga{
    protected double alas, tinggi;
    
    protected Segitiga(double alas, double tinggi){
        this.alas= alas;
        this.tinggi = tinggi;
    }
    
    protected void hitungLuas(){
        double luas = 0.5 * alas * tinggi;
        System.out.println("Hasil luas segitiga dengan alas "+alas+" tinggi "+tinggi+" adalah "+luas);
    }
}

//mulai no 3
class HitungVkubus{
    
    private int sisi;
    public int volume;
    
    void setSisi(int sisi){
        this.sisi = sisi;
    }
    
    int getSisi(){
        return sisi;
    }
    
    void hitungV(){
        volume = sisi * sisi *sisi;
        System.out.println("Volume kubus dengan sisi "+sisi+" adalah "+volume);
    }
    
}

//mulai no 4
class Hewan{
    String nama;
    
    void makan(){
        System.out.println(nama +" sedang makan");
    }
}
class Kucing extends Hewan{
    
    String display(){
        return nama;
    }
}

//mulai no 5
class Produk{
    String judul, penulis;
    
    Produk(String judul, String penulis){
        this.judul=judul;
        this.penulis=penulis;
    }
}

class Komik extends Produk{
    
    Komik(String judul,String penulis){
        super(judul,penulis);
    }
    
    void getInfoProduk(){
        System.out.println("Info Produk Komik: ");
        System.out.println("Judul: "+super.judul);
        System.out.println("Penulis: "+super.penulis);
    }
}

class Games extends Produk{
    
    Games(String judul,String penulis){
        super(judul,penulis);
    }
    void getInfoProduk(){
        System.out.println("Info Produk Games: ");
        System.out.println("Judul: "+super.judul);
        System.out.println("Penulis: "+super.penulis);
    }
    
}

//mulai no 6
class Produk6{
    String judul, penulis;
    
    Produk6(String judul, String penulis){
        this.judul=judul;
        this.penulis=penulis;
    }
}

class Komik6 extends Produk6{
    int jumlah_halaman;
    
    Komik6(int jumlah_halaman, String judul,String penulis){
        super(judul,penulis);
        this.jumlah_halaman=jumlah_halaman;
    }
    
    void getInfoProduk(){
        System.out.println("Info Produk Komik: ");
        System.out.println("Jumlah halaman: "+ jumlah_halaman);
        System.out.println("Judul: "+super.judul);
        System.out.println("Penulis: "+super.penulis);
    }
}

class Games6 extends Produk6{
    
    int waktu_main;
    
    Games6(int waktu_main, String judul,String penulis){
        super(judul,penulis);
        this.waktu_main=waktu_main;
    }
    void getInfoProduk(){
        System.out.println("Info Produk Games: ");
        System.out.println("Waktu main: "+ waktu_main+ " menit");
        System.out.println("Judul: "+super.judul);
        System.out.println("Penulis: "+super.penulis);
    }
    
}
