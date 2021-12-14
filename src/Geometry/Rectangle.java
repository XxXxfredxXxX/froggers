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
        
        if(other.bottomRight[0] - this.topLeft[0] <= 100 &&
           other.bottomRight[0] - this.topLeft[0] >= 0   &&
           this.bottomRight[1] - other.topLeft[1] <= 100 &&
           this.bottomRight[1] - other.topLeft[1] >= 0   ||
           this.topLeft[0] - other.bottomRight[0] <= 100 &&
           this.topLeft[0] - other.bottomRight[0] >= 0   &&
           other.topLeft[1] - this.bottomRight[1] <= 100 &&
           other.topLeft[1] - this.bottomRight[1] >= 0
        ){
            return true;
        }
        if(this.bottomRight[0] - other.topLeft[0] <= 100 &&
           this.bottomRight[0] - other.topLeft[0] >= 0   &&
           this.bottomRight[1] - other.topLeft[1] <= 100 &&
           this.bottomRight[1] - other.topLeft[1] >= 0   ||
           other.bottomRight[0] - this.bottomRight[0] <= 100 &&
           other.bottomRight[0] - this.bottomRight[0] >= 0   &&
           other.bottomRight[1] - this.bottomRight[1] <= 100 &&
           other.bottomRight[1] - this.bottomRight[1] >= 0
        ){
            return true;
        }
        return false;
    }
    
}
