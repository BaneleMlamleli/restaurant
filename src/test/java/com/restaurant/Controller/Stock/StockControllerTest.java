package com.restaurant.Controller.Stock;

import com.restaurant.Domain.Stock.Stock;
import com.restaurant.Factory.Stock.StockFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.web.client.HttpClientErrorException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class StockControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/restaurant/stock";

    @Test
    public void testGetAllStock() {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/getall", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetStockByURI() {
        Stock stock = restTemplate.getForObject(baseURL + "/read/Banele", Stock.class);
        System.out.println(stock.toString());
        assertNotNull(stock);
    }

    @Ignore
    public void testCreateStock() {
        Stock stock = StockFactory.getStock("Beef patty", 23);
        ResponseEntity<Stock> postResponse = restTemplate.postForEntity(baseURL + "/create/{itemName}/{usage}", stock, Stock.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateStock() {
        String id = "Chicken patty";
        Stock stock = restTemplate.getForObject(baseURL + "/update/" + id, Stock.class);
        restTemplate.put(baseURL + "/update/" + id, stock);
        Stock updatedUserAccessRight = restTemplate.getForObject(baseURL + "/update/" + id, Stock.class);
        assertNotNull(updatedUserAccessRight);
    }

    @Ignore
    public void testDeleteUserAccessRight() {
        String id = "Beef patty";
        Stock stock = restTemplate.getForObject(baseURL + "/delete/" + id, Stock.class);
        assertNotNull(stock);
        restTemplate.delete(baseURL + "/delete/" + id);
        try {
            stock = restTemplate.getForObject(baseURL + "/delete/" + id, Stock.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}
