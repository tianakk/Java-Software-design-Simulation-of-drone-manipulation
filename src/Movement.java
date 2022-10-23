//tiana koundakjian 260949364
public interface Movement {

    /**getters and setters that will be needed for all machines that move. interface can be usd again*/

    void setSpeed(Speed speed);
    void setDistance(double distance);
    Direction getDirection();
    boolean getIsRecording();
    //execute drone mvmt
    void execute();
}
