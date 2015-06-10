
package BusinessLogic;

import Model.Plateau;
import Model.Rover;

public class Instructions {
    char[] instructions;
    Rover rover;
    Plateau plateau;

    public Rover getRover() {
        return rover;
    }

    public void setRover(Rover rover) {
        this.rover = rover;
    }

    public Plateau getPlateau() {
        return plateau;
    }

    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }

    public char[] getInstructions() {
        return instructions;
    }

    public void setInstructions(char[] instructions) {
        this.instructions = instructions;
    }
    

    public Instructions(char[] instructions, Rover rover, Plateau plateau) {
        this.instructions = instructions;
        this.rover = rover;
        this.plateau = plateau;
    }

    public Instructions() {
    }
      
    
    public void execute() throws Exception{
        for(int i = 0; i < instructions.length; i++){
            switch(instructions[i]){
                case 'R':
                    RoverSkills.turnRight(rover);
                    break;
                case 'L':
                    RoverSkills.turnLeft(rover);
                    break;
                case 'M':
                    RoverSkills.advance(rover, plateau);
                    break;
                default:
                    throw new Exception("Invalid Instruction");
            }
        }
    }
}
