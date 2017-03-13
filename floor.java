import greenfoot.*; 

public class floor extends prop{    
    public void act(){
        removeTouching(orb.class);
        removeTouching(badOrb.class);
        removeTouching(goodOrb.class);
        removeTouching(fireBall.class);
    }    
}
