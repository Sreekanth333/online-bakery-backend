package com.chezuba.onlinebakerybackend.service;

import com.chezuba.onlinebakerybackend.repository.OrdersRepository;
import com.chezuba.onlinebakerybackend.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class OrdersService {

    @Autowired
    private OrdersRepository ordersRepository;

    public List<Orders> getOrders(){
       return ordersRepository.findAll();
    }

    public Orders saveOrder(Orders order) {
        LocalDateTime currentTime=LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentTime.format(formatter);
        order.setCreatedTime(formattedDateTime);
        order.setLastUpdatedTime(formattedDateTime);
        return ordersRepository.save(order);
    }

    public String saveBulk(List<Orders> ordersList) {
        Random random = new Random();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        ordersList.forEach(order->{
            LocalDateTime createdTime = LocalDateTime.of(2022, 8 + random.nextInt(4), 1 + random.nextInt(30), random.nextInt(24), random.nextInt(60), random.nextInt(60));
            LocalDateTime lastUpdatedTime = LocalDateTime.of(2022, 8 + random.nextInt(4), 1 + random.nextInt(30), random.nextInt(24), random.nextInt(60), random.nextInt(60));

            order.setCreatedTime(createdTime.format(formatter));
            order.setLastUpdatedTime(lastUpdatedTime.format(formatter));
            ordersRepository.save(order);
        });
        return "Succesfully saved";
    }
}
