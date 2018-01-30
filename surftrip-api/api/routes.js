'use strict';
module.exports = function(app) {
    var trip = require('./tripController');
  
    // todoList Routes
    app.route('/trips')
        .get(trip.list)
        .post(trip.create);
    
    app.route('/trips/:tripId')
        .get(trip.get)
        .put(trip.update)
        .delete(trip.delete);
        
}