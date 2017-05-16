package ru.amerain.amazonsorders.domain.services;

import com.amazonservices.mws.client.MwsUtl;
import com.amazonservices.mws.orders._2013_09_01.MarketplaceWebServiceOrders;
import com.amazonservices.mws.orders._2013_09_01.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Component
public class OrderManager {

    private ListOrdersRequest request;
    private ListOrdersResponse response;
    @Autowired
   public void setRequest(ListOrdersRequest request){
       this.request = request;
   }
   private void configureTime(){
       Date date = new Date();
       XMLGregorianCalendar createdAfter = MwsUtl.getDTF().newXMLGregorianCalendar();
       createdAfter.setTime(date.getHours(),date.getMinutes()-5,date.getSeconds());
       request.setCreatedAfter(createdAfter);
   }

   public List<Order> getOrder(MarketplaceWebServiceOrders client){
       configureTime();
       response = client.listOrders(request);
       return response.getListOrdersResult().getOrders();
   }
}
