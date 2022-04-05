
class Location:
    def __init__(self, longitude, latitude):
        self._long = longitude
        self._lat = latitude

    def get_longitude(self):
        return self._long

    def get_latitude(self):
        return self._lat

    def set_longitude(self, longitude):
        self._long = longitude

    def set_latitude(self, latitude):
        self._lat = latitude
    
    