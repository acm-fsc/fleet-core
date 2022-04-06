package java_api;

public class Driver {
    private Location _loc; 
    private boolean _idle; 
    
    public Driver(Location location, boolean idle) {
            _loc = location;
            _idle = idle;
    }
        
    public Location getLocation() {
            return new Location(_loc);
    }

    public boolean getIdle() {
        return _idle;
    }
        
    public void setLocation(Location location) {
            _loc = location;
    }

    public void setIdle(boolean idle) {
        _idle = idle;
    }
}
