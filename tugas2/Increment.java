package tugas2 ;

public class Increment {
    int angka1 = 5;
    int angka2;
    
    public Increment(int angka1, int angka2){
        this.angka1 = angka1;
        this.angka2 = angka2;
        System.out.println("angka awal merupakan: "+angka2);
    }
    
    void pre_increment(){
        angka2 = ++angka1;
        System.out.println("angka setelah dilakukan pre_increment: "+angka2);
    }
    
    void post_increment(){
        angka2 = angka1++;
        System.out.println("angka setelah dilakukan post_increment: "+angka2);
    }
}