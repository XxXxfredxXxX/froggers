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
        
        if(event.getKeyCode()==KeyEvent.VK_ENTER){
            this.game.togglePlay();
        }
        
        if(event.getKeyCode()==KeyEvent.VK_B){
            this.game.restart();
        }
        
        if(event.getKeyCode()==KeyEvent.VK_UP){
            this.game.keyUp();
        }
        
        if(event.getKeyCode()==KeyEvent.VK_DOWN){
            this.game.keyDown();
        }
        
        if(event.getKeyCode()==KeyEvent.VK_LEFT){
            this.game.keyLeft();
        }
        
        if(event.getKeyCode()==KeyEvent.VK_RIGHT){
            this.game.keyRight();
        }
    }

    @Override
    public void keyReleased(KeyEvent event) {
        //
    }
    
}
