package com.order.tracker.dao;

import com.order.tracker.entities.Order;

import java.util.List;

public interface OrderDAO {

    List<Order> getOrders();
    void saveOrder(Order newOrder);
    Order getOrder(int orderId);
    void deleteOrder(int orderId);

}
