package View;

import Map.Map;

/**
 *
 * @author 
 */
public class View implements ViewInterface{
    private int UPS = 30;
    public String frogPicturePath;
    public String carPicturePath;
    private Map map;

    private int getNewCarPosition() {
        return 0;
    }

    private int getNewFrogPosition() {
        return 0;
    }
    
    private int getWindowDimension() {
        return 0;
    }

    @Override
    public void start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void stop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFrogPicturePath(String frogPicturePath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCarPicturePath(String carPicturePath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
