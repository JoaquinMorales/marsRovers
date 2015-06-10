
package Model;


public class Rover {
    private int xAxisPosition;
    private int yAxisPosition;
    private char cardinalPoint;

    public int getxAxisPosition() {
        return xAxisPosition;
    }

    public void setxAxisPosition(int xAxisPosition) {
        this.xAxisPosition = xAxisPosition;
    }

    public int getyAxisPosition() {
        return yAxisPosition;
    }

    public void setyAxisPosition(int yAxisPosition) {
        this.yAxisPosition = yAxisPosition;
    }

    public char getCardinalPoint() {
        return cardinalPoint;
    }

    public void setCardinalPoint(char cardinalPoint) {
        this.cardinalPoint = cardinalPoint;
    }

    public Rover(int xAxisPosition, int yAxisPosition, char cardinalPoint) {
        this.xAxisPosition = xAxisPosition;
        this.yAxisPosition = yAxisPosition;
        this.cardinalPoint = cardinalPoint;
    }
    
    public String getAsString(){
        return this.xAxisPosition + " " + 
                this.yAxisPosition + " " +
                this.cardinalPoint;
    }
    
}
