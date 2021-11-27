package GameCtr;

import GameObjects.Car;
import GameObjects.Frog;

/**
 *
 * @author 
 */
public interface GameCtrInterface {
    public void setFrog(Frog frog);
    public void setCars(Car[] cars);
    public void start();
    public int getLevel();
    public int levelUp();
    public void stop();
    public int getUpdateSpeed();
}
