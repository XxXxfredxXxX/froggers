package Map;

/**
 *
 * @author 
 */
public class Map implements MapInterface{
    public int[] dimension;
    public int[] frogPosition;
    public int[][] carPositions;

    @Override
    public void setFrogPosition(int[] frogPosition) {
        this.frogPosition = frogPosition;
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
