import greenfoot.*; 

public class Protection extends prop{
    private int x;
    public void act(){
       check();
       delete();
    }    
    
    public boolean check(){
        for(x = -970; x < 970; x++){
            Actor p = getOneObjectAtOffset(x, 0, fireBall.class);
            if(p != null){
                return true;
            }
        }
        return false;
    }
    
    public void delete(){
        if(check()){
            getWorld().removeObject(this);
        }
    }
}
