
package com.indusnet.Restaurant_booking.service.impl;

import com.indusnet.Restaurant_booking.model.Table;
import com.indusnet.Restaurant_booking.repository.TableRepository;
import com.indusnet.Restaurant_booking.exception.UnprocessableException; // Custom exception for better error handling

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TableServiceimpl {

    @Autowired
    private TableRepository tableRepository;

   
    public List<Table> getTablesByRestaurant(String restaurantId) {
        return tableRepository.findByRestaurantId(restaurantId);
    }

   
    public Table getTableById(String id) {
        return tableRepository.findById(id)
                .orElseThrow(() -> new UnprocessableException("Table with ID " + id + " does not exist."));
    }
}

