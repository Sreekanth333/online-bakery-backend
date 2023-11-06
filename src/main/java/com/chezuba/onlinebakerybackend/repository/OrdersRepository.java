package com.chezuba.onlinebakerybackend.repository;

import com.chezuba.onlinebakerybackend.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Integer> {
}
