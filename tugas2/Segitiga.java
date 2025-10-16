/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author ACER
 */
public class Segitiga {
    int a,b;           //a tinggi, b alas, c sisi miring  
    double luas,c,keliling;     

    public Segitiga(int a,int b) {
        this.a=a;
        this.b=b;
    }
    
    void luas_se(){
        luas= 0.5*a*b;
        System.out.println("tingg: "+a);
        System.out.println("alas: "+b);
        System.out.println("hasil luas: "+luas);
    }
    
    void keliling(){    //rumus phytagoras
        c  = Math.sqrt(a*a+b*b);     //untuk mencari sisi miring
        keliling = a+b+c;
        System.out.println("Sisi miring: "+c);
        System.out.println("Keliling segitiga: "+keliling);
    }
    
}
