//tiana koundakjian 260949364
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunDrone {

    /**
     *  Client choses to record a trick means client chose to record every movement in the trick.
     *  Client cannot pick a specific movement to be or not to be recorded.
     -	Client allowed to choose one distance and one speed for pucker trick. (all moves have same speed and distance in execution.
     -	Client cannot choose definition of distance and speed for the other tricks.
     -	client can only choose to add tricks to the flight (grouping tricks).
     - Client cannot edit the flight (remove or update tricks)
     -	drone can execute one flight at a time.
     -	Assert statements used to prevent null values and negative distances.
     */

    public static void main(String args[]) {

        Trick takeoff= new Takeoff();
        Trick puckerModerate= new Pucker(8, Speed.MODERATE);
        Trick puckerHigh= new Pucker(10, Speed.HIGH);
        Trick formula= new formulaTurn();

        Flight flight1= new Flight("flight1");
        Drone droni= new Drone( "drone" , flight1);

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("FLIGHT1");
        flight1.addToList(takeoff);
        flight1.addToList(puckerHigh);
        flight1.addToList(formula);
        flight1.addToList(puckerModerate);

        /**record trick- set boolean to true*/
        //records all moves in the trick
        puckerHigh.setTrickRecord(true,Format.MOV);
        System.out.println(" ");
        droni.DroneMoves(flight1);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("FLIGHT2");
        Flight flight2= new Flight("flight2");
        droni.setFlight(flight2);
        flight2.addToList(takeoff);
        flight2.addToList(formula);
        flight2.addToList(puckerModerate);


        droni.DroneMoves(flight2);
//query unique moevement?
        /**compare flights* 1 and 2*/

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("FLIGHT3");

        Flight flight3= new Flight("flight3");

        droni.setFlight(flight3);

        flight3.addToList(takeoff);

        System.out.println(" ");
        System.out.println("client wants to view number of unique moves");
        flight3.uniqueMoveView();
        System.out.println(" ");

        droni.DroneMoves(flight3);

        System.out.println(" ");;
        System.out.println("FLIGHT COMPARAISON!");
        System.out.println(" ");
        List<Flight> flightList= new ArrayList<>();

        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);

        System.out.println(" ");
        System.out.println("Compare by trick num");
        System.out.println(" ");
        System.out.println("trick numbers of flight1:") ; flight1.getNumberOfTricksView();
        System.out.println("trick numbers of flight2:") ; flight2.getNumberOfTricksView();
        System.out.println("trick numbers of flight3:") ; flight3.getNumberOfTricksView();

        System.out.println(" ");
        System.out.println("before sorting by nuumber of tricks: " + flightList);
        System.out.println(" ");
        Collections.sort(flightList, Flight.ascendingOrderByTrickNum());
        System.out.println("after sorting by number of tricks: " + flightList);
        System.out.println(" ");

        System.out.println("Compare by unique moves num");
        System.out.println(" ");
        System.out.println("Unique moves of flight1:") ; flight1.uniqueMoveView();
        System.out.println("Unique moves of flight2:") ; flight2.uniqueMoveView();
        System.out.println("Unique moves of flight3:") ; flight3.uniqueMoveView();

        System.out.println(" ");
        System.out.println("before sorting by number of unique moves: " +flightList);
        System.out.println(" ");
        Collections.sort(flightList, Flight.ascendingOUniqueNumbers());
        System.out.println("after sorting by number of unique moves: " +flightList);



    }





}
