package com.restaurant.Service.Login.Implementation;

import com.restaurant.Domain.Login.RegisterNewUser;
import com.restaurant.Repository.Login.RegisterNewUserRepository;
import com.restaurant.Service.Login.RegisterNewUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class RegisterNewUserServiceImpl implements RegisterNewUserService {

    private static RegisterNewUserServiceImpl service = null;
    @Autowired
    private RegisterNewUserRepository registerNewUserRepository;

    private RegisterNewUserServiceImpl() {
//        this.registerNewUserRepository = RegisterNewUserImplementation.getRepository();
    }

    public static RegisterNewUserServiceImpl getService(){
        if (service == null) service = new RegisterNewUserServiceImpl();
        return service;
    }

    @Override
    public RegisterNewUser create(RegisterNewUser registerNewUser) {
        return this.registerNewUserRepository.save(registerNewUser);
    }

    @Override
    public RegisterNewUser update(RegisterNewUser course) {
        return this.registerNewUserRepository.save(course);
    }

    @Override
    public void delete(String s) {
        this.registerNewUserRepository.deleteById(s);
    }

    @Override
    public RegisterNewUser read(String s) {
        Optional<RegisterNewUser> regNewUser = this.registerNewUserRepository.findById(s);
        return regNewUser.orElse(null);
    }

    @Override
    public Set<RegisterNewUser> getAll() {
        return (Set<RegisterNewUser>) this.registerNewUserRepository.findAll();
        //return this.repository.getAll();
    }
}
