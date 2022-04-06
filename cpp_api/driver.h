#pragma once
#include "location.h"

class Driver {
    private:
        Location _loc; 
        bool _idle; 

    public:
        Driver(const Location& location, bool idle) {
            _loc = location;
            _idle = idle;
        }

        Driver() = default; 
        
        const Location& getLocation() const {
            return _loc;
        }

        bool getIdle() {
            return _idle;
        }
        
        void setLocation(const Location& location) {
            _loc = location;
        }

        void setIdle(bool idle) {
            _idle = idle;
        }
};
