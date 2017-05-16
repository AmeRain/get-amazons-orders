package ru.amerain.amazonsorders;

import com.amazonservices.mws.orders._2013_09_01.MarketplaceWebServiceOrdersAsyncClient;
import com.amazonservices.mws.orders._2013_09_01.MarketplaceWebServiceOrdersConfig;
import com.amazonservices.mws.orders._2013_09_01.model.GetOrderRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.amerain.amazonsorders.domain.services.MVSConfiguration;
import ru.amerain.amazonsorders.domain.services.OrderManager;

@Configuration
public class ContextConfig {

    @Bean
    public OrderManager getOrderManager(){
        OrderManager orderManager = new OrderManager();
        orderManager.setRequest(getOrderRequest());
        return orderManager;
    }
    @Bean
    public GetOrderRequest getOrderRequest(){
        GetOrderRequest request = new GetOrderRequest();
        request.setSellerId("");
        request.setMWSAuthToken("");
        return request;
    }
    @Bean
    public MarketplaceWebServiceOrdersConfig getConfig(){
        return new MarketplaceWebServiceOrdersConfig();
    }
    @Bean
    public MarketplaceWebServiceOrdersAsyncClient getClient(){
        return new MarketplaceWebServiceOrdersAsyncClient("accessKey", "secretKey",
                          "appName", "appVersion", getConfig(), null);
    }
    @Bean
    public MVSConfiguration getMVSConfig(){
       return new MVSConfiguration();
     //  configuration.setClient();
    }
}
