package com.restaurant.Controller.Login;

import com.restaurant.Domain.Login.RegisterNewUser;
import com.restaurant.Factory.Login.RegisterNewUserFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

@RunWith(SpringRunner.class)
public class RegisterNewUserControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/restaurant/registerNewUser";

    @Test
    public void testGetAllRegisterNewUser() {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/getall", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetRegisterNewUserByURI() {
        RegisterNewUser registerNewUser = restTemplate.getForObject(baseURL + "/read/Banele", RegisterNewUser.class);
        System.out.println(registerNewUser.getName());
        assertNotNull(registerNewUser);
    }

    @Ignore
    public void testCreateRegisterNewUser() {
        RegisterNewUser registerNewUser = RegisterNewUserFactory.getRegisterUser("Chef","Banele","Mlamleli", "Test01");
        ResponseEntity<RegisterNewUser> postResponse = restTemplate.postForEntity(baseURL + "/create/{title}/{name}/{surname}/{password}", registerNewUser, RegisterNewUser.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateRegisterNewUser() {
        String id = "Hendrick";
        RegisterNewUser registerNewUser = restTemplate.getForObject(baseURL + "/update/" + id, RegisterNewUser.class);
        restTemplate.put(baseURL + "/update/" + id, registerNewUser);
        RegisterNewUser updatedRegisterNewUser = restTemplate.getForObject(baseURL + "/update/" + id, RegisterNewUser.class);
        assertNotNull(updatedRegisterNewUser);
    }

    @Ignore
    public void testDeleteRegisterNewUser() {
        String id = "Banele";
        RegisterNewUser registerNewUser = restTemplate.getForObject(baseURL + "/delete/" + id, RegisterNewUser.class);
        assertNotNull(registerNewUser);
        restTemplate.delete(baseURL + "/delete/" + id);
        try {
            registerNewUser = restTemplate.getForObject(baseURL + "/delete/" + id, RegisterNewUser.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}
