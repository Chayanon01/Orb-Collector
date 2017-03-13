import greenfoot.*; 

public class badOrb extends prop{
    public int fallSpeed = 2;
    public int ac = 0;
    private int num;
    
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
            for(num = 0; num < 96; num++){
                getWorld().addObject(new fireBall(),num*30,0);
            }
            getWorld().addObject(new Protection(),Greenfoot.getRandomNumber(970),180);
            getWorld().removeObject(this);
        }
    }
}

