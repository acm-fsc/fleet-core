package java_api;

public class Location {
    private float _long, _lat; 

    public Location(float longitude, float latitude) {
        _long = longitude;
        _lat = latitude; 
    }

    public Location() {
        _long = 0.0f;
        _lat = 0.0f; 
    }

    public Location(Location location) {
        _long = location._long; 
        _lat = location._lat;
    }

    public float getLongitude() {
        return _long; 
    }

    public float getLatitude() {
        return _lat; 
    }

    public void setLongitude(float longitude) {
        _long = longitude; 
    }

    public void setLatitude(float latitude) {
        _lat = latitude;
    }
}
