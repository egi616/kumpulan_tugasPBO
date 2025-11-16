/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;

class Run extends Thread{
    
    //String jalan;
    
    //Run(String jalan){
    //    this.jalan=jalan;
    //}
    
    public void run(){
        //for(int i = 0;i<5;i++){
            
            System.out.print("\nprogram sedang berjalan masukan jumhlah baris dan kolomnya");
            try{
                Thread.sleep(1);  //delay berapa detik 
            }catch(Exception e){
                System.out.println(e);
            }
        //}
    }
    
}
public class Lima {
    public static void main(String[] args) throws InterruptedException {
        //Run r = new Run("program");
        Run r = new Run();
        r.start();
        r.join();
        
        System.out.print("\nMasukan jumlah baris: ");
        int baris= In.SCANNER.nextInt();
        System.out.print("Masukan jumlah kolom: ");
        int kolom = In.SCANNER.nextInt();
        
        int [][] matrik1= new int [baris][kolom];
        int [][] matrik2=new int [baris][kolom];
        int[][]hasil= new int [baris][kolom];
        
        System.out.print("Masukan elemen matriks ke 1\n");
        for(int i=0; i< baris;i++){
            for(int j =0; j < kolom;j++){
                System.out.print("["+ i+"]["+j+"]= ");
                matrik1[i][j]=In.SCANNER.nextInt();
            }
        }
        System.out.println();
        
        System.out.print("Masukan elemen matriks ke 2\n");
        for(int i=0; i< baris;i++){
            for(int j =0; j < kolom;j++){
                System.out.print("["+ i+"]["+j+"]= ");
                matrik2[i][j]=In.SCANNER.nextInt();
            }
        }
        
        System.out.println();
        for(int i=0; i< baris;i++){
            for(int j =0; j < kolom;j++){
                hasil[i][j]=matrik1[i][j]+matrik2[i][j];
                
            }
        }
        
        for(int i=0; i< baris;i++){
            for(int j =0; j < kolom;j++){
                System.out.print(hasil[i][j]+ "\t");   
            }
            System.out.println();
        }
    }
}
