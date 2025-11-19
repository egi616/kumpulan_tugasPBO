/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas7;

import static java.lang.System.in;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Tugas7 {
    public static void main (String[] args){
        
        //no 1
        //objek dibuat dengan cara panggil kelas yang ditujukan buat variabel objek lalu panggil lagi kelas yang dituju dengan keyword new
        Satu s = new Satu();
        s.tampil();
        System.out.println();
        
        //no2
        Dua d = new Dua(5,5);
        d.hitungkeliling();
        System.out.println();
        
        //no3
        Tiga ti = new Tiga();
        ti.konversi(ti.bulan, ti.tanggal);
        System.out.println();
        
        //no4
        Empat e = new Empat();
        e.sp1();
        e.sp2();
        e.sp3();
        System.out.println();
        
      //no5
        System.out.print("Masukan angka terakhir: ");
        int n = In.SCANNER.nextInt();
        Lima l = new Lima();
        l.printMundur(n);
        System.out.println();
        
        //no6
        Civitas cD = new Civitas("Bpk Lalan", "Dosen");
        List<MataKuliah> daftarDmk = new ArrayList<>();
        daftarDmk.add(new MataKuliah("Pemprograman java,"));
        daftarDmk.add(new MataKuliah("Pemprograman dasar"));
        Dosen d1 = new Dosen(cD, 123, daftarDmk);
        d1.tampil();
        
        
        Civitas cM = new Civitas("Estart", "Mahasiswa");
        List<MataKuliah> daftarMmk = new ArrayList<>();
        daftarMmk.add(new MataKuliah("Pemprograman Dasar,"));
        daftarMmk.add(new MataKuliah("Pemprograman java"));
        Mahasiswa m1 = new Mahasiswa(cM, 124, daftarMmk);
        m1.tampil();
           
        
        Civitas cS = new Civitas("Bpk ganjar", "Staff");
        Staff s1 = new Staff(cS, "125", "Perpustakawan");
        s1.tampil();
        
        
        
        //no7
        Tujuh t = new Tujuh();
        t.tampilIn();
        System.out.println();
    }
}

class Satu {
    //kelas Satu menjadi objek s yang nanti nya akan di panggil di main
    //methode tes untuk penggunaan objek s yang dibuat dari class Satu
    void tampil(){
        System.out.println("cek no 1 berhasih");
    }
}

class Dua {
    float panjang, lebar;
    
    public Dua(float panjang, float lebar){
        this.panjang=panjang;
        this.lebar=lebar;
    }
    
    public void hitungkeliling(){
        float keliling = 2 * (panjang + lebar);
        System.out.println("Hasil keliling: "+ keliling);
    }
    
}

class Tiga{
    int bulan, tanggal;
    
    public Tiga(){
        System.out.print("Masukan bulan: ");
        bulan = In.SCANNER.nextInt();
        System.out.print("Masukan tanggal: ");
        tanggal = In.SCANNER.nextInt();
    
    }
    
    void konversi(int bulan, int tanggal){
        int hasil = bulan * 100 + tanggal;
        System.out.println("Hasil akhir: "+hasil);
    }
}

class Empat{
    
    String sp;
    
    public Empat(){
        this.sp="Kami putra dan putri Indonesia ";
    }
    
    public void sp1(){
        System.out.println("mengaku bertumpah darah yang satu, tanah Indonesia");
    }
    
    public void sp2(){
        System.out.println("mengaku berbangsa yang satu, bangsa Indonesia");
    }
    
    public void sp3(){
        System.out.println("menjunjung bahasa persatuan, bahasa Indonesia");
    }
}

class Lima{
    
    //rekursif print maju 
    static void printMundur(int n){
        if(n==0)return;
        System.out.println(n);
        printMundur(n-1);
    }
       
}

class Tujuh{
    String nama, kelas;
    int npm;

    public Tujuh() {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }
    
    void tampilIn(){
        System.out.print("Masukan nama: ");
        this.nama = In.SCANNER.nextLine();
        System.out.print("Masukan npm: ");
        this.npm= In.SCANNER.nextInt();
        In.SCANNER.nextLine();
        System.out.print("Masukan kelas: ");
        this.kelas=In.SCANNER.nextLine();
    }

    void printMaju(int n) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

class In {
    public static final Scanner SCANNER = new Scanner(System.in);   
}

//kelas dari sini ke bawah bagian dari soal no 6
class Civitas{
    String nama, status;

    public Civitas(String nama, String status) {
        this.nama = nama;
        this.status = status;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getStatus(){
        return status;
    }
}

//komposisi class Dosen memiliki Matakuliah
class MataKuliah{
    String namaMk;

    public MataKuliah(String namaMk) {
        this.namaMk = namaMk;
    }
    
    public String getNamaMK(){
        return namaMk;
    }
}

class Dosen{
    
    //komposisi dari kelas Civitas
    Civitas datDosen;
    int nidn;
    
    //komposisi dosen memiliki banyak matakuliah
    List<MataKuliah> dmkList;

    public Dosen(Civitas datDosen, int nidn, List<MataKuliah> dmkList) {
        this.datDosen = datDosen;
        this.nidn = nidn;
        this.dmkList = dmkList;
    }
    
    void tampil(){
        System.out.println("Data Dosen");
        System.out.println("Nama : "+datDosen.getNama());
        System.out.println("Status : "+datDosen.getStatus());
        System.out.println("NIDN : "+nidn);
        System.out.print("Mengajar mata kuliah : ");
        for(MataKuliah mk : dmkList){
            System.out.print(" "+mk.getNamaMK());
        }
    }
}

class Mahasiswa{
    Civitas datMhs;
    int npm;
    List<MataKuliah> mmkList;

    public Mahasiswa(Civitas datMhs, int npm, List<MataKuliah> mmkList) {
        this.datMhs = datMhs;
        this.npm = npm;
        this.mmkList = mmkList;
    }
    
    void tampil(){
        System.out.println("Data Mahasiswa");
        System.out.println("Nama : "+ datMhs.getNama());
        System.out.println("Status : "+datMhs.getStatus());
        System.out.println("NPM : "+npm);
        System.out.print("Mata kuliah diambil: ");
        for(MataKuliah mk : mmkList){
            System.out.print(" " + mk.getNamaMK());
        }
        
    }
}

class Staff{
    Civitas datStaff;
    String idStaff;
    String divisi;

    public Staff(Civitas datStaff, String idStaff, String divisi) {
        this.datStaff = datStaff;
        this.idStaff = idStaff;
        this.divisi = divisi;
    }
    
    void tampil(){
        System.out.println("Data staff");
        System.out.println("Nama : "+datStaff.getNama());
        System.out.println("Status : "+datStaff.getStatus());
        System.out.println("Id staff : "+idStaff);
        System.out.println("Divisi : "+divisi);
        
   }
}