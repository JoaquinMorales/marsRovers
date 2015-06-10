
package BusinessLogic;


public class CircularCardinalDots {
    private static final char[] cardinalDots = new char[]{'N', 'E', 'S', 'W'};
    

    public static char giveMeNext(char dot)throws Exception {
        int position = findPosition(dot);
        if(position == -1){
            throw new Exception("invalid Cardinal position");
        }
        int newPosition = position + 1;
        if(newPosition >= cardinalDots.length){
            newPosition = 0;
        }
        return cardinalDots[newPosition];
    }
    
    public static char giveMePrevius(char dot) throws Exception{
        int position = findPosition(dot);
        if(position == -1){
            throw new Exception("invalid Cardinal position");
        }
        int newPosition = position - 1;
        if(newPosition < 0){
            newPosition = cardinalDots.length - 1;
        }
        return cardinalDots[newPosition];
    }
    
    private  static int findPosition(char currentDot){
        for(int i =0; i < cardinalDots.length; i++){
            if(currentDot == cardinalDots[i]){
                return i;
            }
        }
        return -1;
    }
}
