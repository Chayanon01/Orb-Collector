import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Easy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Easy extends Button
{
    spawner s1 = new spawner();
    public void act() 
    {
       if(Greenfoot.mouseClicked(this)){
          s1.n1 = 5;
          Greenfoot.setWorld(new MyWorld());
       }
    }     
}
