package tugas3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //no 1 slip gaji
        Paycheck pc = new Paycheck();
        pc.paycheck();
        pc.totalGaji();
        pc.pajakGaji();
        pc.gajiBersih();
      
        //tugas no 2 data input stream dan output stream
        DataInputStream_DataOutputStream testIOS = new DataInputStream_DataOutputStream();
        testIOS.IOstream();
         
        //tugas no 3 perbedaan scnanner dan buffer reader 
        ScannerN_bufferReader test_input1 = new ScannerN_bufferReader();
        test_input1.contoh_scanner();
        
        ScannerN_bufferReader test_input2 = new ScannerN_bufferReader();
        test_input2.contoh_buffered();
        
        //no 4 
        Sentripetal sp = new Sentripetal();
        sp.sentripetal();
        
        
        //no 5 bu sisca
        BuahBuferedReader bhr = new BuahBuferedReader();
        bhr.buah();
        
        //no 6 selisih waktu
        Selisih_waktu sw = new Selisih_waktu();
        sw.hitungSW();
        
        //no 6 percetakan
        Percetakan fc = new Percetakan();
        fc.waktu();
    }
}