'use strict';

var trips = [
  {
    place: "Hawaii",
    meal: true,
    transfer: true,
    image: "hawaii.jpg"
  },
  {
    place: "Maldivas",
    meal: true,
    transfer: true,
    image: "maldivas.jpg"
  },
  {
    place: "Costa Rica",
    meal: true,
    transfer: true,
    image: "costarica.jpg"
  }
];

exports.list = function(req, res) {
  res.json(trips);
};

exports.create = function(req, res) {
  res.send("Not implemented yet");
};

exports.get = function(req, res) {
  res.send("Not implemented yet");
};

exports.update = function(req, res) {
  res.send("Not implemented yet");
};

exports.delete = function(req, res) {
  res.send("Not implemented yet");
};