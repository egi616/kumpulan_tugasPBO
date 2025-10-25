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
public class HitungLuas {
    float sisi, alas, tinggi, atas, r, luas,d1,d2;
    
    Scanner input = new Scanner(System.in);
    
    
    void hitungLuas(){
        System.out.println("Menghitung luas");       
    }
    
    void Menu(){
        Persegi p = new Persegi(0,0);
        Segitiga s = new Segitiga(0,0);
        Lingkaran l = new Lingkaran(0);
        Trapesium t = new Trapesium(0,0,0);
        LayangLayang ly = new LayangLayang(0,0);
        System.out.println("Menu");
        System.out.println("1.Menghitung luas Lingkaran");
        System.out.println("2.Menghitung luas Segitiga");
        System.out.println("3.Menghitung luas Lingkaran");
        System.out.println("4.Menghitung luas Trapesium");
        System.out.println("5.Menghitung luas Layang-layang");
        System.out.println("0.Keluar");
        System.out.print("Masukan pilihan anda: ");
        int pilihan = input.nextInt();
        switch(pilihan){
            case 0:
                System.out.println("Keluar dari menu");
                return;
            case 1:
                p.hitungLuas();
                break;
            case 2:
                s.hitungLuas();
                break;
            case 3:
                l.hitungLuas();
                break;
            case 4:
                t.hitungLuas();
                break;
            case 5:
                ly.hitungLuas();
                break;
            default:
                System.out.println("Pilihan invalid");
                break;
        }
    }
    
}        
    
    class Persegi extends HitungLuas{
        
        Persegi(float sisi, float luas){
            this.sisi=sisi;
            this.luas=luas;
        }
        
        @Override
        void hitungLuas(){
           System.out.print("Masukan sisi: ");
           sisi = input.nextFloat();
           luas=sisi*sisi;
           System.out.println("Luas persegi dengan sisi "+sisi+" luas "+luas);
        }
        
    }
    
    class Segitiga extends HitungLuas{
        Segitiga(float alas, float tinggi){
            this.alas=alas;
            this.tinggi=tinggi;
        }
        
        @Override
        void hitungLuas(){
            System.out.print("Masukan alas: ");
            alas=input.nextFloat();
            System.out.print("Masukan tinggi: ");
            tinggi=input.nextFloat();
            luas= 0.5f * alas * tinggi;
            System.out.println("Luas segitiga dengan alas "+alas+" dan tinggi "+tinggi+" adalah "+luas);
        }
    }
    
    class Lingkaran extends HitungLuas{
        Lingkaran(float r){
            this.r=r;
        }
        
        @Override
        void hitungLuas(){
            System.out.print("Masukan jari-jari(r): ");
            r= input.nextFloat();
            luas = 3.14f * r * r;
            System.out.println("Luas dari segitiga dengan jari-jari "+r+" adalah "+luas);
        }
    }
    
    class Trapesium extends HitungLuas{
        Trapesium(float alas, float atas, float tinggi){
            this.alas=alas;
            this.atas=atas;
            this.tinggi=tinggi;
        }
        
        @Override
        void hitungLuas(){
            System.out.print("Masukan atas: ");
            atas=input.nextFloat();
            System.out.print("Masukan alas: ");
            alas=input.nextFloat();
            System.out.println("Masukan tinggi: ");
            tinggi=input.nextFloat();
            luas = 0.5f * (atas+alas)*tinggi;
            System.out.println("Luas dari trapesium adalah: "+ luas);
        }
    }
    
    class LayangLayang extends HitungLuas{
        LayangLayang(float d1, float d2){
            this.d1=d1;
            this.d2=d2;
        }
        
        void hitungluas(){
            System.out.print("Masukan diagonal pertama: ");
            d1=input.nextFloat();
            System.out.print("Masukan diagonal kedua: ");
            d2=input.nextFloat();
            luas =0.5f * d1 * d2;
            System.out.println("Luas dari Layang-layang adalah: ");
            
        }
    }

