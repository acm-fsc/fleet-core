package java_api;
import java.util.ArrayList;

public class Dispatch {
     private ArrayList<Driver> _drivers = new ArrayList<Driver>();
     
     public void addDriver(Driver driver) {
         _drivers.add(driver); 
    }
        
    /* TODO */
    public int handleRequest(Trip trip) {
        // takes in a trip and returns the index of the driver who will take it
        // should also mark that driver as idle
        // trip is a Trip object (see Trip.java)
        return -1; 
    }
}
