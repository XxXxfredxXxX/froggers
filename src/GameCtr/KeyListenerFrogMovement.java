package GameCtr;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerFrogMovement implements KeyListener{
    private GameCtr game;
    
    public void setGameCtr(GameCtr game){
        this.game = game;
    }
    
    @Override
    public void keyTyped(KeyEvent event) {
        //
    }

    @Override
    public void keyPressed(KeyEvent event) {
                if(event.getKeyCode()==KeyEvent.VK_A){
            this.game.keyLeft();
        }
        
        if(event.getKeyCode()==KeyEvent.VK_W){
            this.game.keyUp();
        }
        
        if(event.getKeyCode()==KeyEvent.VK_S){
            this.game.keyDown();
        }
        
        if(event.getKeyCode()==KeyEvent.VK_D){
            this.game.keyRight();
        }
    }

    @Override
    public void keyReleased(KeyEvent event) {
        //
    }
    
}
