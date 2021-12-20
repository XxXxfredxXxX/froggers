package GameObjects;

import Direction.Direction;
import Map.Map;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fridtjof
 */
public class Car extends Look{
    private final int speed = 100;
    private int direction;
    public int stepsize = 2;

    public Car(){
        Random rand = new Random();
        int[] directions = {Direction.LEFT,Direction.RIGHT};
        this.direction = directions[rand.nextInt(2)];
        this.setPictureForDirection();   
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getDirection() {
        return this.direction;
    }
    
    private void setPictureForDirection(){
        if(this.getDirection() == 1){
            try {
                this.setPicturePath("src/img/car_left.png");
            } catch (IOException ex) {
                Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                this.setPicturePath("src/img/car_right.png");
            } catch (IOException ex) {
                Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void setStepsize(){
        Random rand = new Random();
        this.stepsize = rand.nextInt(3)+1;
}
    
    public int getStepsize() {
        return this.stepsize;
    }
    
    public String setDirection(int direction) throws IOException{
        this.direction = direction;
        this.setPictureForDirection();
        return this.getPicturePath();
    }
    
    public void colideFrog(Frog frog){
        frog.die();
    }
    
}
