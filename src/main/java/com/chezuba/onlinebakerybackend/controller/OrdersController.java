package com.chezuba.onlinebakerybackend.controller;

import com.chezuba.onlinebakerybackend.entity.Orders;
import com.chezuba.onlinebakerybackend.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @GetMapping("/orders")
    public ResponseEntity<List<Orders>> getOrders(){
        List<Orders> ordersList=ordersService.getOrders();
        return ResponseEntity.ok(ordersList);
    }

    @PostMapping("/orders")
    public ResponseEntity<Orders> saveOrder(@RequestBody Orders order){
        Orders savedOrder=ordersService.saveOrder(order);
        return ResponseEntity.ok(savedOrder);
    }

    @PostMapping("/saveBulk")
    public ResponseEntity<String> saveBulk(@RequestBody List<Orders> ordersList){
        String success=ordersService.saveBulk(ordersList);
        return ResponseEntity.ok(success);
    }
}
