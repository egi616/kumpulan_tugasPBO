/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;

class CetakOrderan extends Thread{
    
    String orderan;
    
    CetakOrderan(String orderan){
        this.orderan=orderan;
    }
    
    public void run(){
        for(int i = 0;i<5;i++){
            System.out.println(orderan + " dipesan: "+ i);
            try{
                Thread.sleep(1000);  //delay berapa detik 
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
    
}



public class Tujuh {
    public static void main(String[] args) {
        CetakOrderan order1 = new CetakOrderan("Bakso");
        CetakOrderan order2 = new CetakOrderan("Mie ayam");
        order1.start();
        order2.start();
        
        System.out.println("program selesai");//paling cepet jadi paling atas
    }
}
