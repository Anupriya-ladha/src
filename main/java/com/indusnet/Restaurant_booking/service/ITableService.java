package com.indusnet.Restaurant_booking.service;

import com.indusnet.Restaurant_booking.model.Table;
import com.indusnet.Restaurant_booking.common.ResponseModel;
import jakarta.validation.Valid;

import java.util.List;

public interface ITableService {

    ResponseModel add(@Valid Table table);

    List<Table> getTablesByRestaurant(String restaurantId);

    Table getTableById(String id);
}
