/**
 * Created with IntelliJ IDEA.
 * User: satish
 * Date: 6/26/17
 * Time: 9:05 PM
 * To change this template use File | Settings | File Templates.
 */
import serviceImpl.ProductServiceImpl;

import javax.annotation.Resource;
import javax.xml.ws.Endpoint;

@Resource()
public class ProductServicePublisher {

    public static void main(String[] args) {

         //  The hardcoded urls can be configured based on property file and build script can
        //deploy different  property file for different environment
        System.out.println("Beginning to publish Product Details Service now");
        Endpoint.publish("http://127.0.0.1:9876/productDetail", new ProductServiceImpl());
        System.out.println("Done publishing");
    }
}