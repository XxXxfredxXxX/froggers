package Map;

/**
 *
 * @author 
 */
public class Map implements MapInterface{
    public int[] dimension;
    public int[] frogPosition;
    public int[][] carPositions;
    public String[] carPicturePaths;

    @Override
    public void setFrogPosition(int[] frogPosition) {
        this.frogPosition = frogPosition;
    }
    
    
    public String[] getCarPicturePaths() {
        return carPicturePaths;
    }

    public void setCarPicturePaths(String[] carPicturePaths) {
        this.carPicturePaths = carPicturePaths;
    }

    @Override
    public void setCarPosition(int[][] carPositions) {
        this.carPositions = carPositions;
    }

    @Override
    public int[] getFrogPosition() {
        return this.frogPosition;
    }

    @Override
    public int[][] getCarPositions() {
        return this.carPositions;
    }
    
}
