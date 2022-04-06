#include "location.h" 

class Trip {
  private:
    Location _pup, _doff;
    
  public:
    Trip(const Location& pickup, const Location& dropoff) {
      _pup = pickup; 
      _doff = dropoff;
    }

    const Location& getPickup() const {
      return _pup;
    }

    const Location& getDropoff() const {
      return _doff;
    }

    void setPickup(const Location& location) {
      _pup = location;
    }

    void setDropoff(const Location& location) {
      _doff = location;
    }
    
    /* TODO */
    float totalCost() {
      // returns the total cost of a trip
      // formula = (1.25 * total miles) + 5
      return 0.0; 
    }

    /* TODO */
    static float totalDistance(const Location& location1, const Location& location2) {
      // calculates the distance between to coordinates in miles
      // location1 and location2 are Location objects (see location.h)
      return 0.0;
    }
};
