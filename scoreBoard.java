import greenfoot.*;
import java.awt.*;
import java.util.Calendar;

public class scoreBoard extends Actor{
    GreenfootImage image = new GreenfootImage(100,50);
    
    public void act() 
    {
        repaintScore();
    } 
    
    public scoreBoard(){
        String score = MyWorld.getScore();
        image.clear();
        image.setColor(Color.BLACK);
        image.fillRect(0,0,70,45);
        image.setColor(Color.WHITE);
        image.fillRect(2,2,65,40);
        
        image.setColor(Color.BLACK);
        image.drawString("Score:", 10, 25);
        image.drawString(score, 50, 25);
        setImage(image);
    }
    
    public void repaintScore(){
        String score = MyWorld.getScore();
        image.clear();
        image.setColor(Color.BLACK);
        image.fillRect(0,0,70,45);
        image.setColor(Color.WHITE);
        image.fillRect(2,2,65,40);
        
        image.setColor(Color.BLACK);
        image.drawString("Score:", 10, 25);
        image.drawString(score, 50, 25);
        setImage(image);
    }
}
