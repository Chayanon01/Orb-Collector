import greenfoot.*;

public class spawner extends Actor
{
    public int n1; //bad
    
    public void act(){
        spawn();
    }    
    
    public void spawn(){
        if(Greenfoot.getRandomNumber(1000) < 5+n1){
            getWorld().addObject(new fireBall(),Greenfoot.getRandomNumber(970),0);
        }
        
        if(Greenfoot.getRandomNumber(1000) < 5+n1){
            getWorld().addObject(new badOrb(),Greenfoot.getRandomNumber(970),0);
        }
        
        if(Greenfoot.getRandomNumber(1000) < 30){
            getWorld().addObject(new orb(),Greenfoot.getRandomNumber(970),0);
        }
        
        if(Greenfoot.getRandomNumber(1000) < 10){
            getWorld().addObject(new goodOrb(),Greenfoot.getRandomNumber(970),0);
        }
        
        if(Greenfoot.getRandomNumber(1000) < 5+n1){
            getWorld().addObject(new snake(),960,415);
        }
        
        if(Greenfoot.getRandomNumber(1000) < 5+n1){
            getWorld().addObject(new snake1(),10,415);
        }
        
    }
}
