package GameObjects;

import Direction.Direction;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author Friedrich, Menko
 */
public class Car extends Look {
    private final int speed = 100;
    private int direction;
    public final int stepsize = 2;

    public Car() throws IOException {
        Random rand = new Random();
        int[] directions = {Direction.LEFT,Direction.RIGHT};
        this.direction = directions[rand.nextInt(2)];

        
        if(this.getDirection() == 1)
        {
            this.setPicturePath("src/img/car_left.png");

        }else
        {
            this.setPicturePath("src/img/car_right.png");

        }
        
        
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
