package UserInteraction;

import BusinessLogic.Instructions;
import DataAccess.Loader;
import Model.Plateau;
import Model.Rover;


public class MarsRovers {

    
    public static void main(String[] args) {
        for(String arg : args){
            String[] fileLines = Loader.getFile(arg);
            String[] splitedSize = fileLines[0].split(" ");
            Plateau plateau = new Plateau(Integer.parseInt(splitedSize[0]), 
                                           Integer.parseInt(splitedSize[1]));
            for(int i =1; i < fileLines.length; i+=2){
                String[] splitedPosition = fileLines[i].split(" ");
                Rover rover = new Rover(Integer.parseInt(splitedPosition[0]), 
                                         Integer.parseInt(splitedPosition[1]), 
                                         splitedPosition[2].charAt(0));
                Instructions instructions = new Instructions(fileLines[i+1].toCharArray(), rover, plateau);
                try{
                    instructions.execute();
                    System.out.println(instructions.getRover().getAsString());
                }catch(Exception ex){
                    System.out.println(ex.getMessage());
                    break;
                }
            }
            
        }
    }
    
}
