/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author ACER
 */
public class Lima {
    public void lima(){
        int baris =5;
        
        System.out.println("Segitiga pertama");
        for(int i= 1;i<=baris;i++){
            for(int j = baris; j>i;j--){
                System.out.print(" ");
            }
            for(int k = 1; k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("Segitiga kedua");
        for(int i= 1;i<=baris;i++){
            for(int j = baris; j>i;j--){
                System.out.print(" ");
            }
            for(int k = 1; k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i= baris-1;i>=1;i--){
            for(int j = baris; j>i;j--){
                System.out.print(" ");
            }
            for(int k = 1; k <=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
