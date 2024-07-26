package com.indusnet.Restaurant_booking.service.impl;

import com.indusnet.Restaurant_booking.model.Reservation;
import com.indusnet.Restaurant_booking.repository.ReservationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// import javax.validation.Valid;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import jakarta.validation.Valid;

@Service
public class ReservationServiceimpl {

    @Autowired
    private ReservationRepository reservationRepository;

    public Reservation createReservation(@Valid Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public Optional<Reservation> getReservationById(String id) {
        return reservationRepository.findById(id);
    }

    public void cancelReservation(String id) {
        reservationRepository.deleteById(id);
    }

    public List<Reservation> checkAvailability(String tableId, LocalDateTime dateTime) {
        LocalDateTime start = dateTime.minusHours(1); // Assuming 1-hour blocks
        LocalDateTime end = dateTime.plusHours(1);
        return reservationRepository.findByTableIdAndDateTimeBetween(tableId, start, end);
    }
}
