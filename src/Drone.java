//tiana koundakjian 260949364
public class Drone {

    /** private fields inaccessible to user */

    final private String name;
    private Flight flight;

    /**
     * Constructor
     * @param name of the drone
     */
    public Drone(String name , Flight flight) {


        assert  name != null;

        this.name = name;
        this.flight=flight;

    }

    /**
     * Name getter
     * @return drone name
     */
    public void setFlight(Flight flight ){
        this.flight=flight;
    }
    public String getName() {
        return this.name;
    }

    /** the done executes the flight given as parameter*/
    public void DroneMoves(Flight flight) {
        if (flight != null) {
            flight.executeFlight();
        }
    }


}
