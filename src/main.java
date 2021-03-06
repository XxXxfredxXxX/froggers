
import GameCtr.GameCtr;
import GameObjects.Car;
import GameObjects.Frog;
import Map.Map;
import View.View;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author fridtjof
 */
public class main {

    public static void main(String[] args) throws IOException {
        while(true){
            Start start = new Start();
            start.start();
        }
    }
    
}

class Start{
    public void start() throws IOException{
        Frog frog = new Frog();
        frog.setPicturePath("src/img/frog.png");
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car[] cars = new Car[] {car1,car2,car3};
        Map map = new Map();
        map.setFrogPosition(new int[]{200,565});
        Random rand = new Random();
        map.setCarPosition(new int[][]{{rand.nextInt(200)+100,175},{rand.nextInt(200)+100,300},{rand.nextInt(200)+100,425}});
        GameCtr game = new GameCtr();
        game.setFrog(frog);
        game.setCars(cars);
        game.setMap(map);
        game.returnCarImagesToMap(cars);
        View view = new View();
        view.setMap(map);
        view.setGameCtr(game);
        view.setFrog(frog);
        view.start();
        game.start();
        view.dispose();
    }
}
