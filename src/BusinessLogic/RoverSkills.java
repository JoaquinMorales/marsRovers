
package BusinessLogic;

import Model.Plateau;
import Model.Rover;


public class RoverSkills {
    
    public static void turnLeft(Rover rover) throws Exception{
        char newDot = CircularCardinalDots.giveMePrevius(rover.getCardinalPoint());
        rover.setCardinalPoint(newDot);
    }
    
    public static void turnRight(Rover rover) throws Exception{
        char newDot = CircularCardinalDots.giveMeNext(rover.getCardinalPoint());
        rover.setCardinalPoint(newDot);
    }
    
    public static void advance(Rover rover, Plateau plateau) throws Exception{
        switch(rover.getCardinalPoint()){
            case 'N':
                PlateauMovements.moveNorth(plateau, rover);
                break;
            case 'E':
                PlateauMovements.moveEast(plateau, rover);
                break;
            case 'S':
                PlateauMovements.moveSouth(plateau, rover);
                break;
            case 'W':
                PlateauMovements.moveWest(plateau, rover);
                break;
            default:
                throw new Exception("invalid cardinal dot");
        }
    }
}
