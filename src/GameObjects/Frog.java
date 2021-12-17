package GameObjects;

/**
 *
 * @author fridtjof
 */
public class Frog extends Look {
    private Boolean life = true;
    public final int stepsize = 50;
    
    public void die(){
        this.life = false;
    }
    
    public Boolean isDead(){
        return this.life;
    }
    
    public int getStepsize(){
        return this.stepsize;
    }
}
