package GameCtr;

import GameObjects.Car;
import GameObjects.Frog;

/**
 *
 * @author 
 */
public class GameCtr implements GameCtrInterface {
    
    private Car[] cars;
    private Frog frog;
    private int level;
    private int updateSpeed;
    
    private void setLevel(int level){
        
    }
    
    private void updateCarPositions(){
        
    }
    
    private void keyUp(){
        
    }

    private void keyLeft(){
        
    }
    
    private void keyRight(){
        
    }
    
    private void keyDown(){
        
    }
    
    private int isCollided(){
        return 0;
    }
    
    @Override
    public void setFrog(Frog frog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCars(Car[] cars) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getLevel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int levelUp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void stop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getUpdateSpeed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
