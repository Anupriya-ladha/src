package com.indusnet.Restaurant_booking.repository;

import com.indusnet.Restaurant_booking.model.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RestaurantRepository extends MongoRepository<Restaurant, String> {
}
