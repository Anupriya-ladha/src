package com.indusnet.Restaurant_booking.controller;



import com.indusnet.Restaurant_booking.model.Table;
import com.indusnet.Restaurant_booking.service.impl.TableServiceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/tables")
public class TableController {

    @Autowired
    private TableServiceimpl tableService;

    @GetMapping("/restaurant/{restaurantId}")
    public List<Table> getTablesByRestaurant(@PathVariable String restaurantId) {
        return tableService.getTablesByRestaurant(restaurantId);
    }

    @GetMapping("/{id}")
    public Table getTableById(@PathVariable String id) {
        return tableService.getTableById(id);
    }
}
