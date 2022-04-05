#pragma once

class Location {
    private:
        float _long, _lat; 

    public:
        Location(const Location& rhs) {
            _long = rhs._long; 
            _lat = rhs._lat; 
        }

        Location() {
            _long = 0.0;
            _lat = 0.0;
        }

        Location(float longitude, float latitude) {
            _long = longitude;
            _lat = latitude;
        }

        float getLongitude() {
            return _long;
        }

        float getLatitude() {
            return _lat;
        }

        void setLongitude(float longitude) {
            _long = longitude;
        }

        void setLatitude(float latitude) {
            _lat = latitude;
        }
};