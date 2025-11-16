/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;

/**
 *
 * @author ACER
 */
public class Empat {
    public static void main(String[] args) {
        System.out.print("Masukan jumlah mahasiswa: ");
        int n =In.SCANNER.nextInt();
        In.SCANNER.nextLine();
        
        String[] nama = new String[n];
        int[] nilai = new int [n];
        String[] status = new String[n];
        
        for(int i =0; i < n; i++){
            System.out.println("\nMahasiswa ke-"+(i+1));
            System.out.print("Masukan nama: ");
            nama[i] =In.SCANNER.nextLine();
            System.out.print("Masukan nilai: ");
            nilai[i]=In.SCANNER.nextInt();
            In.SCANNER.nextLine();
            
            status[i]=(nilai[i]>50)? "lulus" : "tidak lulus";
        }
         System.out.println("Daftar Nilai Mahasiswa");
            System.out.println("No\tNama\t\tNilai\tStatus");
            for (int i = 0; i < n; i++) {
                System.out.println((i + 1) + "\t" + nama[i] + "\t\t" + nilai[i] + "\t" + status[i]);
            }
    }
}
