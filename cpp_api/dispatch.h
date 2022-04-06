#include <vector>
#include "driver.h"
#include "trip.h"

class Dispatch {
    private:
        std::vector<Driver> _drivers; 

    public:
        Dispatch() = default; 
        
        void addDriver(const Driver& driver) {
          _drivers.push_back(driver); 
        }
        
        /* TODO */
        int handleRequest(const Trip& trip) {
          // takes in a trip and returns the index of the driver who will take it
          // should also mark that driver as idle
          // trip is a Trip object (see trip.h)
        }
};