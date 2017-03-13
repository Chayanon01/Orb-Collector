import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wallL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wallL extends prop
{
    /**
     * Act - do whatever the wallL wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        removeTouching(snake.class);
    }    
}
