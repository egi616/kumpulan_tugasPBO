/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;

/**
 *
 * @author ACER
 */
public class Enam {
    public static void main(String[] args) {
         try{
            System.out.print("Masukan jumlah angka: ");
            int jumlah= In.SCANNER.nextInt();
            
            int[] angka= new int[jumlah];
            
            for(int i=0; i<jumlah;i++){
                System.out.print("Masukan angka ke-"+(i+1)+" : ");
                angka[i]=In.SCANNER.nextInt();
            }
            
            int total=0;
            for(int n : angka){
                total+=n;
            }
            
            double rata_rata= (double) total/jumlah;
             System.out.println("rata rata angka dalam array: "+rata_rata);
        }catch(Exception e){ //banyak kumpulan 
            System.out.println("terjadi kesalahan input harus bilangan "+e);
        }

    }
}
