package com.indusnet.Restaurant_booking.service;

import com.indusnet.Restaurant_booking.model.Reservation;
import com.indusnet.Restaurant_booking.common.ResponseModel;
import jakarta.validation.Valid;

import java.time.LocalDateTime;
import java.util.List;

public interface IReservationService {

    ResponseModel add(@Valid Reservation reservation);

    Reservation getReservationById(String id);

    void cancelReservation(String id);

    List<Reservation> checkAvailability(String tableId, LocalDateTime dateTime);
}



