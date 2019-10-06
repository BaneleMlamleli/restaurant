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
    private UserAccessRightServiceImpl userAccessRightServiceImpl;

    @PostMapping("/create/{title}/{username}")
    public @ResponseBody
    UserAccessRight create(@PathVariable String title, @PathVariable String username){
        UserAccessRight userAccessRight = UserAccessRightFactory.getUserAccessRight(title, username);
        return userAccessRightServiceImpl.create(userAccessRight);
    }

    @GetMapping("/read/getall")
    @ResponseBody
    public Set<UserAccessRight> getAll(){
        return userAccessRightServiceImpl.getAll();
    }

    @PostMapping("/update")
    @ResponseBody
    public UserAccessRight update(UserAccessRight userAccessRight) {
        return userAccessRightServiceImpl.update(userAccessRight);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        userAccessRightServiceImpl.delete(id);
    }
}
