package java_api;

public class Trip {
    private Location _pup, _doff; 

    public Trip(Location pickup, Location dropoff) {
        _pup = pickup; 
        _doff = dropoff; 
    }

    public Location getPickup() {
        return new Location(_pup); 
    }

    public Location getDropoff() {
        return new Location(_doff); 
    }

    public void setPickup(Location location) {
        _pup = location; 
    }

    public void setDropoff(Location location) {
        _doff = location; 
    }
    
    /* TODO */
    public float totalCost() {
      // returns the total cost of a trip
      // formula = (1.25 * total miles) + 5
      return 0.0f; 
    }

    /* TODO */
    public static float totalDistance(Location location1, Location location2) {
      // calculates the distance between to coordinates in miles
      // location1 and location2 are Location objects (see Location.java)
      return 0.0f;
    }
}
