import greenfoot.*;  

public class snake extends character{
    //public int speed;
    int speed = 3;
    public void act(){
        move(-speed);
        check();
    }    
    
    public void check(){
        if(isTouching(knight.class)){
            Greenfoot.playSound("Scream.mp3");
            Greenfoot.setWorld(new GameOver());
        }
    }  
}
