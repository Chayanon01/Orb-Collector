import greenfoot.*;  

public class fireBall extends prop{
    public int fallSpeed = 2;
    public int ac = 0;
    
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
            Greenfoot.playSound("Scream.mp3");
            getWorld().removeObject(this);
            Greenfoot.setWorld(new GameOver());
        }else if(isTouching(Protection.class)){
            getWorld().removeObject(this);
        }
    }
}
