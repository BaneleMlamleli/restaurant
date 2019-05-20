package com.restaurant.Controller.Order;

import com.restaurant.Domain.Order.TakeOrder;
import com.restaurant.Factory.Order.TakeOrderFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.web.client.HttpClientErrorException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class TakeOrderControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/restaurant/takeOrder";

    @Test
    public void testGetAllTakeOrder() {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/getall", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetTakeOrderByURI() {
        TakeOrder takeOrder = restTemplate.getForObject(baseURL + "/read/Banele", TakeOrder.class);
        System.out.println(takeOrder.toString());
        assertNotNull(takeOrder);
    }

    @Ignore
    public void testCreateTakeOrder() {
        TakeOrder takeOrder = TakeOrderFactory.getTakeOrder(true, "Beef Burger");
        ResponseEntity<TakeOrder> postResponse = restTemplate.postForEntity(baseURL + "/create/{selectedRadioButtonItem}/{order_name}", takeOrder, TakeOrder.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateTakeOrder() {
        String id = "Shaun";
        TakeOrder takeOrder = restTemplate.getForObject(baseURL + "/update/" + id, TakeOrder.class);
        restTemplate.put(baseURL + "/update/" + id, takeOrder);
        TakeOrder updatedUserAccessRight = restTemplate.getForObject(baseURL + "/update/" + id, TakeOrder.class);
        assertNotNull(updatedUserAccessRight);
    }

    @Ignore
    public void testDeleteUserAccessRight() {
        String id = "Banele";
        TakeOrder takeOrder = restTemplate.getForObject(baseURL + "/delete/" + id, TakeOrder.class);
        assertNotNull(takeOrder);
        restTemplate.delete(baseURL + "/delete/" + id);
        try {
            takeOrder = restTemplate.getForObject(baseURL + "/delete/" + id, TakeOrder.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}
