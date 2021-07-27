package de.neuefische.demoneuefische.controller;

import de.neuefische.demoneuefische.model.Order;
import de.neuefische.demoneuefische.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("api/order")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.listAllOrders();
    }

    @GetMapping("{id}")
    public Order findById(@PathVariable String id) {
        return orderService.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.createNewOrder(order);
    }
}
