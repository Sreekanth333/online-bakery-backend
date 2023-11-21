package com.chezuba.onlinebakerybackend.service;

import com.chezuba.onlinebakerybackend.entity.Orders;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataInitializerService {

    private OrdersService ordersService; // Assuming you have a repository for Orders

    public DataInitializerService(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    public void initializeData() {
        // Create and save the initial Order entities
        List<Orders> initialOrders = createInitialOrders();
        ordersService.saveBulk(initialOrders);
    }

    private List<Orders> createInitialOrders() {
        ArrayList<Orders> orderList = new ArrayList<>();

        orderList.add(new Orders(1, 110, 105, "Cake", "Delivered", null, null));
        orderList.add(new Orders(2, 150, 150, "Cookies", "Shipped", null, null));
        orderList.add(new Orders(3, 130, 120, "Muffins", "Delivered", null, null));
        orderList.add(new Orders(4, 180, 140, "Cake", "Canceled", null, null));
        orderList.add(new Orders(5, 130, 110, "Cookies", "Created", null, null));
        orderList.add(new Orders(6, 140, 120, "Muffins", "Shipped", null, null));
        orderList.add(new Orders(7, 160, 115, "Cake", "Shipped", null, null));
        orderList.add(new Orders(8, 120, 130, "Cookies", "Created", null, null));
        orderList.add(new Orders(9, 190, 160, "Muffins", "Shipped", null, null));
        orderList.add(new Orders(10, 170, 190, "Cake", "Delivered", null, null));
        orderList.add(new Orders(11, 140, 120, "Cookies", "Delivered", null, null));
        orderList.add(new Orders(12, 160, 150, "Muffins", "Shipped", null, null));
        orderList.add(new Orders(13, 120, 130, "Cake", "Canceled", null, null));
        orderList.add(new Orders(14, 150, 110, "Cookies", "Created", null, null));
        orderList.add(new Orders(15, 130, 120, "Muffins", "Shipped", null, null));
        orderList.add(new Orders(16, 170, 115, "Cake", "Shipped", null, null));
        orderList.add(new Orders(17, 190, 130, "Cookies", "Created", null, null));
        orderList.add(new Orders(18, 120, 160, "Muffins", "Shipped", null, null));
        orderList.add(new Orders(19, 160, 190, "Cake", "Delivered", null, null));
        orderList.add(new Orders(20, 130, 120, "Cookies", "Delivered", null, null));
        orderList.add(new Orders(21, 160, 150, "Muffins", "Shipped", null, null));
        orderList.add(new Orders(22, 120, 130, "Cake", "Canceled", null, null));
        orderList.add(new Orders(23, 150, 110, "Cookies", "Created", null, null));
        orderList.add(new Orders(24, 130, 120, "Muffins", "Shipped", null, null));
        orderList.add(new Orders(25, 170, 115, "Cake", "Shipped", null, null));
        orderList.add(new Orders(26, 190, 130, "Cookies", "Created", null, null));
        orderList.add(new Orders(27, 120, 160, "Muffins", "Shipped", null, null));
        orderList.add(new Orders(28, 160, 190, "Cake", "Delivered", null, null));
        orderList.add(new Orders(29, 130, 120, "Cookies", "Delivered", null, null));
        orderList.add(new Orders(30, 160, 150, "Muffins", "Shipped", null, null));
        orderList.add(new Orders(31, 160, 150, "Muffins", "Shipped", null, null));
    return orderList;
    }
}

