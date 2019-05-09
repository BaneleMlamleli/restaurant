package com.restaurant.Service.Login.Implementation;

import com.restaurant.Domain.Login.RegisterNewUser;
import com.restaurant.Repository.Implementation.LoginImplementation.RegisterNewUserImplementation;
import com.restaurant.Repository.Login.RegisterNewUserRepository;
import com.restaurant.Service.Login.RegisterNewUserService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RegisterNewUserServiceImpl implements RegisterNewUserService {

    private static RegisterNewUserServiceImpl service = null;
    private RegisterNewUserRepository repository;

    private RegisterNewUserServiceImpl() {
        this.repository = RegisterNewUserImplementation.getRepository();
    }

    public static RegisterNewUserServiceImpl getService(){
        if (service == null) service = new RegisterNewUserServiceImpl();
        return service;
    }

    @Override
    public RegisterNewUser create(RegisterNewUser registerNewUser) {
        return this.repository.create(registerNewUser);
    }

    @Override
    public RegisterNewUser update(RegisterNewUser course) {
        return this.repository.update(course);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public RegisterNewUser read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<RegisterNewUser> getAll() {
        return this.repository.getAll();
    }
}
