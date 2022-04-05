class Location {
  constructor(longitude, latitude) {
    this._long = longitude;
    this._lat = latitude;
  }

  getLongitude() {
    return this._long;
  }

  getLatitude() {
    return this._lat;
  }

  setLongitude(longitude) {
    this._long = longitude;
  }

  setLatitude(latitude) {
    this._lat = latitude;
  }
}
