package com.restaurant.Controller.Login;

import com.restaurant.Domain.Login.VerifyUser;
import com.restaurant.Factory.Login.VerifyUserFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.web.client.HttpClientErrorException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class VerifyUserControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/restaurant/verifyUser";

    @Test
    public void testGetAllVerifyUser() {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/getall", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetVerifyUserByURI() {
        VerifyUser verifyUser = restTemplate.getForObject(baseURL + "/read/Banele", VerifyUser.class);
        System.out.println(verifyUser.getTitle());
        assertNotNull(verifyUser);
    }

    @Ignore
    public void testCreateVerifyUser() {
        VerifyUser verifyUser = VerifyUserFactory.getUserAccessRight("Chef","Banele", "Test01");
        ResponseEntity<VerifyUser> postResponse = restTemplate.postForEntity(baseURL + "/create/{title}/{username}", verifyUser, VerifyUser.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateVerifyUser() {
        String id = "Shaun";
        VerifyUser verifyUser = restTemplate.getForObject(baseURL + "/update/" + id, VerifyUser.class);
        restTemplate.put(baseURL + "/update/" + id, verifyUser);
        VerifyUser updatedUserAccessRight = restTemplate.getForObject(baseURL + "/update/" + id, VerifyUser.class);
        assertNotNull(updatedUserAccessRight);
    }

    @Ignore
    public void testDeleteUserAccessRight() {
        String id = "Banele";
        VerifyUser verifyUser = restTemplate.getForObject(baseURL + "/delete/" + id, VerifyUser.class);
        assertNotNull(verifyUser);
        restTemplate.delete(baseURL + "/delete/" + id);
        try {
            verifyUser = restTemplate.getForObject(baseURL + "/delete/" + id, VerifyUser.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}
