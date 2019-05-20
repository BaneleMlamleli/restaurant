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

    //@PostMapping("/create/{title}/{name}/{surname}/{password}")
    @RequestMapping(value = "/create/{title}/{name}/{surname}/{password}", method = RequestMethod.POST)
    public //@ResponseBody
    RegisterNewUser create(@PathVariable String title, @PathVariable String name, @PathVariable String surname, @PathVariable String password){
        RegisterNewUser registerNewUser = RegisterNewUserFactory.getRegisterUser(title, name, surname, password);
        return service.create(registerNewUser);
    }

//    @GetMapping("/read/{id}")
//    @ResponseBody
    @RequestMapping(value = "/read/{id}", method = RequestMethod.GET)
    public RegisterNewUser read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/getall")
    @ResponseBody
    public Set<RegisterNewUser> getAll(){
        return service.getAll();
    }

    @PostMapping("/update")
    @ResponseBody
    public RegisterNewUser update(RegisterNewUser registerNewUser) {
        return service.update(registerNewUser);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
