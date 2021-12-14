package GameObjects;

import Direction.Direction;
import java.util.Random;

/**
 *
 * @author fridtjof
 */
public class Car extends Look{
    private final int speed = 100;
    private int direction;
    public final int stepsize = 2;

    public Car() {
        Random rand = new Random();
        int[] directions = {Direction.LEFT,Direction.RIGHT};
        this.direction = directions[rand.nextInt(2)];
    }

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
