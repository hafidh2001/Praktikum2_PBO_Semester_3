package gamefight;

//Class
public class GameCharacter {
    private String name;
    private int life_Point;
    private int attackHitPoint;
    private int attackKickPoint;
    
    //Constructor
    public GameCharacter(String name, int hit, int kick) {
        this.life_Point = 100;
        this.name = name;
        this.attackHitPoint = hit;
        this.attackKickPoint =  kick;
    }
    
    //Function
    public void hit(GameCharacter karB) {
        karB.life_Point = karB.life_Point - this.attackHitPoint;
    }
    
    public void kick(GameCharacter karB) {
        karB.life_Point = karB.life_Point - this.attackKickPoint;
    }
    
    //Getter name
    public String getName() {
        return name;
    }
    
    //Getter life_Point
    public int getLife_Point() {
        return life_Point;
    }

}


