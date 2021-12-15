package GameObjects;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author timo, fridtjof
 */
public class Look {
    private String picturePath;
    private int[] pictureDimension;

    public void setPicturePath(String picturePath) throws IOException {
        BufferedImage bimg = ImageIO.read(new File(picturePath));
        this.setPictureDimension(bimg.getWidth(), bimg.getHeight());
        this.picturePath = picturePath;
    }

    private void setPictureDimension(int x, int y) {
        this.pictureDimension = new int[] {x,y};
    }
    
    public int[] getPictureDimension(){
        return this.pictureDimension;
    }
    
    
    public String getPicturePath()
    {
        return this.picturePath;
    }
    
}
