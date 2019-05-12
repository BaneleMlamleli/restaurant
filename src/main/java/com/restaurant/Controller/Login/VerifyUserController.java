package com.restaurant.Controller.Login;

import com.restaurant.Domain.Login.VerifyUser;
import com.restaurant.Factory.Login.VerifyUserFactory;
import com.restaurant.Service.Login.Implementation.VerifyUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("restaurant/verifyUser")
public class VerifyUserController {

    @Autowired
    private VerifyUserServiceImpl service;

    @GetMapping("/create/{title}/{username}/{password}")
    public @ResponseBody
    VerifyUser create(@PathVariable String title, @PathVariable String username, @PathVariable String password){
        VerifyUser verifyUser = VerifyUserFactory.getUserAccessRight(title, username, password);
        return service.create(verifyUser);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<VerifyUser> getAll(){
        return service.getAll();
    }
}
