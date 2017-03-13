import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startPage extends World
{
    
    public startPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(970, 520, 1); 
        addObject(new StartButton(), 485, 240);
        addObject(new InsButton(), 485, 354); 
    }
    
}
