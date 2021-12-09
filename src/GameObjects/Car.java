package GameObjects;

import Direction.Direction;

/**
 *
 * @author fridtjof
 */
public class Car extends Look{
    private final int speed = 100;
    private int direction = Direction.RIGHT;
    public final int stepsize = 2;

    public int getSpeed() {
        return this.speed;
    }

    public int getDirection() {
        return this.direction;
    }

    public int getStepsize() {
        return this.stepsize;
    }
    
    public void setDirection(int direction){
        this.direction = direction;
    }
    
    public void colideFrog(Frog frog){
        frog.die();
    }
    
}
