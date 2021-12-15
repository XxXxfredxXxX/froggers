
import GameCtr.GameCtr;
import GameObjects.Car;
import GameObjects.Frog;
import Map.Map;
import View.View;
import java.io.IOException;

/**
 *
 * @author fridtjof
 */
public class main {

    public static void main(String[] args) throws IOException {
        Frog frog = new Frog();
        frog.setPicturePath("src/img/frog.png");
        Car car1 = new Car();
        
        //car1.setPicturePath("src/img/car_right.png"); could cause wrong images
        System.out.println(car1.getDirection());
        
        Car car2 = new Car();
        
        //car2.setPicturePath("src/img/car_right.png");
        Car car3 = new Car();
        //car3.setPicturePath("src/img/car_right.png");
        Car[] cars = new Car[] {car1,car2,car3};
        Map map = new Map();
        map.setFrogPosition(new int[]{300,401});
        map.setCarPosition(new int[][]{{100,100},{100,200},{100,300}});
        
        View view = new View();
        view.setMap(map);
        view.start();
        GameCtr game = new GameCtr();
        game.setFrog(frog);
        game.setCars(cars);
        game.setMap(map);
        game.returnCarImagesToMap(cars);
        
        game.start();
    }
    
}
