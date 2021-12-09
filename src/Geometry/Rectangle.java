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
        if (this.topLeft[0] > other.bottomRight[0] // R1 is right to R2 
            || this.bottomRight[0] < other.topLeft[0] // R1 is left to R2 
            || this.topLeft[1] < other.bottomRight[1] // R1 is above R2 
            || this.bottomRight[1] > other.topLeft[1]) { // R1 is below R1 
            return false; 
        }
        return true;
    }
    
}
