import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InsButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InsButton extends Button
{
    /**
     * Act - do whatever the InsButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(Greenfoot.mouseClicked(this)){
            getWorld().addObject(new Control(), 485, 260);
            getWorld().addObject(new Next(), 825, 450);
            getWorld().addObject(new back(), 100, 450);
       }
    }    
}
