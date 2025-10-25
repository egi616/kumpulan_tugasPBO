/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author ACER
 */
import java.util.Scanner;

public class Ganjil_genap {
    
    int x;
    
    Scanner in = new Scanner(System.in);
    
    public void cek_jilnap(){
        System.out.print("Masukan angka untuk di cek: ");
        x= in.nextInt();
        if(x % 2 == 0 ){
            System.out.print(+ x +" bilangan genap");
        }else{
            System.out.print(+ x +" bilangan ganjil");
        }
    }
}
