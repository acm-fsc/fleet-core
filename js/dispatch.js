class Dispatch {
  constructor() {
    this._drivers = [];
  }

  addDriver(driver) {
    this._drivers.push(driver);
  }

  /* TODO */
  handleRequest(trip) {
    // takes in a trip and returns the index of the driver who will take it
    // should also mark that driver as idle
    // trip is a Trip object (see trip.js)
  }
}
