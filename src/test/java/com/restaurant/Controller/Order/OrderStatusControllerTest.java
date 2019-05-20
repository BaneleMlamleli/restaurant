package com.restaurant.Controller.Order;

import com.restaurant.Domain.Order.OrderStatus;
import com.restaurant.Factory.Order.OrderStatusFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.web.client.HttpClientErrorException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class OrderStatusControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/restaurant/orderStatus";

    @Test
    public void testGetAllOrderStatus() {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/getall", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetOrderStatusByURI() {
        OrderStatus orderStatus = restTemplate.getForObject(baseURL + "/read/Banele", OrderStatus.class);
        System.out.println(orderStatus.getStatus());
        assertNotNull(orderStatus);
    }

    @Ignore
    public void testCreateOrderStatus() {
        OrderStatus orderStatus = OrderStatusFactory.getOrderStatus("In-progress");
        ResponseEntity<OrderStatus> postResponse = restTemplate.postForEntity(baseURL + "/create/In-progress", orderStatus, OrderStatus.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateOrderStatus() {
        int id = 1;
        OrderStatus orderStatus = restTemplate.getForObject(baseURL + "/update/" + id, OrderStatus.class);
        restTemplate.put(baseURL + "/update/" + id, orderStatus);
        OrderStatus updatedUserAccessRight = restTemplate.getForObject(baseURL + "/update/" + id, OrderStatus.class);
        assertNotNull(updatedUserAccessRight);
    }

    @Ignore
    public void testDeleteUserAccessRight() {
        int id = 1;
        OrderStatus orderStatus = restTemplate.getForObject(baseURL + "/delete/" + id, OrderStatus.class);
        assertNotNull(orderStatus);
        restTemplate.delete(baseURL + "/delete/" + id);
        try {
            orderStatus = restTemplate.getForObject(baseURL + "/delete/" + id, OrderStatus.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}
