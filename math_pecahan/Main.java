package math_pecahan;

public class Main {

    public static void main(String[] args) {
        //Deklarasi Pecahan 1
        Pecahan obj1 = new Pecahan(3, 2);
    
    //Tampilkan pecahan
    System.out.println("====== PECAHAN ======\n");
    System.out.println("Object 1 = " + obj1.getPembilang() + "/" + obj1.getPenyebut());
    
    //Tampilkan Hasil Tambah
    Pecahan p;
    int x, y;	
       
    p = obj1.tambah(obj1);

    x = p.pembilang;
    y = p.penyebut;        
    System.out.println("Hasil = " + x + "/" + y);
    
    }

}
