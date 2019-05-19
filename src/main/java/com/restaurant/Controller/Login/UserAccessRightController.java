package com.restaurant.Controller.Login;

import com.restaurant.Domain.Login.UserAccessRight;
import com.restaurant.Factory.Login.UserAccessRightFactory;
import com.restaurant.Service.Login.Implementation.UserAccessRightServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/restaurant/userAccessRight")
public class UserAccessRightController {

    @Autowired
    private UserAccessRightServiceImpl service;

    @PostMapping("/create/{title}/{username}")
    public @ResponseBody
    UserAccessRight create(@PathVariable String title, @PathVariable String username){
        UserAccessRight userAccessRight = UserAccessRightFactory.getUserAccessRight(title, username);
        return service.create(userAccessRight);
    }

    @GetMapping("/read/getall")
    @ResponseBody
    public Set<UserAccessRight> getAll(){
        return service.getAll();
    }

    @PostMapping("/update")
    @ResponseBody
    public UserAccessRight update(UserAccessRight userAccessRight) {
        return service.update(userAccessRight);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
