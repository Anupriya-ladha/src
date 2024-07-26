package com.indusnet.Restaurant_booking.repository;

import com.indusnet.Restaurant_booking.model.Reservation;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface ReservationRepository extends MongoRepository<Reservation, String> {
    List<Reservation> findByTableIdAndDateTimeBetween(String tableId, LocalDateTime start, LocalDateTime end);
}
