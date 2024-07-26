package com.indusnet.Restaurant_booking.controller;

import com.indusnet.Restaurant_booking.model.Reservation;
import com.indusnet.Restaurant_booking.service.impl.ReservationServiceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;



import org.springframework.http.MediaType;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {

    @Autowired
    private ReservationServiceimpl reservationService;

    @PostMapping(value ="/create",produces=MediaType.APPLICATION_JSON_VALUE)
    public Reservation createReservation(@Valid @RequestBody Reservation reservation) {
        return reservationService.createReservation(reservation);
    }

    @GetMapping(value="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
    public Reservation getReservationById(@PathVariable String id) {
        return reservationService.getReservationById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void cancelReservation(@PathVariable String id) {
        reservationService.cancelReservation(id);
    }

    @GetMapping("/checkAvailability")
    public List<Reservation> checkAvailability(
            @RequestParam String tableId,
            @RequestParam("dateTime") String dateTime) {
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime);
        return reservationService.checkAvailability(tableId, localDateTime);
    }
}
