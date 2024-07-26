package com.indusnet.Restaurant_booking.repository;

import com.indusnet.Restaurant_booking.model.Table;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface TableRepository extends MongoRepository<Table, String> {
    List<Table> findByRestaurantId(String restaurantId);
}
