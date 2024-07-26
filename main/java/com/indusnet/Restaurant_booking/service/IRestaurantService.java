package com.indusnet.Restaurant_booking.service;

import com.indusnet.Restaurant_booking.model.Restaurant;
import com.indusnet.Restaurant_booking.common.ResponseModel;
import jakarta.validation.Valid;

import java.util.List;

public interface IRestaurantService {

    ResponseModel add(@Valid Restaurant restaurant);

    List<Restaurant> getAllRestaurants();

    Restaurant getRestaurantById(String id);

    ResponseModel update(@Valid Restaurant restaurant);

    void delete(String id);
}
