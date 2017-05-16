package ru.amerain.amazonsorders.data;


import com.amazonservices.mws.orders._2013_09_01.model.Order;

import java.util.List;

public interface DataManager {
    void createOrder(Order order);

    List<Order> getOrders();
}
