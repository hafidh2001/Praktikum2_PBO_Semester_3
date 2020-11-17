package math_pecahan;

public class Pecahan {
    public int pembilang;
    public int penyebut;

    //Constructor
    public Pecahan(int pembilang, int penyebut) {
        this.pembilang = pembilang;
        this.penyebut = penyebut;
    }
    
    //Getter pembilang
    public int getPembilang() {
        return pembilang;
    }
    
    //Getter Penyebut
    public int getPenyebut() {
        return penyebut;
    }
    
    //Function 
    public Pecahan tambah(Pecahan p) {
        int atas;   
        int bawah;
      
        Pecahan obj1;
	obj1 = p;       
	
	atas = p.pembilang;
        bawah = p.penyebut;
	
        //Deklarasi Pecahan 2
        Pecahan obj2 = new Pecahan(5,6); 
        System.out.println("Object 2 = " + obj2.getPembilang() + "/" + obj2.getPenyebut());
        System.out.println("\n");
        
        //Rumus + Syarat
	if(bawah == obj2.penyebut) {
            p.pembilang = atas + obj2.pembilang;
            p.penyebut = bawah;
            
        } else {
            p.pembilang = (obj2.penyebut * atas) + (bawah * obj2.pembilang);
            p.penyebut = bawah * obj2.penyebut;     
        
        }
        
        return p;    
    }
}
