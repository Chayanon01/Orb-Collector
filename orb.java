import greenfoot.*;

public class orb extends prop{
    private int fallSpeed = 2;
    public int ac = 0;
    public int points = 1;
    
    public void act(){
        drop();
        collect();
    }    
    
    public void drop(){
        setLocation(getX(), getY() + fallSpeed);
        fallSpeed = fallSpeed + ac;
    }
    
    public void collect(){
        if(isTouching(knight.class)){
            Greenfoot.playSound("ding.mp3");
            getWorld().removeObject(this);
            MyWorld.updateScore(points); 
        }
    }
}
