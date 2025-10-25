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

public class Kabisat {
    
    public void kabisat (){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Tahun (1909 - 2024) : ");
        int tahun = input.nextInt();

        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
            System.out.println(tahun + " adalah tahun kabisat");
        } else {
            System.out.println(tahun + " bukan tahun kabisat");
        }
    }
}
