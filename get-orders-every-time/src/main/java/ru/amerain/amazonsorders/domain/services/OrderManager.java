package ru.amerain.amazonsorders.domain.services;

import com.amazonservices.mws.orders._2013_09_01.MarketplaceWebServiceOrders;
import com.amazonservices.mws.orders._2013_09_01.model.GetOrderRequest;
import com.amazonservices.mws.orders._2013_09_01.model.GetOrderResponse;
import com.amazonservices.mws.orders._2013_09_01.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class OrderManager {

    private GetOrderRequest request;
    private GetOrderResponse response;
    @Autowired
   public void setRequest(GetOrderRequest request){
       this.request = request;
   }

   public List<Order> getOrder(List<String> amazonOrderId,MarketplaceWebServiceOrders client){
       request.setAmazonOrderId(amazonOrderId);
       response = client.getOrder(request);
       return response.getGetOrderResult().getOrders();
   }
}
