package ru.amerain.amazonsorders.Controllers;

import com.amazonservices.mws.orders._2013_09_01.MarketplaceWebServiceOrdersClient;
import com.amazonservices.mws.orders._2013_09_01.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.amerain.amazonsorders.domain.services.MVSConfiguration;
import ru.amerain.amazonsorders.domain.services.OrderManager;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MVSController {
    private MarketplaceWebServiceOrdersClient client;
    private OrderManager orderManager;

    @Autowired
    public MVSController(OrderManager orderManager,MarketplaceWebServiceOrdersClient client){
     this.orderManager = orderManager;
     this.client = client;
    }
    @RequestMapping(value = "/get/orders/",method = RequestMethod.GET)
    public void orderCreate(){
        List<String> amazonOrderId = new ArrayList<String>();
        List<Order> orders = orderManager.getOrder(amazonOrderId,client);
    }
}
