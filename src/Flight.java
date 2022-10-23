//tiana koundakjian 260949364
import java.util.*;

public class Flight  {
    /** private fields*/
    private ArrayList<Trick> listOfTricks;
    private String name;

    /**constructor that initialized array list of tricks*/
    public Flight(String name) {

        this.name=name;
        this.listOfTricks = new ArrayList<>();

    }
    /** method to add trick to a flight by inserting the enum name*/
    public void addToList(Trick name) {

        assert name != null;
        listOfTricks.add(name);
    }
    /** getter to get name*/
    public String getName(){
        return this.name;
    }

    /** this is a not used method but what it does is
     * the client can choose to see for example
     * how many times during the flight "forward" was executed*/
    public int countUniqueMove(Direction direction) {

        int count = 0;
        if (!listOfTricks.isEmpty()) {
            count = 0;
            for (Trick oneTrick : listOfTricks) {
                for (Move move : oneTrick.getMoveList()) {
                    if (move.getDirection() == direction) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    /**method that uses hashset make a set of the unique moves executed. no duplicates */
    public int uniqueMoves() {
        //set of dir
        HashSet<Direction> set = new HashSet<>();

        for (Trick oneTrick : listOfTricks) {
            for (Move move : oneTrick.getMoveList()) {
                if (!set.contains(move.getDirection())) {

                    set.add(move.getDirection());
                }
            }
        }
        return set.size(); //num of unique dir

    }
    /** get number of tricks*/
    public int  getNumberOfTricks(){

        return (listOfTricks.size());
    }

    /**prints number of tricks - information hiding*/
    public void  getNumberOfTricksView(){

        System.out.println(getNumberOfTricks());
    }

    /** inheritance */
    @Override
    public String toString() {
        return getName();

    }

    /** prints number of unique moves - information hiding*/
    public void uniqueMoveView() {
        System.out.println("Number of unique moves is " + uniqueMoves());
    }

    /** setter to list of tricks*/
    public void setListOfTricks(ArrayList<Trick> listOfTricks) {
        this.listOfTricks = listOfTricks;
    }

    /** executes flights by executing each trick. execte tricks will call execute moves*/
    public void executeFlight() {

        if (!listOfTricks.isEmpty()) {

            for (Trick oneTrick : listOfTricks) {
                oneTrick.executeTrick();
            }
        }
    }


    //COMPARATOR
    /** nested classes of comparator
     * 1st one- compares by num of tricks in flight
     * 2nd compares by num of unique moves in flight*/
    public static Comparator<Flight> ascendingOrderByTrickNum(){
        return new Comparator<Flight>() {
            @Override
            public int compare(Flight o1, Flight o2) {
                return o1.listOfTricks.size()-o2.listOfTricks.size();
            }
        };
    }
    public static Comparator<Flight> ascendingOUniqueNumbers(){
        return new Comparator<Flight>() {
            @Override
            public int compare(Flight o1, Flight o2) {
                return o1.uniqueMoves()-o2.uniqueMoves();
            }
        };
    }


}
