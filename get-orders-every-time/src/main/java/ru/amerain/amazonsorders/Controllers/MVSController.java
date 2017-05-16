package ru.amerain.amazonsorders.Controllers;

import com.amazonservices.mws.orders._2013_09_01.MarketplaceWebServiceOrdersClient;
import com.amazonservices.mws.orders._2013_09_01.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.amerain.amazonsorders.data.DataManager;
import ru.amerain.amazonsorders.data.DataSourceFabric;
import ru.amerain.amazonsorders.domain.services.OrderManager;

import java.util.List;

@RestController
public class MVSController {
    private MarketplaceWebServiceOrdersClient client;
    private OrderManager orderManager;
    private DataManager dataManager;

    @Autowired
    public MVSController(OrderManager orderManager, MarketplaceWebServiceOrdersClient client, DataSourceFabric dataSourceFabric){
     this.orderManager = orderManager;
     this.client = client;
     DataSourceFabric dataSource = dataSourceFabric;
     dataManager = dataSource.createDataSource();
    }
    @RequestMapping(value = "/get/orders/",method = RequestMethod.GET)
    public void orderCreate(){
        List<Order> orders = orderManager.getOrder(client);
    }
}
