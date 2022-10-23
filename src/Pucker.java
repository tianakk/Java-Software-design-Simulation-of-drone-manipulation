//tiana koundakjian 260949364
public class Pucker extends Trick{

    /** private field*/
    private Speed speed;
    private double distance;
    private Move[] listOfMoves;
    private final String name = "pucker trick";

    /** constructor creates the list of moves for the pucker client needs to define 2 param */
    public Pucker(double distance, Speed speed) {
        assert distance >= 0;
        listOfMoves = new Move[6];
        listOfMoves[0] = new Move(Direction.UP, distance, speed);
        listOfMoves[1] = new Move(Direction.LEFT, distance, speed);
        listOfMoves[2] = new Move(Direction.LEFT, distance, speed);
        listOfMoves[3] = new Move(Direction.LEFT, distance, speed);
        listOfMoves[4] = new Move(Direction.LEFT, distance, speed);
        listOfMoves[5] = new Move(Direction.DOWN, distance, speed);
    }

    // methods to set speed and distance
    public void setSpeed(Speed speedi){
        this.speed= speedi;
    }
    public void setDistance(int dist){
        this.distance= dist;
    }

    /** get list of moves*/
    public Move[] getMoveList(){
        return listOfMoves;
    }


    /** inheritance- exectuing trick. will be called when executing flight*/
    @Override
    public void executeTrick() {
        System.out.println(" Executing Pucker");
        for ( Move move: listOfMoves){
            move.execute();

        }
    }
    /** inheritance - if user chooses flight to be recorded then
     * this boolean will be true and trick will be recorded
     * all moves will be recorded*/
    @Override
    public void setTrickRecord(boolean record, Format format){
        if (record == true) {
            for (Move move : listOfMoves) {
                move.setRecording(true);
                move.setFormat(format);
            }
        }

    }
    /** get TYPE of trick - ENUM*/
    @Override
    public TrickNames getTrickType() {
        return TrickNames.pucker;
    }
    /**Get Name of trick*/
    @Override
    public String getName() {
        return this.name;
    }

}
