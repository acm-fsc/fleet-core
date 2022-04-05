class Trip:
    def __init__(self, pickup, drop_off):
        self._pup = pickup
        self._doff = drop_off
        
    def get_pickup(self):
        return self._pup

    def get_dropoff(self):
        return self._doff
    
    def set_pickup(self, location):
        self._pup = location

    def set_dropoff(self, location):
        self.doff = location
    
    """ TODO """
    def total_cost(self):
        # returns the total cost of a trip
        # formula = (1.25 * total miles) + 5
        pass
    
    """ TODO """
    @staticmethod
    def total_distance(location1, location2): 
        # calculates the distance between to coordinates in miles
        # location1 and location2 are Location objects (see location.py)
        pass