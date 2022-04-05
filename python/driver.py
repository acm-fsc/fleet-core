
class Driver:
    def __init__(self, location, idle):
        self._loc = location
        self._idle = idle
        
    def get_location(self):
        return self._loc

    def get_idle(self):
        return self._idle

    def set_location(self, location):
        self._loc = location

    def set_idle(self, idle):
        self.idle = idle