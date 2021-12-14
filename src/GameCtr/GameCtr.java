package GameCtr;

import Direction.Direction;
import GameObjects.Car;
import GameObjects.Frog;
import Geometry.Rectangle;
import Map.Map;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author fridtjof
 */
public class GameCtr implements GameCtrInterface {
    
    private Car[] cars;
    private Frog frog;
    private int level;
    private int updateSpeed = 30;
    private Map map;
    
    public void setMap(Map map){
        this.map = map;
    }
    
    private void setLevel(int level){
        this.level = level;
    }
    
    
    
    private int getNewCarPosition(Car car){
        int positionShift = 0;
        if(car.getDirection() == Direction.LEFT){
            return positionShift -= car.getStepsize();
        }else{
            return positionShift += car.getStepsize();
        }
    }
    
    private void setNewCarPosition(int carIndex){
        Car currentCar = this.cars[carIndex];
        int[][] currentCarPosition = this.map.getCarPositions();
        currentCarPosition[carIndex][0] += this.getNewCarPosition(currentCar);
        this.map.setCarPosition(currentCarPosition);
    }
    
    private void updateCarPositions(){
        for(int x = 0;x < this.map.carPositions.length;x++){
            this.setNewCarPosition(x);
        }
    }
    
    private void keyUp(){
        int[] currentPosition = this.map.getFrogPosition();
        currentPosition[1] -= this.frog.getStepsize();
        this.map.setFrogPosition(currentPosition);
    }

    private void keyLeft(){
        int[] currentPosition = this.map.getFrogPosition();
        currentPosition[0] -= this.frog.getStepsize();
        this.map.setFrogPosition(currentPosition);
    }
    
    private void keyRight(){
        int[] currentPosition = this.map.getFrogPosition();
        currentPosition[0] += this.frog.getStepsize();
        this.map.setFrogPosition(currentPosition);
    }
    
    private void keyDown(){
        int[] currentPosition = this.map.getFrogPosition();
        currentPosition[1] += this.frog.getStepsize();
        this.map.setFrogPosition(currentPosition);
    }
    
    private int isCollided(){
        for(int x = 0;x < 3;x++){
            if(this.isCarColidetWithFrog(x)){
                return x;
            }
        }
        return Integer.MAX_VALUE;
    }
    
    private Boolean isCarColidetWithFrog(int carId){
        int[] CarDimension = this.cars[carId].getPictureDimension();
        int[] CarTopLeftCorner = this.map.carPositions[carId].clone();
        int[] CarBottomRightCorner = this.map.carPositions[carId].clone();
        CarBottomRightCorner[0] = CarTopLeftCorner[0] + CarDimension[0];
        CarBottomRightCorner[1] = CarTopLeftCorner[1] + CarDimension[1];
        Rectangle first = new Rectangle(CarTopLeftCorner, CarBottomRightCorner);
        
        int[] frogDimension = this.frog.getPictureDimension();
        int[] frogTopLeftCorner = this.map.frogPosition.clone();
        int[] frogBottomRightCorner = this.map.frogPosition.clone();
        frogBottomRightCorner[0] = frogTopLeftCorner[0] + frogDimension[0];
        frogBottomRightCorner[1] = frogBottomRightCorner[1] + frogDimension[0];
        Rectangle second = new Rectangle(frogTopLeftCorner, frogBottomRightCorner);
        if(first.isOverLapping(second)){
            this.cars[carId].colideFrog(this.frog);
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public void setFrog(Frog frog) {
        this.frog = frog;
    }

    @Override
    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public void start() {
        while(true){
            for(int x = 0;x < cars.length;x++){
                //this.isCarColidetWithFrog(x);
            }
            if(this.frog.isDead()){
                this.updateCarPositions();
            }
            try {
                TimeUnit.MILLISECONDS.sleep(1000/this.updateSpeed);
            } catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(GameCtr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int levelUp() {
        this.level += 1;
        return this.level;
    }

    @Override
    public void stop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getUpdateSpeed() {
        return this.updateSpeed;
    }
    
}
