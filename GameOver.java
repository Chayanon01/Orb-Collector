import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    public GameOver()
    {    
        super(970, 520, 1); 
        spawn();
    }
    
    public void spawn(){
        addObject(new back(), 125, 450);
        addObject(new restart(), 825, 450);
        addObject(new scoreBoard() , 495 , 300);
    }
}
