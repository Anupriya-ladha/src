package com.indusnet.Restaurant_booking.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "reservations")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    @Id
    private String id;

    @NotNull
    private String customerName;

    @NotNull
    private String customerPhone;

    @NotNull
    private LocalDateTime dateTime;

    @NotNull
    private Integer partySize;

    @NotNull
    private String tableId; 
}
