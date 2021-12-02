package GameCtr;

import GameObjects.Car;
import GameObjects.Frog;
import Map.Map;

/**
 *
 * @author 
 */
public class GameCtr implements GameCtrInterface {
    
    private Car[] cars;
    private Frog frog;
    private int level;
    private int updateSpeed;
    private Map map;
    
    public void setMap(Map map){
        this.map = map;
    }
    
    private void setLevel(int level){
        this.level = level;
    }
    
    private void updateCarPositions(int[][] newPositions){
        this.map.setCarPosition(newPositions);
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
        return 0;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
