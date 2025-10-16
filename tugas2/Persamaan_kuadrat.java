package tugas2;

public class Persamaan_kuadrat {
    double a, b, c;
    
    public Persamaan_kuadrat(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }    
    
    void hitung_perKuadrat(){
        double d = b * b - 4 * a * c;   //->=b^2-4*a*c
        System.out.println("Diskriminan: "+d);  //diskriminan -> angka pemdeda
        
        if(d>0){
            double akar1 = (-b + Math.sqrt(d))/(2*a);       //math.sqrt fungsi bawaan java untuk menghitung akar
            double akar2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("Akar 1 = "+akar1);
            System.out.println("Akar 2 = "+akar2);
        }
    }
}
