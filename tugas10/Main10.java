
package tugas10;


public class Main10 {
    public static void main(String[] args) {
        //no 1
        PersegiPanjang ppl = new PersegiPanjang(5, 5);
        ppl.luas();
        System.out.println();
        BujurSangkar bs = new BujurSangkar(3);
        bs.luas();
        System.out.println();
        Segitiga s = new Segitiga(6, 2);
        s.luas();
        System.out.println();
        Lingkaran l = new Lingkaran(9);
        l.luas();
        System.out.println();
        
        //no 2
        DatUnivImplement d = new DatUnivImplement("Universitas Suryakancana", "Pasir Gede", "Jawa-Barat", "Indonesia", "08123-3210-3123");
        d.tampildata();
        System.out.println();
        
        //no 3
        Komik3 pk = new Komik3(30, "Chainshaw Man", "Tatsuki fujimoto");
        System.out.println(pk.getInfoProduk());
        System.out.println();
        Games3 pg = new Games3(30, "The last of Us", "Naughty Dog");
        System.out.println(pg.getInfoProduk());
        System.out.println();
        
        //no 4
        Komik4 pk4 = new Komik4(30, "Lookback", "Tatsuki fujimoto");
        System.out.println(pk4.getInfoProduk());
        System.out.println();
        Games4 pg4 = new Games4(30, "Uncharted 4", "Naughty Dog");
        System.out.println(pg4.getInfoProduk());
        System.out.println();
        
        //no 5
        Komik5 pk5 = new Komik5();
        pk5.setJudul("Bleach");
        pk5.setPenulis("Tite Kubo");
        pk5.setJumlah_halaman(100);
        System.out.println(pk5.getInfoProduk());
        System.out.println();
        
        Games5 pg5 = new Games5();
        pg5.setJudul("Red dead Redemtion");
        pg5.setPenulis("Rockstars");
        pg5.setWaktu_main(100);
        System.out.println(pg5.getInfoProduk());
        System.out.println();
        
        //no 6
        Komik6 pk6 = new Komik6();
        pk6.setJudul("One Piece");
        pk6.setPenulis("Oda");
        pk6.setJumlah_halaman(100);
        System.out.println(pk6.getInfoProduk());
        System.out.println();
        
        Games6 pg6= new Games6();
        pg6.setJudul("Grand Theft Auto 5");
        pg6.setPenulis("Rockstars");
        pg6.setWaktu_main(100);
        System.out.println(pg6.getInfoProduk());
        System.out.println();
        
        //no 7
        Mobil m = new Mobil("the 9993", "Porsche", "Sport");
        m.informasi();
        System.out.println();

        Pesawat p = new Pesawat("Boeing Series", "Boein 999", "Pesawat komersial");
        p.informasi();
        System.out.println();
        
        Kapal_laut k = new Kapal_laut("XL-class", "KM Sabuk Nusantara", "Kapal penumpang");
        k.informasi();
        System.out.println();
    }
}


//mulai no 1
class Bentuk{
    
    float luas;
    
    void luas(){
        System.out.print("Menghitung luas: "); 
    }   
}

class PersegiPanjang extends Bentuk{
    
    float panjang, lebar;
    
    public PersegiPanjang(float panjang, float lebar){
        this.panjang= panjang;
        this.lebar=lebar;
    }
    
    @Override
    public void luas(){
        System.out.println("Panjang: "+panjang);
        System.out.println("Lebar: "+lebar);
        luas = panjang * lebar;
        System.out.println("Luas persegi panjang dengan panjang "+panjang+" dan lebar "+lebar+" adalah "+super.luas);
    }
}

class BujurSangkar extends Bentuk{
    float sisi;

    public BujurSangkar(float sisi) {
        this.sisi = sisi;
    }
    
    @Override
    void luas(){
        System.out.println("Sisi "+sisi);
        luas = sisi * sisi;
        System.out.println("Luas bujur sangkar: "+luas);
    }
}

class Segitiga extends Bentuk{
    
    float alas, tinggi;
    
    public Segitiga(float alas, float tinggi){
       this.alas=alas;
       this.tinggi=tinggi;
    }
    
    @Override
    public void luas(){
        System.out.println("Alas: "+alas);
        System.out.println("Tinggi: "+tinggi);
        luas = 0.5f * alas * tinggi;
        System.out.println("Luas segitiga dengan alas "+alas+" dan tinggi "+tinggi+" adalah "+super.luas);
    }
}

class Lingkaran extends Bentuk{
    float r;
    
    public Lingkaran(float r){
        this.r=r;
    }
    
    @Override
    public void luas(){
        System.out.println("Jari-jari(r): "+r);
        super.luas = 3.14f * r * r ;
        System.out.println("Luas lingkaran dengan jari jari "+r+" adalah "+super.luas);
    }
}

//mulai no 2
interface DatUniv{
    void tampildata();
}

class DatUnivImplement implements DatUniv{
    
    String namaUniv, alamat, prov, negara, telepon;

    public DatUnivImplement(String namaUniv, String alamat, String prov, String negara, String telepon) {
        this.namaUniv = namaUniv;
        this.alamat = alamat;
        this.prov = prov;
        this.negara = negara;
        this.telepon = telepon;
    }
    
    @Override
    public void tampildata() {
        System.out.println("Nama Universitas\t: "+namaUniv);
        System.out.println("Alamat\t\t\t: "+alamat);
        System.out.println("Telepon\t\t\t: "+telepon);
        System.out.println("Provinsi\t\t: "+prov);
        System.out.println("Negara\t\t\t: "+negara);
    }
    
}

//mulai no 3
class Produk3{
    String judul, penulis;
    
    Produk3(String judul, String penulis){
        this.judul=judul;
        this.penulis=penulis;
    }
    
    String getInfoproduk(){
        return "Judul: "+judul+"\nPenulis: "+penulis;
    }
}

class Komik3 extends Produk3{
    
    int jumlah_halaman;
    
    Komik3(int jumlah_halaman, String judul,String penulis){
        super(judul,penulis);
        this.jumlah_halaman=jumlah_halaman;
    }
    
    String getInfoProduk(){
        return "Info produk komik\n" + super.getInfoproduk()+" \n"+"Jumlah halaman: "+jumlah_halaman;
    }
}

class Games3 extends Produk3{
    
    int waktu_main;
    
    Games3(int waktu_main, String judul,String penulis){
        super(judul,penulis);
        this.waktu_main=waktu_main;
    }
    
    String getInfoProduk(){
        return "Info produk games\n" + super.getInfoproduk()+" \n"+"Waktu main: "+waktu_main+ " menit";
    }
    
}

//mulai no 4
class Produk4{
    protected String judul, penulis;
    
    Produk4(String judul, String penulis){
        this.judul=judul;
        this.penulis=penulis;
    }
    
    String getInfoproduk(){
        return "Judul: "+judul+"\nPenulis: "+penulis;
    }
}

class Komik4 extends Produk4{
    
    int jumlah_halaman;
    
    Komik4(int jumlah_halaman, String judul,String penulis){
        super(judul,penulis);
        this.jumlah_halaman=jumlah_halaman;
    }
    
    String getInfoProduk(){
        return "Info produk komik\n" + super.getInfoproduk()+" \n"+"Jumlah halaman: "+jumlah_halaman;
    }
}

class Games4 extends Produk4{
    
    int waktu_main;
    
    Games4(int waktu_main, String judul,String penulis){
        super(judul,penulis);
        this.waktu_main=waktu_main;
    }
    
    String getInfoProduk(){
        return "Info produk games\n" + super.getInfoproduk()+" \n"+"Waktu main: "+waktu_main+ " menit";
    }
    
}

//mulai no 5
class Produk5{
    String judul, penulis;

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    
    String getInfoproduk(){
        return "Judul: "+getJudul()+"\nPenulis: "+getPenulis();
    }
}

class Komik5 extends Produk5{
    int jumlah_halaman;

    public int getJumlah_halaman() {
        return jumlah_halaman;
    }

    public void setJumlah_halaman(int jumlah_halaman) {
        this.jumlah_halaman = jumlah_halaman;
    }
    
    String getInfoProduk(){
        return "Info produk komik\n" +super.getInfoproduk() + "\nJumlah Halaman: " + getJumlah_halaman();
    }
}

class Games5 extends Produk5{
    int waktu_main;

    public int getWaktu_main() {
        return waktu_main;
    }

    public void setWaktu_main(int waktu_main) {
        this.waktu_main = waktu_main;
    }
    
    String getInfoProduk(){
        return "Info produk games\n" +super.getInfoproduk() + "\nWaktu main: " + getWaktu_main()+ " menit";
    }
}

//mulai no 6
abstract class Produk6{
    String judul, penulis;

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    
    String getInfoproduk(){
        return "Judul: "+getJudul()+"\nPenulis: "+getPenulis();
    }
}

class Komik6 extends Produk6{
    int jumlah_halaman;

    public int getJumlah_halaman() {
        return jumlah_halaman;
    }

    public void setJumlah_halaman(int jumlah_halaman) {
        this.jumlah_halaman = jumlah_halaman;
    }
    
    String getInfoProduk(){
        return "Info produk komik\n" +super.getInfoproduk() + "\nJumlah Halaman: " + getJumlah_halaman();
    }
}

class Games6 extends Produk6{
    int waktu_main;

    public int getWaktu_main() {
        return waktu_main;
    }

    public void setWaktu_main(int waktu_main) {
        this.waktu_main = waktu_main;
    }
    
    String getInfoProduk(){
        return "Info produk games\n" +super.getInfoproduk() + "\nWaktu main: " + getWaktu_main()+ " menit";
    }
}

//mulai no 7
class Kendaraan{
    public String model;

    public Kendaraan(String model) {
        this.model = model;
    }
    
    public void informasi(){
        System.out.println("Model kendaraan: "+model);
    }
}

class Mobil extends Kendaraan{
    public String nama, jenis;

    public Mobil(String model,String nama, String jenis) {
        super(model);
        this.nama = nama;
        this.jenis = jenis;
    }
    
    @Override
    public void informasi(){
        super.informasi();
        System.out.println("Nama : "+nama);
        System.out.println("Jenis : "+jenis);
    }
}

class Pesawat extends Kendaraan{
    public String nama, jenis;

    public Pesawat(String model,String nama, String jenis) {
        super(model);
        this.nama = nama;
        this.jenis = jenis;
    }
    
    
    @Override
    public void informasi(){
        super.informasi();
        System.out.println("Nama : "+nama);
        System.out.println("Jenis : "+jenis);
        
    }
}

class Kapal_laut extends Kendaraan{
    public String nama, jenis;

    public Kapal_laut(String model,String nama, String jenis) {
        super(model);
        this.nama = nama;
        this.jenis = jenis;
    }
    
    
    @Override
    public void informasi(){
        super.informasi();
        System.out.println("Nama : "+nama);
        System.out.println("Jenis : "+jenis);   
    }
}