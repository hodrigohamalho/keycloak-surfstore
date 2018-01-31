'use strict';

var trips = [
  {
    place: "Hawaii",
    meal: true,
    transfer: true,
    image: "images/hawaii.jpg"
  },
  {
    place: "Maldivas",
    meal: true,
    transfer: true,
    image: "images/maldivas.jpg"
  },
  {
    place: "Costa Rica",
    meal: true,
    transfer: true,
    image: "images/costarica.jpg"
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