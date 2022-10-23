//tiana koundakjian 260949364
public class Takeoff extends Trick{

    /** private field*/
    private Move[] listOfMoves;
    private final String name = "take off trick";

    /** constructor creates the list of moves for the takeoffFULLY DEFINED */
    public Takeoff() {
        listOfMoves= new Move[2];
        listOfMoves[0]= new Move(Direction.UP, 10, Speed.LOW);
        listOfMoves[1]= new Move(Direction.UP, 10, Speed.MODERATE);}

    /** get list of moves*/
    public Move[] getMoveList(){
        return listOfMoves;
    }


    /** inheritance- exectuing trick. will be called when executing flight*/
    @Override
    public void executeTrick() {
        System.out.println(" Executing TakingOff");
            for ( Move move: listOfMoves){
                //System.out.println(move);
                move.execute();

            }
        }
    /** get TYPE of trick - ENUM*/
    @Override
    public TrickNames getTrickType() {
        return TrickNames.takeoff;
    }

    /**Get Name of trick*/
    @Override
    public String getName() {
        return this.name;
    }
    /** inheritance - if user chooses flight to be recorded then
     * this boolean will be true and trick will be recorded
     * all moves will be recorded*/
    @Override
    public void setTrickRecord(boolean record, Format format){
        //check format
        if (record == true) {
            for (Move move : listOfMoves) {
                move.setRecording(record);
                move.setFormat(format);
            }
        }

    }


    }


