import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hard extends Button
{
    spawner s1 = new spawner();
    public void act() 
    {
       if(Greenfoot.mouseClicked(this)){
           s1.n1 = 15;
           Greenfoot.setWorld(new MyWorld());
       }
    }    
}
