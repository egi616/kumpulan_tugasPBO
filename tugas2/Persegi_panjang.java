package tugas2;
public class Persegi_panjang {
    
    int panjang = 50;
    int lebar = 45;
    int luas;
    
    public Persegi_panjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    void hitung_luas(){
        luas = panjang * lebar;
        
        System.out.println("panjang: "+panjang);
        System.out.println("lebar: "+lebar);
        System.out.println("hasil luas: "+luas);
        
    }
    
}