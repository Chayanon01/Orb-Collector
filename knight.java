import greenfoot.*; 

public class knight extends character{
    GreenfootImage img1 = new GreenfootImage("stand2.png");
    GreenfootImage img2 = new GreenfootImage("stand1.png");
    GreenfootImage img3 = new GreenfootImage("walk2.png");
    GreenfootImage img4 = new GreenfootImage("walk1.png");
    private int count;
    private int num = 1;
    private int speed = 0;
    private final double jumps = 30;
    private final double gravity = 1.2;
    private int groundLevel = 415;
    public int n = 5;
    
    public void act(){
        checkKey();
        jump();
    }    
    
    public void checkKey(){
        if(Greenfoot.isKeyDown("right")){
            walk1();
            setLocation(getX()+n, getY());
        }else if(Greenfoot.isKeyDown("left")){
            walk2();
            setLocation(getX()-n, getY());
        }
    }
    
    public void walk1(){
        if(count >= 5){
           if(num == 4){
               num = 1;
           }
           if(num == 1 || num == 3){
               setImage("walk1.png");
               num++;
           }else if(num == 2){
               setImage("stand1.png");
               num++;
           }
           count = 0;
        }
        count++;
    }
    
    public void walk2(){
        if(count >= 5){
           if(num == 4){
               num = 1;
           }
           if(num == 1 || num == 3){
               setImage("walk2.png");
               num++;
           }else if(num == 2){
               setImage("stand2.png");
               num++;
           }
           count = 0;
        }
        count++;
    }
    
    public void jump(){
        boolean onGround = (getY() > groundLevel);
        if(!onGround){
           speed++;
           setLocation(getX(), getY()+speed);
           if(getY()==415){
                setLocation(getX(), groundLevel);
           }
        }else{
            if(Greenfoot.isKeyDown("space")){
                /*if(getImage() == img2 || getImage() == img4){
                    setImage("jump1.png");
                }else{
                    setImage("jump2.png");
                }*/
                speed = -20;
                setLocation(getX(), getY()+speed);
            }
        }
    }
    
}
