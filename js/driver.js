class Driver {
  constructor(location, idle) {
    this._loc = location;
    this._idle = idle;
  }

  getLocation() {
    return this._loc;
  }

  getIdle() {
    return this._idle;
  }

  setLocation(location) {
    this._loc = location;
  }

  setIdle(idle) {
    this._idle = idle;
  }
}
