import greenfoot.*;  
public class MyWorld extends World
{
    private static int score;
    private static int score1;
    private static int score2;
    scoreBoard sc = new scoreBoard();
    int time = 90;
    int timer = 60;
    protected static GreenfootSound myMusic = new GreenfootSound("Game-Theme1.mp3");
    boolean Playing = true;
    public boolean end = false;
    
    public MyWorld(){    
        super(970, 520, 1); 
        setProp();
        setKnight();
        spawn();
        score = 0;
        scoreBoard sb = new scoreBoard();
        addObject(sb, 950, 25);
    }
    
    public void setProp(){
        addObject(new wallL(), 20, 260);
        addObject(new wallR(), 950, 260);
        addObject(new grass1(), 485, 390);
        addObject(new grass(), 485, 475);
        addObject(new floor(), 485, 515);
    }
    
    public void setKnight(){
        addObject(new knight(), 485, 415);
    }
    
    public void spawn(){
        spawner s1 = new spawner();
        addObject(s1,970,22);   
        
        /*spawner s2 = new spawner();
        addObject(s2,970,22);*/   
    }
    
    public static void updateScore(int s){
        score += s;
    }
    
    public static String getScore(){
        return score+"";
    }
    
    public void act(){
        showText("Time : " + time , 925 , 50);
        if(timer == 0){
            time --;
            if(time == 0){
                Greenfoot.setWorld(new GameOver());
            }
            timer = 40;
        }
        timer -=1 ;
         if(Playing)
        {
            myMusic.playLoop();
            Playing = false;
        }

        if(end == true){
            stopped();
        }else {
            myMusic.playLoop();
        }
    }
    
    public void stopped()
    {
        myMusic.stop();
    }
}
