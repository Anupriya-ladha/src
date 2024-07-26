package com.indusnet.Restaurant_booking.service.impl;

import com.indusnet.Restaurant_booking.model.Restaurant;
import com.indusnet.Restaurant_booking.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceimpl {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    public Restaurant getRestaurantById(String id) {
        return restaurantRepository.findById(id).orElse(null);
    }
}


