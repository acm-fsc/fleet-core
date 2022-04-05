class Trip {
  constructor(pickup, drop_off) {
    this._pup = pickup;
    this._doff = drop_off;
  }

  getPickup() {
    return this._pup;
  }

  getDropoff() {
    return this._doff;
  }

  setPickup(location) {
    this._pup = location;
  }

  setDropoff(location) {
    this.doff = location;
  }

  /* TODO */
  totalCost() {
    // returns the total cost of a trip
    // formula = (1.25 * total miles) + 5
  }

  /* TODO */
  static totalDistance(location1, location2) {
    // calculates the distance between to coordinates in miles
    // location1 and location2 are Location objects (see location.js)
  }
}
