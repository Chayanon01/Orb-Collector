import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wallR here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wallR extends prop
{
    /**
     * Act - do whatever the wallR wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        removeTouching(snake1.class);
    }    
}
