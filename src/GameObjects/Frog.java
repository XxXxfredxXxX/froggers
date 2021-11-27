package GameObjects;

/**
 *
 * @author 
 */
public class Frog {
    private Boolean life = true;
    public final int stepsize = 0;
    
    public void die(){
        
    }
    
    public Boolean isDead(){
        return false;
    }
    
    public int getStepsize(){
        return this.stepsize;
    }
}
