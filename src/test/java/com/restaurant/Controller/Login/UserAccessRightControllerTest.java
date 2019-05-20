package com.restaurant.Controller.Login;

import com.restaurant.Domain.Login.UserAccessRight;
import com.restaurant.Factory.Login.UserAccessRightFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.web.client.HttpClientErrorException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class UserAccessRightControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/restaurant/userAccessRight";

    @Test
    public void testGetAllUserAccessRight() {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/getall", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetUserAccessByURI() {
        UserAccessRight userAccessRight = restTemplate.getForObject(baseURL + "/read/Banele", UserAccessRight.class);
        System.out.println(userAccessRight.getTitle());
        assertNotNull(userAccessRight);
    }

    @Ignore
    public void testCreateUserAccessRight() {
        UserAccessRight userAccessRight = UserAccessRightFactory.getUserAccessRight("Chef","Banele");
        ResponseEntity<UserAccessRight> postResponse = restTemplate.postForEntity(baseURL + "/create/{title}/{username}", userAccessRight, UserAccessRight.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateUserAccessRight() {
        String id = "Shaun";
        UserAccessRight userAccessRight = restTemplate.getForObject(baseURL + "/update/" + id, UserAccessRight.class);
        restTemplate.put(baseURL + "/update/" + id, userAccessRight);
        UserAccessRight updatedUserAccessRight = restTemplate.getForObject(baseURL + "/update/" + id, UserAccessRight.class);
        assertNotNull(updatedUserAccessRight);
    }

    @Ignore
    public void testDeleteUserAccessRight() {
        String id = "Banele";
        UserAccessRight registerNewUser = restTemplate.getForObject(baseURL + "/delete/" + id, UserAccessRight.class);
        assertNotNull(registerNewUser);
        restTemplate.delete(baseURL + "/delete/" + id);
        try {
            registerNewUser = restTemplate.getForObject(baseURL + "/delete/" + id, UserAccessRight.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}
