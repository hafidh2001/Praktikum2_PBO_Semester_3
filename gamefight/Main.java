package gamefight;

public class Main {

    public static void main(String[] args) {
        //Deklarasi Character
        GameCharacter Raiden = new GameCharacter("Raiden", 10, 20);
        GameCharacter SubZero = new GameCharacter("Raiden", 5, 25);
        
        System.out.println("***HEALTH AWAL***");
        System.out.println("Health Raiden  : " + Raiden.getLife_Point());
        System.out.println("Health SubZero : " + SubZero.getLife_Point());
        System.out.println("\n");
        
        //Mulai Pertandingan
        System.out.println("================ GAME FIGHT READY ================\n");
        
        //Raiden melakukan tendangan pada SubZero
        Raiden.kick(SubZero);
        
        System.out.println("Raiden melakukan tendangan pada SubZero");
        System.out.println("Health Raiden  : " + Raiden.getLife_Point());
        System.out.println("Health SubZero : " + SubZero.getLife_Point());
        System.out.println("\n");
        
        //SubZero melakukan tendangan pada Raiden
        SubZero.kick(Raiden);
      
        System.out.println("SubZero melakukan tendangan pada Raiden");
        System.out.println("Health Raiden  : " + Raiden.getLife_Point());
        System.out.println("Health SubZero : " + SubZero.getLife_Point());
        System.out.println("\n");
        
        //SubZero melakukan pukulan sebanyak 3x pada Raiden
        for (int i=0; i<3; i++) {
            SubZero.hit(Raiden);
        }
        
        System.out.println("SubZero melakukan pukulan sebanyak 3x pada Raiden");
        System.out.println("Health Raiden  : " + Raiden.getLife_Point());
        System.out.println("Health SubZero : " + SubZero.getLife_Point());
        System.out.println("\n");
        
        //Raiden melakukan tendangan sebanyak 4x pada SubZero
        for (int i=0; i<3; i++) {
            Raiden.kick(SubZero);
        }
        
        System.out.println("Raiden Melakukan tendangan sebanyak 4x pada SubZero");
        System.out.println("Health Raiden  : " + Raiden.getLife_Point());
        System.out.println("Health SubZero : " + SubZero.getLife_Point());
        System.out.println("\n");
        
        //Pertandingan Selesai
        System.out.println("================ GAME FIGHT FINISH ================\n");
    
    
        //Hasil Pertandingan
        if (Raiden.getLife_Point() > SubZero.getLife_Point()) {
            System.out.println("Winner : Raiden" );
            System.out.println("KO     : SubZero" );
        } else if (SubZero.getLife_Point() > Raiden.getLife_Point()) {
            System.out.println("Winner : SubZero");
            System.out.println("KO     : Raiden" );
        } else {
            System.out.println("Draw");
        }
    }
    
}
