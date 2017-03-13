import greenfoot.*;

public class goodOrb extends prop{
    public int fallSpeed = 2;
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
            MyWorld.updateScore(points); 
            getWorld().removeObjects(getWorld().getObjects(badOrb.class));
            getWorld().removeObjects(getWorld().getObjects(fireBall.class));
            getWorld().removeObjects(getWorld().getObjects(snake.class));
            getWorld().removeObjects(getWorld().getObjects(snake1.class));
            getWorld().removeObjects(getWorld().getObjects(Protection.class));
            getWorld().removeObject(this);
        }
    }
}
