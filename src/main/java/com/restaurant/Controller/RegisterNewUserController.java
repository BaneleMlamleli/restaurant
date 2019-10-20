package com.restaurant.Controller;

import com.restaurant.Domain.RegisterNewUser;
import com.restaurant.Repository.RegisterNewUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

//@RestController
@Controller
public class RegisterNewUserController {
    @Autowired
    private RegisterNewUserRepository registerNewUserRepository;

    @PostMapping("/create")
    public String saveUser(RegisterNewUser registerNewUser){
        registerNewUserRepository.save(registerNewUser);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String deleteUser(RegisterNewUser registerNewUser){
        registerNewUserRepository.delete(registerNewUser);
        return "redirect:/";
    }

//    @GetMapping("/findOneUser")
//    @ResponseBody
//    public List<RegisterNewUser> findOne(Integer id){
//        return registerNewUserRepository.findOne(id)
//    }

    @GetMapping("/findAllUser")
    @ResponseBody
    public List<RegisterNewUser> findAllUsers(){
        return registerNewUserRepository.findAll();
    }
//
//    //@PostMapping("/create/{title}/{name}/{surname}/{password}")
//    @RequestMapping(value = "/create/{title}/{name}/{surname}/{password}", method = RequestMethod.POST)
//    public //@ResponseBody
//    RegisterNewUser create(@PathVariable String title, @PathVariable String name, @PathVariable String surname, @PathVariable String password){
//        RegisterNewUser registerNewUser = RegisterNewUserFactory.getRegisterUser(title, name, surname, password);
//        return service.create(registerNewUser);
//    }
//
//    //    @GetMapping("/read/{id}")
////    @ResponseBody
//    @RequestMapping(value = "/read/{id}", method = RequestMethod.GET)
//    public RegisterNewUser read(@PathVariable String id) {
//        return service.read(id);
//    }
//
//    @GetMapping("/read/getall")
//    @ResponseBody
//    public Set<RegisterNewUser> getAll(){
//        return service.getAll();
//    }
//
//    @PostMapping("/update")
//    @ResponseBody
//    public RegisterNewUser update(RegisterNewUser registerNewUser) {
//        return service.update(registerNewUser);
//    }
//
//    @GetMapping("/delete/{id}")
//    @ResponseBody
//    public void delete(@PathVariable String id) {
//        service.delete(id);
//    }
}
