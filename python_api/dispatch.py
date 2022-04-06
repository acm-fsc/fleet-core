class Dispatch:
    def __init__(self):
        self._drivers = []
    
    def add_driver(self, driver):
        self._drivers.append(driver)
        
    """ TODO """
    def handle_request(self, trip):
        # takes in a trip and returns the index of the driver who will take it 
        # should also mark that driver as idle
        # trip is a Trip object (see trip.py)
        pass