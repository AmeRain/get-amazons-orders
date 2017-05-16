package ru.amerain.amazonsorders.data.jdbc;


import com.amazonservices.mws.orders._2013_09_01.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.amerain.amazonsorders.data.DataManager;

import java.util.List;


public class JdbcDataManager implements DataManager{
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public void createOrder(Order order) {

    }

    public List<Order> getOrders() {
        return null;
    }
}
