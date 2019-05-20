package com.restaurant.Controller.Order;


import com.restaurant.Domain.Order.Order;
import com.restaurant.Factory.Order.OrderFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.web.client.HttpClientErrorException;

import java.text.SimpleDateFormat;
import java.util.Date;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class OrderControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/restaurant/order";

    @Test
    public void testGetAllOrder() {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/getall", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetOrderByURI() {
        Order order = restTemplate.getForObject(baseURL + "/read/Beef Burger", Order.class);
        System.out.println(order.getOrder_name());
        assertNotNull(order);
    }

    @Ignore
    public void testCreateOrder() {
        Date dt = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String order_date = formatter.format(dt);
        Order order = OrderFactory.getOrder(1, "Medium rare", "Beef Burger", "Table One", "Banele", "In-progress", order_date, 12.12);
        ResponseEntity<Order> postResponse = restTemplate.postForEntity(baseURL + "/create/{title}/{username}", order, Order.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateOrder() {
        int id = 1;
        Order order = restTemplate.getForObject(baseURL + "/update/" + id, Order.class);
        restTemplate.put(baseURL + "/update/" + id, order);
        Order updatedUserAccessRight = restTemplate.getForObject(baseURL + "/update/" + id, Order.class);
        assertNotNull(updatedUserAccessRight);
    }

    @Ignore
    public void testDeleteUserAccessRight() {
        int id = 1;
        Order order = restTemplate.getForObject(baseURL + "/delete/" + id, Order.class);
        assertNotNull(order);
        restTemplate.delete(baseURL + "/delete/" + id);
        try {
            order = restTemplate.getForObject(baseURL + "/delete/" + id, Order.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}
