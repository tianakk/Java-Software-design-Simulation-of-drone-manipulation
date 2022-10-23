//tiana koundakjian 260949364
public class Trick {
    private Move[] movelist;
    /**methods to be inplemented by all tricks as all tricks have name, need to be executed
     * and have move list
     * getters and setter by convention*/

    String getName(){return "name";};
    void setTrickRecord(boolean record, Format format){};
    void executeTrick(){};
    TrickNames getTrickType(){return TrickNames.takeoff;};
    Move[] getMoveList(){return this.movelist;};



}
