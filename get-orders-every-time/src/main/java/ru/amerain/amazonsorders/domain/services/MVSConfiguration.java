package ru.amerain.amazonsorders.domain.services;

import com.amazonservices.mws.orders._2013_09_01.MarketplaceWebServiceOrdersAsyncClient;
import com.amazonservices.mws.orders._2013_09_01.MarketplaceWebServiceOrdersClient;
import com.amazonservices.mws.orders._2013_09_01.MarketplaceWebServiceOrdersConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
//public class MVSConfiguration {
////    /** Developer AWS access key. */
////    private static final String accessKey = "replaceWithAccessKey";
////
////    /** Developer AWS secret key. */
////    private static final String secretKey = "replaceWithSecretKey";
////
////    /** The client application name. */
////    private static final String appName = "replaceWithAppName";
////
////    /** The client application version. */
////    private static final String appVersion = "replaceWithAppVersion";
////
////    /**
////     * The endpoint for region service and version.
////     * ex: serviceURL = MWSEndpoint.NA_PROD.toString();
////     */
////    private static final String serviceURL = "replaceWithServiceURL";
////
////    /** The client, lazy initialized. Async client is also a sync client. */
//
//    private  MarketplaceWebServiceOrdersAsyncClient client;
//
//    private  MarketplaceWebServiceOrdersConfig config;
//
//
//    @Autowired
//    public void setConfig(MarketplaceWebServiceOrdersConfig config){
//        this.config = config;
//    }
//    @Autowired
//    public void setClient(MarketplaceWebServiceOrdersAsyncClient client){
//        this.client = client;
//    }
//    public MarketplaceWebServiceOrdersAsyncClient getClient(){
//        return client;
//    }
//}
