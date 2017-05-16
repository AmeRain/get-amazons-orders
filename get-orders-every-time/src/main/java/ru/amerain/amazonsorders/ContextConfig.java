package ru.amerain.amazonsorders;

import com.amazonservices.mws.orders._2013_09_01.MarketplaceWebServiceOrdersAsyncClient;
import com.amazonservices.mws.orders._2013_09_01.MarketplaceWebServiceOrdersConfig;
import com.amazonservices.mws.orders._2013_09_01.model.GetOrderRequest;
import com.amazonservices.mws.orders._2013_09_01.model.ListOrdersRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ru.amerain.amazonsorders.domain.services.OrderManager;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ContextConfig {

    @Bean
    public OrderManager getOrderManager(){
        OrderManager orderManager = new OrderManager();
        orderManager.setRequest(getOrderRequest());
        return orderManager;
    }
    @Bean
    public ListOrdersRequest getOrderRequest(){
        ListOrdersRequest request = new ListOrdersRequest();
        request.setSellerId("");
        request.setMWSAuthToken("");
        request.setBuyerEmail("");
        //дополнительные параметры для поиска заказов
        List<String> orderStatus = new ArrayList<String>();
        request.setOrderStatus(orderStatus);
        List<String> marketplaceId = new ArrayList<String>();
        request.setMarketplaceId(marketplaceId);
        List<String> fulfillmentChannel = new ArrayList<String>();
        request.setFulfillmentChannel(fulfillmentChannel);
        List<String> paymentMethod = new ArrayList<String>();
        request.setPaymentMethod(paymentMethod);
        Integer maxResultsPerPage = 1;
        request.setMaxResultsPerPage(maxResultsPerPage);
        List<String> tfmShipmentStatus = new ArrayList<String>();
        request.setTFMShipmentStatus(tfmShipmentStatus);
        return request;
    }
    @Bean
    public MarketplaceWebServiceOrdersConfig getConfig(){
        MarketplaceWebServiceOrdersConfig config =  new MarketplaceWebServiceOrdersConfig();
        config.setServiceURL("serviceURL");
        return config;
    }
    @Bean
    public MarketplaceWebServiceOrdersAsyncClient getClient(){
        return new MarketplaceWebServiceOrdersAsyncClient("accessKey", "secretKey",
                          "appName", "appVersion", getConfig(), null);
    }
//    @Bean
//    public MVSConfiguration getMVSConfig(){
//       return new MVSConfiguration();
//     //  configuration.setClient();
//    }
}
