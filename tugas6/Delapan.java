/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;

class CetakThread1 extends Thread{
    
    String thread;
    
    CetakThread1(String thread){
        this.thread=thread;
    }
    
    public void run(){
        for(int i = 0;i<5;i++){
            System.out.println(thread + "1 dijalankan");
            try{
                Thread.sleep(10);  //delay berapa detik 
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }   
}

class CetakThread2 extends Thread{
    
    String thread2;
    
    CetakThread2(String thread2){
        this.thread2=thread2;
    }
    
    public void run(){
        for(int i = 0;i<5;i++){
            System.out.println(thread2 + "2 dijalankan");
            try{
                Thread.sleep(2000);  //delay berapa detik 
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }   
}

public class Delapan {
    public static void main(String[] args) throws InterruptedException {
        
           CetakThread1 thrd = new CetakThread1("thread ");
           CetakThread2 thrd2 = new CetakThread2("thread ");
            thrd.start();
            thrd2.start();
            
            thrd.join();
            thrd2.join();
        
        System.out.println("thread program selesai");
    }
}
