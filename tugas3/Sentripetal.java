package tugas3;
import java.util.Scanner;

public class Sentripetal {
    double m, v, r, fc;
    Scanner in = new Scanner(System.in);
    
    void sentripetal(){
        System.out.print("Masukan M\t: ");
        m =in.nextDouble();
        System.out.print("Masukan V\t: ");
        v =in.nextDouble();
        System.out.print("Masukan r\t: ");
        r=in.nextDouble();
        fc= m* Math.pow(v,2)/r;
        System.out.print("Hasil fc\t: "+fc);
    }
    
}