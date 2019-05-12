package com.restaurant.Controller.Login;

import com.restaurant.Domain.Login.RegisterNewUser;
import com.restaurant.Factory.Login.RegisterNewUserFactory;
import com.restaurant.Service.Login.Implementation.RegisterNewUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("restaurant/registerNewUser")
public class RegisterNewUserController {
    @Autowired
    private RegisterNewUserServiceImpl service;

    @GetMapping("/create/{title}/{name}/{surname}/{password}")
    public @ResponseBody
    RegisterNewUser create(@PathVariable String title, @PathVariable String name, @PathVariable String surname, @PathVariable String password){
        RegisterNewUser registerNewUser = RegisterNewUserFactory.getRegisterUser(title, name, surname, password);
        return service.create(registerNewUser);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<RegisterNewUser> getAll(){
        return service.getAll();
    }
}
