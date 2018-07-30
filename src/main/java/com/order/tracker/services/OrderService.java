package com.order.tracker.services;

import com.order.tracker.entities.Order;

import java.util.List;

public interface OrderService {

    List<Order> getOrders();
    void saveOrder(Order newOrder);
    Order getOrder(int orderId);
    void deleteOrder(int orderId);
}
