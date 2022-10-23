//tiana koundakjian 260949364
public class Move implements Movement{

    /** private fields*/
    private Direction direction;
    private double distance;
    private Speed speed;
    private boolean isRecording;
    private Format recFormat;

    /**constructorove defined by 3 param*/
    public Move(Direction direction, double distance, Speed speed){

        this.direction=direction;
        this.distance=distance;
        this.speed=speed;

    }
    /**getters and setters gotten  from inheritance */
    
    public void setRecording(boolean recording) {
        isRecording = recording;
    }
    @Override
    public boolean getIsRecording() {
        return isRecording;
    }
    //client code picks format

    public void setFormat(Format format){
        recFormat = format;
    }

    @Override
    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    @Override
    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public Direction getDirection(){
        return direction;
    }
    /**this method will be called after each move it executed to switch recording on at the beg and off at the end*/
    public boolean isRecording(boolean isRecording) {

        isRecording = !isRecording;
        return isRecording;
    }
    /**executes moves. called by execute tricks. record if boolean modified by client is true*/
    @Override
    public void execute() {


        System.out.println("Moving " + direction + " to " + distance + " units at " + speed +" speed");

        if (isRecording==true){

            System.out.println("MOVE RECORDED - format :"+ recFormat);
        }

    }
}
