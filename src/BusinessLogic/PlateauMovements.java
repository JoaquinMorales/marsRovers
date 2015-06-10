
package BusinessLogic;

import Model.Plateau;
import Model.Rover;


public class PlateauMovements {
    
    public static void moveNorth(Plateau plateau, Rover rover){
        if(rover.getyAxisPosition() >= plateau.getLength()){
            return;
        }
        rover.setyAxisPosition(rover.getyAxisPosition() + 1);
    }
    
    public static void moveEast(Plateau plateau, Rover rover){
        if(rover.getxAxisPosition() >= plateau.getWidth()){
            return;
        }
        rover.setxAxisPosition(rover.getxAxisPosition() + 1);
    }
    
    public static void moveSouth(Plateau plateau, Rover rover){
        if(rover.getyAxisPosition() <= 0){
            return;
        }
        rover.setyAxisPosition(rover.getyAxisPosition() - 1);
    }
    
    public static void moveWest(Plateau plateau, Rover rover){
        if(rover.getxAxisPosition() <= 0){
            return;
        }
        rover.setxAxisPosition(rover.getxAxisPosition() - 1);
    }
}
