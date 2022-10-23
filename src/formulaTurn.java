//tiana koundakjian 260949364
public class formulaTurn extends Trick{
    /** private field*/
    private Move[] listOfMoves;

    private final String name = "formulaTurn trick";

    /** constructor creates the list of moves for the formula trick FULLY DEFINED */
    public formulaTurn() {
        listOfMoves = new Move[5];
        listOfMoves[0]= new Move(Direction.UP, 10 , Speed.LOW  );
        listOfMoves[1]= new Move(Direction.FORWARD, 10, Speed.HIGH);
        listOfMoves[2]= new Move(Direction.RIGHT, 3, Speed.MODERATE);
        listOfMoves[3]= new Move(Direction.FORWARD, 10, Speed.HIGH);
        listOfMoves[4]= new Move(Direction.FORWARD, 15, Speed.MODERATE);
    }
    /** get list of moves*/
    public Move[] getMoveList(){
        return listOfMoves;
    }

    /** inheritance - if user chooses flight to be recorded then
     * this boolean will be true and trick will be recorded
     * all moves will be recorded*/
    @Override
    public void setTrickRecord(boolean record, Format format){
        if (record == true) {
            for (Move move : listOfMoves) {
                move.setRecording(record);
                move.setFormat(format);
            }
        }

    }
    /** inheritance- exectuing trick. will be called when executing flight*/
    @Override
    public void executeTrick() {
        System.out.println(" Executing FormulaTrick");
        for ( Move move: listOfMoves){
            move.execute();

        }
    }
    /** get TYPE of trick - ENUM*/
    @Override
    public TrickNames getTrickType() {
        return TrickNames.formula;
    }

    /**Get Name of trick*/

    @Override
    public String getName() {
        return this.name;
    }


}

