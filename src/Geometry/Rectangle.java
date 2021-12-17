package Geometry;

/**
 *
 * @author Timo
 */
public class Rectangle {
    private final int[] topLeft;
    private final int[] bottomRight;
    
    public Rectangle(int[] topLeft, int[] bottomRight){
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
    
    public boolean isOverLapping(Rectangle other){
        int[] thisPosition = {
            this.topLeft[0] + (this.bottomRight[0] - this.topLeft[0])/2,
            this.topLeft[1] + (this.bottomRight[1] - this.topLeft[1])/2
        };
        int[] otherPosition = {
            other.topLeft[0] + (other.bottomRight[0] - other.topLeft[0])/2,
            other.topLeft[1] + (other.bottomRight[1] - other.topLeft[1])/2
        };
        int[] vectorSubstraction = {
            otherPosition[0] - thisPosition[0],
            otherPosition[1] - thisPosition[1]
        };
        int distance = (int) Math.sqrt(Math.pow(vectorSubstraction[0],2) + Math.pow(vectorSubstraction[1],2));
        if(distance < 90){
            return true;
        }
        return false;
    }
    
}
