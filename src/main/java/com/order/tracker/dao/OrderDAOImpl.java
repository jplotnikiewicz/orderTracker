package com.order.tracker.dao;

import com.order.tracker.entities.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.criteria.Expression;
import java.util.List;

public class OrderDAOImpl implements OrderDAO {

    @Autowired
    SessionFactory factory;

    @Override
    public List<Order> getOrders() {
        Session session = factory.getCurrentSession();
        return null;
    }

    @Override
    public void saveOrder(Order newOrder) {

    }

    @Override
    public Order getOrder(int orderId) {
        return null;
    }

    @Override
    public void deleteOrder(int orderId) {

    }
}
